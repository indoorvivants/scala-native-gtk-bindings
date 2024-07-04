package sn.gnome.harfbuzz.internal

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

private[internal] trait CEnumU[T](using eq: T =:= UInt):
  given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
  extension (inline t: T)
   inline def int: CInt = eq.apply(t).toInt
   inline def uint: CUnsignedInt = eq.apply(t)
   inline def value: CUnsignedInt = eq.apply(t)
/**
 * hb_buffer_cluster_level_t: _BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES: Return cluster values grouped by graphemes into monotone order. _BUFFER_CLUSTER_LEVEL_MONOTONE_CHARACTERS: Return cluster values grouped into monotone order. _BUFFER_CLUSTER_LEVEL_CHARACTERS: Don't group cluster values. _BUFFER_CLUSTER_LEVEL_DEFAULT: Default cluster level, equal to _BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES.
*/
opaque type hb_buffer_cluster_level_t = CUnsignedInt
object hb_buffer_cluster_level_t extends CEnumU[hb_buffer_cluster_level_t]:
  given _tag: Tag[hb_buffer_cluster_level_t] = Tag.UInt
  inline def define(inline a: Long): hb_buffer_cluster_level_t = a.toUInt
  val HB_BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES = define(0)
  val HB_BUFFER_CLUSTER_LEVEL_MONOTONE_CHARACTERS = define(1)
  val HB_BUFFER_CLUSTER_LEVEL_CHARACTERS = define(2)
  val HB_BUFFER_CLUSTER_LEVEL_DEFAULT = define(0)
  inline def getName(inline value: hb_buffer_cluster_level_t): Option[String] =
    inline value match
      case HB_BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES => Some("HB_BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES")
      case HB_BUFFER_CLUSTER_LEVEL_MONOTONE_CHARACTERS => Some("HB_BUFFER_CLUSTER_LEVEL_MONOTONE_CHARACTERS")
      case HB_BUFFER_CLUSTER_LEVEL_CHARACTERS => Some("HB_BUFFER_CLUSTER_LEVEL_CHARACTERS")
      case HB_BUFFER_CLUSTER_LEVEL_DEFAULT => Some("HB_BUFFER_CLUSTER_LEVEL_DEFAULT")
      case _ => _root_.scala.None
  extension (a: hb_buffer_cluster_level_t)
    inline def &(b: hb_buffer_cluster_level_t): hb_buffer_cluster_level_t = a & b
    inline def |(b: hb_buffer_cluster_level_t): hb_buffer_cluster_level_t = a | b
    inline def is(b: hb_buffer_cluster_level_t): Boolean = (a & b) == b

/**
 * hb_buffer_content_type_t: _BUFFER_CONTENT_TYPE_INVALID: Initial value for new buffer. _BUFFER_CONTENT_TYPE_UNICODE: The buffer contains input characters (before shaping). _BUFFER_CONTENT_TYPE_GLYPHS: The buffer contains output glyphs (after shaping).
*/
opaque type hb_buffer_content_type_t = CUnsignedInt
object hb_buffer_content_type_t extends CEnumU[hb_buffer_content_type_t]:
  given _tag: Tag[hb_buffer_content_type_t] = Tag.UInt
  inline def define(inline a: Long): hb_buffer_content_type_t = a.toUInt
  val HB_BUFFER_CONTENT_TYPE_INVALID = define(0)
  val HB_BUFFER_CONTENT_TYPE_UNICODE = define(1)
  val HB_BUFFER_CONTENT_TYPE_GLYPHS = define(2)
  inline def getName(inline value: hb_buffer_content_type_t): Option[String] =
    inline value match
      case HB_BUFFER_CONTENT_TYPE_INVALID => Some("HB_BUFFER_CONTENT_TYPE_INVALID")
      case HB_BUFFER_CONTENT_TYPE_UNICODE => Some("HB_BUFFER_CONTENT_TYPE_UNICODE")
      case HB_BUFFER_CONTENT_TYPE_GLYPHS => Some("HB_BUFFER_CONTENT_TYPE_GLYPHS")
      case _ => _root_.scala.None
  extension (a: hb_buffer_content_type_t)
    inline def &(b: hb_buffer_content_type_t): hb_buffer_content_type_t = a & b
    inline def |(b: hb_buffer_content_type_t): hb_buffer_content_type_t = a | b
    inline def is(b: hb_buffer_content_type_t): Boolean = (a & b) == b

opaque type hb_buffer_diff_flags_t = CUnsignedInt
object hb_buffer_diff_flags_t extends CEnumU[hb_buffer_diff_flags_t]:
  given _tag: Tag[hb_buffer_diff_flags_t] = Tag.UInt
  inline def define(inline a: Long): hb_buffer_diff_flags_t = a.toUInt
  val HB_BUFFER_DIFF_FLAG_EQUAL = define(0)
  val HB_BUFFER_DIFF_FLAG_CONTENT_TYPE_MISMATCH = define(1)
  val HB_BUFFER_DIFF_FLAG_LENGTH_MISMATCH = define(2)
  val HB_BUFFER_DIFF_FLAG_NOTDEF_PRESENT = define(4)
  val HB_BUFFER_DIFF_FLAG_DOTTED_CIRCLE_PRESENT = define(8)
  val HB_BUFFER_DIFF_FLAG_CODEPOINT_MISMATCH = define(16)
  val HB_BUFFER_DIFF_FLAG_CLUSTER_MISMATCH = define(32)
  val HB_BUFFER_DIFF_FLAG_GLYPH_FLAGS_MISMATCH = define(64)
  val HB_BUFFER_DIFF_FLAG_POSITION_MISMATCH = define(128)
  inline def getName(inline value: hb_buffer_diff_flags_t): Option[String] =
    inline value match
      case HB_BUFFER_DIFF_FLAG_EQUAL => Some("HB_BUFFER_DIFF_FLAG_EQUAL")
      case HB_BUFFER_DIFF_FLAG_CONTENT_TYPE_MISMATCH => Some("HB_BUFFER_DIFF_FLAG_CONTENT_TYPE_MISMATCH")
      case HB_BUFFER_DIFF_FLAG_LENGTH_MISMATCH => Some("HB_BUFFER_DIFF_FLAG_LENGTH_MISMATCH")
      case HB_BUFFER_DIFF_FLAG_NOTDEF_PRESENT => Some("HB_BUFFER_DIFF_FLAG_NOTDEF_PRESENT")
      case HB_BUFFER_DIFF_FLAG_DOTTED_CIRCLE_PRESENT => Some("HB_BUFFER_DIFF_FLAG_DOTTED_CIRCLE_PRESENT")
      case HB_BUFFER_DIFF_FLAG_CODEPOINT_MISMATCH => Some("HB_BUFFER_DIFF_FLAG_CODEPOINT_MISMATCH")
      case HB_BUFFER_DIFF_FLAG_CLUSTER_MISMATCH => Some("HB_BUFFER_DIFF_FLAG_CLUSTER_MISMATCH")
      case HB_BUFFER_DIFF_FLAG_GLYPH_FLAGS_MISMATCH => Some("HB_BUFFER_DIFF_FLAG_GLYPH_FLAGS_MISMATCH")
      case HB_BUFFER_DIFF_FLAG_POSITION_MISMATCH => Some("HB_BUFFER_DIFF_FLAG_POSITION_MISMATCH")
      case _ => _root_.scala.None
  extension (a: hb_buffer_diff_flags_t)
    inline def &(b: hb_buffer_diff_flags_t): hb_buffer_diff_flags_t = a & b
    inline def |(b: hb_buffer_diff_flags_t): hb_buffer_diff_flags_t = a | b
    inline def is(b: hb_buffer_diff_flags_t): Boolean = (a & b) == b

/**
 * hb_buffer_flags_t: _BUFFER_FLAG_DEFAULT: the default buffer flag. _BUFFER_FLAG_BOT: flag indicating that special handling of the beginning of text paragraph can be applied to this buffer. Should usually be set, unless you are passing to the buffer only part of the text without the full context. _BUFFER_FLAG_EOT: flag indicating that special handling of the end of text paragraph can be applied to this buffer, similar to _BUFFER_FLAG_BOT. _BUFFER_FLAG_PRESERVE_DEFAULT_IGNORABLES: flag indication that character with Default_Ignorable Unicode property should use the corresponding glyph from the font, instead of hiding them (done by replacing them with the space glyph and zeroing the advance width.) This flag takes precedence over _BUFFER_FLAG_REMOVE_DEFAULT_IGNORABLES. _BUFFER_FLAG_REMOVE_DEFAULT_IGNORABLES: flag indication that character with Default_Ignorable Unicode property should be removed from glyph string instead of hiding them (done by replacing them with the space glyph and zeroing the advance width.) _BUFFER_FLAG_PRESERVE_DEFAULT_IGNORABLES takes precedence over this flag. Since: 1.8.0 _BUFFER_FLAG_DO_NOT_INSERT_DOTTED_CIRCLE: flag indicating that a dotted circle should not be inserted in the rendering of incorrect character sequences (such at <0905 093E>). Since: 2.4
*/
opaque type hb_buffer_flags_t = CUnsignedInt
object hb_buffer_flags_t extends CEnumU[hb_buffer_flags_t]:
  given _tag: Tag[hb_buffer_flags_t] = Tag.UInt
  inline def define(inline a: Long): hb_buffer_flags_t = a.toUInt
  val HB_BUFFER_FLAG_DEFAULT = define(0)
  val HB_BUFFER_FLAG_BOT = define(1)
  val HB_BUFFER_FLAG_EOT = define(2)
  val HB_BUFFER_FLAG_PRESERVE_DEFAULT_IGNORABLES = define(4)
  val HB_BUFFER_FLAG_REMOVE_DEFAULT_IGNORABLES = define(8)
  val HB_BUFFER_FLAG_DO_NOT_INSERT_DOTTED_CIRCLE = define(16)
  inline def getName(inline value: hb_buffer_flags_t): Option[String] =
    inline value match
      case HB_BUFFER_FLAG_DEFAULT => Some("HB_BUFFER_FLAG_DEFAULT")
      case HB_BUFFER_FLAG_BOT => Some("HB_BUFFER_FLAG_BOT")
      case HB_BUFFER_FLAG_EOT => Some("HB_BUFFER_FLAG_EOT")
      case HB_BUFFER_FLAG_PRESERVE_DEFAULT_IGNORABLES => Some("HB_BUFFER_FLAG_PRESERVE_DEFAULT_IGNORABLES")
      case HB_BUFFER_FLAG_REMOVE_DEFAULT_IGNORABLES => Some("HB_BUFFER_FLAG_REMOVE_DEFAULT_IGNORABLES")
      case HB_BUFFER_FLAG_DO_NOT_INSERT_DOTTED_CIRCLE => Some("HB_BUFFER_FLAG_DO_NOT_INSERT_DOTTED_CIRCLE")
      case _ => _root_.scala.None
  extension (a: hb_buffer_flags_t)
    inline def &(b: hb_buffer_flags_t): hb_buffer_flags_t = a & b
    inline def |(b: hb_buffer_flags_t): hb_buffer_flags_t = a | b
    inline def is(b: hb_buffer_flags_t): Boolean = (a & b) == b

/**
 * hb_buffer_serialize_flags_t: _BUFFER_SERIALIZE_FLAG_DEFAULT: serialize glyph names, clusters and positions. _BUFFER_SERIALIZE_FLAG_NO_CLUSTERS: do not serialize glyph cluster. _BUFFER_SERIALIZE_FLAG_NO_POSITIONS: do not serialize glyph position information. _BUFFER_SERIALIZE_FLAG_NO_GLYPH_NAMES: do no serialize glyph name. _BUFFER_SERIALIZE_FLAG_GLYPH_EXTENTS: serialize glyph extents. _BUFFER_SERIALIZE_FLAG_GLYPH_FLAGS: serialize glyph flags. Since: 1.5.0 _BUFFER_SERIALIZE_FLAG_NO_ADVANCES: do not serialize glyph advances, glyph offsets will reflect absolute glyph positions. Since: 1.8.0
*/
opaque type hb_buffer_serialize_flags_t = CUnsignedInt
object hb_buffer_serialize_flags_t extends CEnumU[hb_buffer_serialize_flags_t]:
  given _tag: Tag[hb_buffer_serialize_flags_t] = Tag.UInt
  inline def define(inline a: Long): hb_buffer_serialize_flags_t = a.toUInt
  val HB_BUFFER_SERIALIZE_FLAG_DEFAULT = define(0)
  val HB_BUFFER_SERIALIZE_FLAG_NO_CLUSTERS = define(1)
  val HB_BUFFER_SERIALIZE_FLAG_NO_POSITIONS = define(2)
  val HB_BUFFER_SERIALIZE_FLAG_NO_GLYPH_NAMES = define(4)
  val HB_BUFFER_SERIALIZE_FLAG_GLYPH_EXTENTS = define(8)
  val HB_BUFFER_SERIALIZE_FLAG_GLYPH_FLAGS = define(16)
  val HB_BUFFER_SERIALIZE_FLAG_NO_ADVANCES = define(32)
  inline def getName(inline value: hb_buffer_serialize_flags_t): Option[String] =
    inline value match
      case HB_BUFFER_SERIALIZE_FLAG_DEFAULT => Some("HB_BUFFER_SERIALIZE_FLAG_DEFAULT")
      case HB_BUFFER_SERIALIZE_FLAG_NO_CLUSTERS => Some("HB_BUFFER_SERIALIZE_FLAG_NO_CLUSTERS")
      case HB_BUFFER_SERIALIZE_FLAG_NO_POSITIONS => Some("HB_BUFFER_SERIALIZE_FLAG_NO_POSITIONS")
      case HB_BUFFER_SERIALIZE_FLAG_NO_GLYPH_NAMES => Some("HB_BUFFER_SERIALIZE_FLAG_NO_GLYPH_NAMES")
      case HB_BUFFER_SERIALIZE_FLAG_GLYPH_EXTENTS => Some("HB_BUFFER_SERIALIZE_FLAG_GLYPH_EXTENTS")
      case HB_BUFFER_SERIALIZE_FLAG_GLYPH_FLAGS => Some("HB_BUFFER_SERIALIZE_FLAG_GLYPH_FLAGS")
      case HB_BUFFER_SERIALIZE_FLAG_NO_ADVANCES => Some("HB_BUFFER_SERIALIZE_FLAG_NO_ADVANCES")
      case _ => _root_.scala.None
  extension (a: hb_buffer_serialize_flags_t)
    inline def &(b: hb_buffer_serialize_flags_t): hb_buffer_serialize_flags_t = a & b
    inline def |(b: hb_buffer_serialize_flags_t): hb_buffer_serialize_flags_t = a | b
    inline def is(b: hb_buffer_serialize_flags_t): Boolean = (a & b) == b

/**
 * hb_buffer_serialize_format_t: _BUFFER_SERIALIZE_FORMAT_TEXT: a human-readable, plain text format. _BUFFER_SERIALIZE_FORMAT_JSON: a machine-readable JSON format. _BUFFER_SERIALIZE_FORMAT_INVALID: invalid format.
*/
opaque type hb_buffer_serialize_format_t = CUnsignedInt
object hb_buffer_serialize_format_t extends CEnumU[hb_buffer_serialize_format_t]:
  given _tag: Tag[hb_buffer_serialize_format_t] = Tag.UInt
  inline def define(inline a: Long): hb_buffer_serialize_format_t = a.toUInt
  val HB_BUFFER_SERIALIZE_FORMAT_TEXT = define(1413830740)
  val HB_BUFFER_SERIALIZE_FORMAT_JSON = define(1246973774)
  val HB_BUFFER_SERIALIZE_FORMAT_INVALID = define(0)
  inline def getName(inline value: hb_buffer_serialize_format_t): Option[String] =
    inline value match
      case HB_BUFFER_SERIALIZE_FORMAT_TEXT => Some("HB_BUFFER_SERIALIZE_FORMAT_TEXT")
      case HB_BUFFER_SERIALIZE_FORMAT_JSON => Some("HB_BUFFER_SERIALIZE_FORMAT_JSON")
      case HB_BUFFER_SERIALIZE_FORMAT_INVALID => Some("HB_BUFFER_SERIALIZE_FORMAT_INVALID")
      case _ => _root_.scala.None
  extension (a: hb_buffer_serialize_format_t)
    inline def &(b: hb_buffer_serialize_format_t): hb_buffer_serialize_format_t = a & b
    inline def |(b: hb_buffer_serialize_format_t): hb_buffer_serialize_format_t = a | b
    inline def is(b: hb_buffer_serialize_format_t): Boolean = (a & b) == b

/**
 * hb_direction_t: _DIRECTION_INVALID: Initial, unset direction. _DIRECTION_LTR: Text is set horizontally from left to right. _DIRECTION_RTL: Text is set horizontally from right to left. _DIRECTION_TTB: Text is set vertically from top to bottom. _DIRECTION_BTT: Text is set vertically from bottom to top.
*/
opaque type hb_direction_t = CUnsignedInt
object hb_direction_t extends CEnumU[hb_direction_t]:
  given _tag: Tag[hb_direction_t] = Tag.UInt
  inline def define(inline a: Long): hb_direction_t = a.toUInt
  val HB_DIRECTION_INVALID = define(0)
  val HB_DIRECTION_LTR = define(4)
  val HB_DIRECTION_RTL = define(5)
  val HB_DIRECTION_TTB = define(6)
  val HB_DIRECTION_BTT = define(7)
  inline def getName(inline value: hb_direction_t): Option[String] =
    inline value match
      case HB_DIRECTION_INVALID => Some("HB_DIRECTION_INVALID")
      case HB_DIRECTION_LTR => Some("HB_DIRECTION_LTR")
      case HB_DIRECTION_RTL => Some("HB_DIRECTION_RTL")
      case HB_DIRECTION_TTB => Some("HB_DIRECTION_TTB")
      case HB_DIRECTION_BTT => Some("HB_DIRECTION_BTT")
      case _ => _root_.scala.None
  extension (a: hb_direction_t)
    inline def &(b: hb_direction_t): hb_direction_t = a & b
    inline def |(b: hb_direction_t): hb_direction_t = a | b
    inline def is(b: hb_direction_t): Boolean = (a & b) == b

/**
 * hb_glyph_flags_t: _GLYPH_FLAG_UNSAFE_TO_BREAK: Indicates that if input text is broken at the beginning of the cluster this glyph is part of, then both sides need to be re-shaped, as the result might be different. On the flip side, it means that when this flag is not present, then it's safe to break the glyph-run at the beginning of this cluster, and the two sides represent the exact same result one would get if breaking input text at the beginning of this cluster and shaping the two sides separately. This can be used to optimize paragraph layout, by avoiding re-shaping of each line after line-breaking, or limiting the reshaping to a small piece around the breaking point only. _GLYPH_FLAG_DEFINED: All the currently defined flags.
*/
opaque type hb_glyph_flags_t = CUnsignedInt
object hb_glyph_flags_t extends CEnumU[hb_glyph_flags_t]:
  given _tag: Tag[hb_glyph_flags_t] = Tag.UInt
  inline def define(inline a: Long): hb_glyph_flags_t = a.toUInt
  val HB_GLYPH_FLAG_UNSAFE_TO_BREAK = define(1)
  val HB_GLYPH_FLAG_DEFINED = define(1)
  inline def getName(inline value: hb_glyph_flags_t): Option[String] =
    inline value match
      case HB_GLYPH_FLAG_UNSAFE_TO_BREAK => Some("HB_GLYPH_FLAG_UNSAFE_TO_BREAK")
      case HB_GLYPH_FLAG_DEFINED => Some("HB_GLYPH_FLAG_DEFINED")
      case _ => _root_.scala.None
  extension (a: hb_glyph_flags_t)
    inline def &(b: hb_glyph_flags_t): hb_glyph_flags_t = a & b
    inline def |(b: hb_glyph_flags_t): hb_glyph_flags_t = a | b
    inline def is(b: hb_glyph_flags_t): Boolean = (a & b) == b

/**
 * hb_memory_mode_t: _MEMORY_MODE_DUPLICATE _MEMORY_MODE_READONLY _MEMORY_MODE_WRITABLE _MEMORY_MODE_READONLY_MAY_MAKE_WRITABLE
*/
opaque type hb_memory_mode_t = CUnsignedInt
object hb_memory_mode_t extends CEnumU[hb_memory_mode_t]:
  given _tag: Tag[hb_memory_mode_t] = Tag.UInt
  inline def define(inline a: Long): hb_memory_mode_t = a.toUInt
  val HB_MEMORY_MODE_DUPLICATE = define(0)
  val HB_MEMORY_MODE_READONLY = define(1)
  val HB_MEMORY_MODE_WRITABLE = define(2)
  val HB_MEMORY_MODE_READONLY_MAY_MAKE_WRITABLE = define(3)
  inline def getName(inline value: hb_memory_mode_t): Option[String] =
    inline value match
      case HB_MEMORY_MODE_DUPLICATE => Some("HB_MEMORY_MODE_DUPLICATE")
      case HB_MEMORY_MODE_READONLY => Some("HB_MEMORY_MODE_READONLY")
      case HB_MEMORY_MODE_WRITABLE => Some("HB_MEMORY_MODE_WRITABLE")
      case HB_MEMORY_MODE_READONLY_MAY_MAKE_WRITABLE => Some("HB_MEMORY_MODE_READONLY_MAY_MAKE_WRITABLE")
      case _ => _root_.scala.None
  extension (a: hb_memory_mode_t)
    inline def &(b: hb_memory_mode_t): hb_memory_mode_t = a & b
    inline def |(b: hb_memory_mode_t): hb_memory_mode_t = a | b
    inline def is(b: hb_memory_mode_t): Boolean = (a & b) == b

/**
 * hb_script_t: _SCRIPT_COMMON: HB_TAG ('Z','y','y','y') _SCRIPT_INHERITED: HB_TAG ('Z','i','n','h') _SCRIPT_UNKNOWN: HB_TAG ('Z','z','z','z') _SCRIPT_ARABIC _SCRIPT_ARMENIAN _SCRIPT_BENGALI _SCRIPT_CYRILLIC _SCRIPT_DEVANAGARI _SCRIPT_GEORGIAN _SCRIPT_GREEK _SCRIPT_GUJARATI _SCRIPT_GURMUKHI _SCRIPT_HANGUL _SCRIPT_HAN _SCRIPT_HEBREW _SCRIPT_HIRAGANA _SCRIPT_KANNADA _SCRIPT_KATAKANA _SCRIPT_LAO _SCRIPT_LATIN _SCRIPT_MALAYALAM _SCRIPT_ORIYA _SCRIPT_TAMIL _SCRIPT_TELUGU _SCRIPT_THAI _SCRIPT_TIBETAN _SCRIPT_BOPOMOFO _SCRIPT_BRAILLE _SCRIPT_CANADIAN_SYLLABICS _SCRIPT_CHEROKEE _SCRIPT_ETHIOPIC _SCRIPT_KHMER _SCRIPT_MONGOLIAN _SCRIPT_MYANMAR _SCRIPT_OGHAM _SCRIPT_RUNIC _SCRIPT_SINHALA _SCRIPT_SYRIAC _SCRIPT_THAANA _SCRIPT_YI _SCRIPT_DESERET _SCRIPT_GOTHIC _SCRIPT_OLD_ITALIC _SCRIPT_BUHID _SCRIPT_HANUNOO _SCRIPT_TAGALOG _SCRIPT_TAGBANWA _SCRIPT_CYPRIOT _SCRIPT_LIMBU _SCRIPT_LINEAR_B _SCRIPT_OSMANYA _SCRIPT_SHAVIAN _SCRIPT_TAI_LE _SCRIPT_UGARITIC _SCRIPT_BUGINESE _SCRIPT_COPTIC _SCRIPT_GLAGOLITIC _SCRIPT_KHAROSHTHI _SCRIPT_NEW_TAI_LUE _SCRIPT_OLD_PERSIAN _SCRIPT_SYLOTI_NAGRI _SCRIPT_TIFINAGH _SCRIPT_BALINESE _SCRIPT_CUNEIFORM _SCRIPT_NKO _SCRIPT_PHAGS_PA _SCRIPT_PHOENICIAN _SCRIPT_CARIAN _SCRIPT_CHAM _SCRIPT_KAYAH_LI _SCRIPT_LEPCHA _SCRIPT_LYCIAN _SCRIPT_LYDIAN _SCRIPT_OL_CHIKI _SCRIPT_REJANG _SCRIPT_SAURASHTRA _SCRIPT_SUNDANESE _SCRIPT_VAI _SCRIPT_AVESTAN _SCRIPT_BAMUM _SCRIPT_EGYPTIAN_HIEROGLYPHS _SCRIPT_IMPERIAL_ARAMAIC _SCRIPT_INSCRIPTIONAL_PAHLAVI _SCRIPT_INSCRIPTIONAL_PARTHIAN _SCRIPT_JAVANESE _SCRIPT_KAITHI _SCRIPT_LISU _SCRIPT_MEETEI_MAYEK _SCRIPT_OLD_SOUTH_ARABIAN _SCRIPT_OLD_TURKIC _SCRIPT_SAMARITAN _SCRIPT_TAI_THAM _SCRIPT_TAI_VIET _SCRIPT_BATAK _SCRIPT_BRAHMI _SCRIPT_MANDAIC _SCRIPT_CHAKMA _SCRIPT_MEROITIC_CURSIVE _SCRIPT_MEROITIC_HIEROGLYPHS _SCRIPT_MIAO _SCRIPT_SHARADA _SCRIPT_SORA_SOMPENG _SCRIPT_TAKRI _SCRIPT_BASSA_VAH _SCRIPT_CAUCASIAN_ALBANIAN _SCRIPT_DUPLOYAN _SCRIPT_ELBASAN _SCRIPT_GRANTHA _SCRIPT_KHOJKI _SCRIPT_KHUDAWADI _SCRIPT_LINEAR_A _SCRIPT_MAHAJANI _SCRIPT_MANICHAEAN _SCRIPT_MENDE_KIKAKUI _SCRIPT_MODI _SCRIPT_MRO _SCRIPT_NABATAEAN _SCRIPT_OLD_NORTH_ARABIAN _SCRIPT_OLD_PERMIC _SCRIPT_PAHAWH_HMONG _SCRIPT_PALMYRENE _SCRIPT_PAU_CIN_HAU _SCRIPT_PSALTER_PAHLAVI _SCRIPT_SIDDHAM _SCRIPT_TIRHUTA _SCRIPT_WARANG_CITI _SCRIPT_AHOM _SCRIPT_ANATOLIAN_HIEROGLYPHS _SCRIPT_HATRAN _SCRIPT_MULTANI _SCRIPT_OLD_HUNGARIAN _SCRIPT_SIGNWRITING _SCRIPT_ADLAM _SCRIPT_BHAIKSUKI _SCRIPT_MARCHEN _SCRIPT_OSAGE _SCRIPT_TANGUT _SCRIPT_NEWA _SCRIPT_MASARAM_GONDI _SCRIPT_NUSHU _SCRIPT_SOYOMBO _SCRIPT_ZANABAZAR_SQUARE _SCRIPT_DOGRA _SCRIPT_GUNJALA_GONDI _SCRIPT_HANIFI_ROHINGYA _SCRIPT_MAKASAR _SCRIPT_MEDEFAIDRIN _SCRIPT_OLD_SOGDIAN _SCRIPT_SOGDIAN _SCRIPT_ELYMAIC _SCRIPT_NANDINAGARI _SCRIPT_NYIAKENG_PUACHUE_HMONG _SCRIPT_WANCHO _SCRIPT_INVALID: #HB_TAG_NONE
*/
opaque type hb_script_t = CUnsignedInt
object hb_script_t extends CEnumU[hb_script_t]:
  given _tag: Tag[hb_script_t] = Tag.UInt
  inline def define(inline a: Long): hb_script_t = a.toUInt
  val HB_SCRIPT_COMMON = define(1517910393)
  val HB_SCRIPT_INHERITED = define(1516858984)
  val HB_SCRIPT_UNKNOWN = define(1517976186)
  val HB_SCRIPT_ARABIC = define(1098015074)
  val HB_SCRIPT_ARMENIAN = define(1098018158)
  val HB_SCRIPT_BENGALI = define(1113943655)
  val HB_SCRIPT_CYRILLIC = define(1132032620)
  val HB_SCRIPT_DEVANAGARI = define(1147500129)
  val HB_SCRIPT_GEORGIAN = define(1197830002)
  val HB_SCRIPT_GREEK = define(1198679403)
  val HB_SCRIPT_GUJARATI = define(1198877298)
  val HB_SCRIPT_GURMUKHI = define(1198879349)
  val HB_SCRIPT_HANGUL = define(1214344807)
  val HB_SCRIPT_HAN = define(1214344809)
  val HB_SCRIPT_HEBREW = define(1214603890)
  val HB_SCRIPT_HIRAGANA = define(1214870113)
  val HB_SCRIPT_KANNADA = define(1265525857)
  val HB_SCRIPT_KATAKANA = define(1264676449)
  val HB_SCRIPT_LAO = define(1281453935)
  val HB_SCRIPT_LATIN = define(1281455214)
  val HB_SCRIPT_MALAYALAM = define(1298954605)
  val HB_SCRIPT_ORIYA = define(1332902241)
  val HB_SCRIPT_TAMIL = define(1415671148)
  val HB_SCRIPT_TELUGU = define(1415933045)
  val HB_SCRIPT_THAI = define(1416126825)
  val HB_SCRIPT_TIBETAN = define(1416192628)
  val HB_SCRIPT_BOPOMOFO = define(1114599535)
  val HB_SCRIPT_BRAILLE = define(1114792297)
  val HB_SCRIPT_CANADIAN_SYLLABICS = define(1130458739)
  val HB_SCRIPT_CHEROKEE = define(1130915186)
  val HB_SCRIPT_ETHIOPIC = define(1165256809)
  val HB_SCRIPT_KHMER = define(1265134962)
  val HB_SCRIPT_MONGOLIAN = define(1299148391)
  val HB_SCRIPT_MYANMAR = define(1299803506)
  val HB_SCRIPT_OGHAM = define(1332175213)
  val HB_SCRIPT_RUNIC = define(1383427698)
  val HB_SCRIPT_SINHALA = define(1399418472)
  val HB_SCRIPT_SYRIAC = define(1400468067)
  val HB_SCRIPT_THAANA = define(1416126817)
  val HB_SCRIPT_YI = define(1500080489)
  val HB_SCRIPT_DESERET = define(1148416628)
  val HB_SCRIPT_GOTHIC = define(1198486632)
  val HB_SCRIPT_OLD_ITALIC = define(1232363884)
  val HB_SCRIPT_BUHID = define(1114990692)
  val HB_SCRIPT_HANUNOO = define(1214344815)
  val HB_SCRIPT_TAGALOG = define(1416064103)
  val HB_SCRIPT_TAGBANWA = define(1415669602)
  val HB_SCRIPT_CYPRIOT = define(1131442804)
  val HB_SCRIPT_LIMBU = define(1281977698)
  val HB_SCRIPT_LINEAR_B = define(1281977954)
  val HB_SCRIPT_OSMANYA = define(1332964705)
  val HB_SCRIPT_SHAVIAN = define(1399349623)
  val HB_SCRIPT_TAI_LE = define(1415670885)
  val HB_SCRIPT_UGARITIC = define(1432838514)
  val HB_SCRIPT_BUGINESE = define(1114990441)
  val HB_SCRIPT_COPTIC = define(1131376756)
  val HB_SCRIPT_GLAGOLITIC = define(1198285159)
  val HB_SCRIPT_KHAROSHTHI = define(1265131890)
  val HB_SCRIPT_NEW_TAI_LUE = define(1415670901)
  val HB_SCRIPT_OLD_PERSIAN = define(1483761007)
  val HB_SCRIPT_SYLOTI_NAGRI = define(1400466543)
  val HB_SCRIPT_TIFINAGH = define(1415999079)
  val HB_SCRIPT_BALINESE = define(1113681001)
  val HB_SCRIPT_CUNEIFORM = define(1483961720)
  val HB_SCRIPT_NKO = define(1315663727)
  val HB_SCRIPT_PHAGS_PA = define(1349017959)
  val HB_SCRIPT_PHOENICIAN = define(1349021304)
  val HB_SCRIPT_CARIAN = define(1130459753)
  val HB_SCRIPT_CHAM = define(1130914157)
  val HB_SCRIPT_KAYAH_LI = define(1264675945)
  val HB_SCRIPT_LEPCHA = define(1281716323)
  val HB_SCRIPT_LYCIAN = define(1283023721)
  val HB_SCRIPT_LYDIAN = define(1283023977)
  val HB_SCRIPT_OL_CHIKI = define(1332503403)
  val HB_SCRIPT_REJANG = define(1382706791)
  val HB_SCRIPT_SAURASHTRA = define(1398895986)
  val HB_SCRIPT_SUNDANESE = define(1400204900)
  val HB_SCRIPT_VAI = define(1449224553)
  val HB_SCRIPT_AVESTAN = define(1098281844)
  val HB_SCRIPT_BAMUM = define(1113681269)
  val HB_SCRIPT_EGYPTIAN_HIEROGLYPHS = define(1164409200)
  val HB_SCRIPT_IMPERIAL_ARAMAIC = define(1098018153)
  val HB_SCRIPT_INSCRIPTIONAL_PAHLAVI = define(1349020777)
  val HB_SCRIPT_INSCRIPTIONAL_PARTHIAN = define(1349678185)
  val HB_SCRIPT_JAVANESE = define(1247901281)
  val HB_SCRIPT_KAITHI = define(1265920105)
  val HB_SCRIPT_LISU = define(1281979253)
  val HB_SCRIPT_MEETEI_MAYEK = define(1299473769)
  val HB_SCRIPT_OLD_SOUTH_ARABIAN = define(1398895202)
  val HB_SCRIPT_OLD_TURKIC = define(1332898664)
  val HB_SCRIPT_SAMARITAN = define(1398893938)
  val HB_SCRIPT_TAI_THAM = define(1281453665)
  val HB_SCRIPT_TAI_VIET = define(1415673460)
  val HB_SCRIPT_BATAK = define(1113683051)
  val HB_SCRIPT_BRAHMI = define(1114792296)
  val HB_SCRIPT_MANDAIC = define(1298230884)
  val HB_SCRIPT_CHAKMA = define(1130457965)
  val HB_SCRIPT_MEROITIC_CURSIVE = define(1298494051)
  val HB_SCRIPT_MEROITIC_HIEROGLYPHS = define(1298494063)
  val HB_SCRIPT_MIAO = define(1349284452)
  val HB_SCRIPT_SHARADA = define(1399353956)
  val HB_SCRIPT_SORA_SOMPENG = define(1399812705)
  val HB_SCRIPT_TAKRI = define(1415670642)
  val HB_SCRIPT_BASSA_VAH = define(1113682803)
  val HB_SCRIPT_CAUCASIAN_ALBANIAN = define(1097295970)
  val HB_SCRIPT_DUPLOYAN = define(1148547180)
  val HB_SCRIPT_ELBASAN = define(1164730977)
  val HB_SCRIPT_GRANTHA = define(1198678382)
  val HB_SCRIPT_KHOJKI = define(1265135466)
  val HB_SCRIPT_KHUDAWADI = define(1399418468)
  val HB_SCRIPT_LINEAR_A = define(1281977953)
  val HB_SCRIPT_MAHAJANI = define(1298229354)
  val HB_SCRIPT_MANICHAEAN = define(1298230889)
  val HB_SCRIPT_MENDE_KIKAKUI = define(1298493028)
  val HB_SCRIPT_MODI = define(1299145833)
  val HB_SCRIPT_MRO = define(1299345263)
  val HB_SCRIPT_NABATAEAN = define(1315070324)
  val HB_SCRIPT_OLD_NORTH_ARABIAN = define(1315009122)
  val HB_SCRIPT_OLD_PERMIC = define(1348825709)
  val HB_SCRIPT_PAHAWH_HMONG = define(1215131239)
  val HB_SCRIPT_PALMYRENE = define(1348562029)
  val HB_SCRIPT_PAU_CIN_HAU = define(1348564323)
  val HB_SCRIPT_PSALTER_PAHLAVI = define(1349020784)
  val HB_SCRIPT_SIDDHAM = define(1399415908)
  val HB_SCRIPT_TIRHUTA = define(1416196712)
  val HB_SCRIPT_WARANG_CITI = define(1466004065)
  val HB_SCRIPT_AHOM = define(1097363309)
  val HB_SCRIPT_ANATOLIAN_HIEROGLYPHS = define(1215067511)
  val HB_SCRIPT_HATRAN = define(1214346354)
  val HB_SCRIPT_MULTANI = define(1299541108)
  val HB_SCRIPT_OLD_HUNGARIAN = define(1215655527)
  val HB_SCRIPT_SIGNWRITING = define(1399287415)
  val HB_SCRIPT_ADLAM = define(1097100397)
  val HB_SCRIPT_BHAIKSUKI = define(1114139507)
  val HB_SCRIPT_MARCHEN = define(1298231907)
  val HB_SCRIPT_OSAGE = define(1332963173)
  val HB_SCRIPT_TANGUT = define(1415671399)
  val HB_SCRIPT_NEWA = define(1315272545)
  val HB_SCRIPT_MASARAM_GONDI = define(1198485101)
  val HB_SCRIPT_NUSHU = define(1316186229)
  val HB_SCRIPT_SOYOMBO = define(1399814511)
  val HB_SCRIPT_ZANABAZAR_SQUARE = define(1516334690)
  val HB_SCRIPT_DOGRA = define(1148151666)
  val HB_SCRIPT_GUNJALA_GONDI = define(1198485095)
  val HB_SCRIPT_HANIFI_ROHINGYA = define(1383032935)
  val HB_SCRIPT_MAKASAR = define(1298230113)
  val HB_SCRIPT_MEDEFAIDRIN = define(1298490470)
  val HB_SCRIPT_OLD_SOGDIAN = define(1399809903)
  val HB_SCRIPT_SOGDIAN = define(1399809892)
  val HB_SCRIPT_ELYMAIC = define(1164736877)
  val HB_SCRIPT_NANDINAGARI = define(1315008100)
  val HB_SCRIPT_NYIAKENG_PUACHUE_HMONG = define(1215131248)
  val HB_SCRIPT_WANCHO = define(1466132591)
  val HB_SCRIPT_CHORASMIAN = define(1130918515)
  val HB_SCRIPT_DIVES_AKURU = define(1147756907)
  val HB_SCRIPT_KHITAN_SMALL_SCRIPT = define(1265202291)
  val HB_SCRIPT_YEZIDI = define(1499822697)
  val HB_SCRIPT_INVALID = define(0)
  val _HB_SCRIPT_MAX_VALUE = define(2147483647)
  val _HB_SCRIPT_MAX_VALUE_SIGNED = define(2147483647)
  inline def getName(inline value: hb_script_t): Option[String] =
    inline value match
      case HB_SCRIPT_COMMON => Some("HB_SCRIPT_COMMON")
      case HB_SCRIPT_INHERITED => Some("HB_SCRIPT_INHERITED")
      case HB_SCRIPT_UNKNOWN => Some("HB_SCRIPT_UNKNOWN")
      case HB_SCRIPT_ARABIC => Some("HB_SCRIPT_ARABIC")
      case HB_SCRIPT_ARMENIAN => Some("HB_SCRIPT_ARMENIAN")
      case HB_SCRIPT_BENGALI => Some("HB_SCRIPT_BENGALI")
      case HB_SCRIPT_CYRILLIC => Some("HB_SCRIPT_CYRILLIC")
      case HB_SCRIPT_DEVANAGARI => Some("HB_SCRIPT_DEVANAGARI")
      case HB_SCRIPT_GEORGIAN => Some("HB_SCRIPT_GEORGIAN")
      case HB_SCRIPT_GREEK => Some("HB_SCRIPT_GREEK")
      case HB_SCRIPT_GUJARATI => Some("HB_SCRIPT_GUJARATI")
      case HB_SCRIPT_GURMUKHI => Some("HB_SCRIPT_GURMUKHI")
      case HB_SCRIPT_HANGUL => Some("HB_SCRIPT_HANGUL")
      case HB_SCRIPT_HAN => Some("HB_SCRIPT_HAN")
      case HB_SCRIPT_HEBREW => Some("HB_SCRIPT_HEBREW")
      case HB_SCRIPT_HIRAGANA => Some("HB_SCRIPT_HIRAGANA")
      case HB_SCRIPT_KANNADA => Some("HB_SCRIPT_KANNADA")
      case HB_SCRIPT_KATAKANA => Some("HB_SCRIPT_KATAKANA")
      case HB_SCRIPT_LAO => Some("HB_SCRIPT_LAO")
      case HB_SCRIPT_LATIN => Some("HB_SCRIPT_LATIN")
      case HB_SCRIPT_MALAYALAM => Some("HB_SCRIPT_MALAYALAM")
      case HB_SCRIPT_ORIYA => Some("HB_SCRIPT_ORIYA")
      case HB_SCRIPT_TAMIL => Some("HB_SCRIPT_TAMIL")
      case HB_SCRIPT_TELUGU => Some("HB_SCRIPT_TELUGU")
      case HB_SCRIPT_THAI => Some("HB_SCRIPT_THAI")
      case HB_SCRIPT_TIBETAN => Some("HB_SCRIPT_TIBETAN")
      case HB_SCRIPT_BOPOMOFO => Some("HB_SCRIPT_BOPOMOFO")
      case HB_SCRIPT_BRAILLE => Some("HB_SCRIPT_BRAILLE")
      case HB_SCRIPT_CANADIAN_SYLLABICS => Some("HB_SCRIPT_CANADIAN_SYLLABICS")
      case HB_SCRIPT_CHEROKEE => Some("HB_SCRIPT_CHEROKEE")
      case HB_SCRIPT_ETHIOPIC => Some("HB_SCRIPT_ETHIOPIC")
      case HB_SCRIPT_KHMER => Some("HB_SCRIPT_KHMER")
      case HB_SCRIPT_MONGOLIAN => Some("HB_SCRIPT_MONGOLIAN")
      case HB_SCRIPT_MYANMAR => Some("HB_SCRIPT_MYANMAR")
      case HB_SCRIPT_OGHAM => Some("HB_SCRIPT_OGHAM")
      case HB_SCRIPT_RUNIC => Some("HB_SCRIPT_RUNIC")
      case HB_SCRIPT_SINHALA => Some("HB_SCRIPT_SINHALA")
      case HB_SCRIPT_SYRIAC => Some("HB_SCRIPT_SYRIAC")
      case HB_SCRIPT_THAANA => Some("HB_SCRIPT_THAANA")
      case HB_SCRIPT_YI => Some("HB_SCRIPT_YI")
      case HB_SCRIPT_DESERET => Some("HB_SCRIPT_DESERET")
      case HB_SCRIPT_GOTHIC => Some("HB_SCRIPT_GOTHIC")
      case HB_SCRIPT_OLD_ITALIC => Some("HB_SCRIPT_OLD_ITALIC")
      case HB_SCRIPT_BUHID => Some("HB_SCRIPT_BUHID")
      case HB_SCRIPT_HANUNOO => Some("HB_SCRIPT_HANUNOO")
      case HB_SCRIPT_TAGALOG => Some("HB_SCRIPT_TAGALOG")
      case HB_SCRIPT_TAGBANWA => Some("HB_SCRIPT_TAGBANWA")
      case HB_SCRIPT_CYPRIOT => Some("HB_SCRIPT_CYPRIOT")
      case HB_SCRIPT_LIMBU => Some("HB_SCRIPT_LIMBU")
      case HB_SCRIPT_LINEAR_B => Some("HB_SCRIPT_LINEAR_B")
      case HB_SCRIPT_OSMANYA => Some("HB_SCRIPT_OSMANYA")
      case HB_SCRIPT_SHAVIAN => Some("HB_SCRIPT_SHAVIAN")
      case HB_SCRIPT_TAI_LE => Some("HB_SCRIPT_TAI_LE")
      case HB_SCRIPT_UGARITIC => Some("HB_SCRIPT_UGARITIC")
      case HB_SCRIPT_BUGINESE => Some("HB_SCRIPT_BUGINESE")
      case HB_SCRIPT_COPTIC => Some("HB_SCRIPT_COPTIC")
      case HB_SCRIPT_GLAGOLITIC => Some("HB_SCRIPT_GLAGOLITIC")
      case HB_SCRIPT_KHAROSHTHI => Some("HB_SCRIPT_KHAROSHTHI")
      case HB_SCRIPT_NEW_TAI_LUE => Some("HB_SCRIPT_NEW_TAI_LUE")
      case HB_SCRIPT_OLD_PERSIAN => Some("HB_SCRIPT_OLD_PERSIAN")
      case HB_SCRIPT_SYLOTI_NAGRI => Some("HB_SCRIPT_SYLOTI_NAGRI")
      case HB_SCRIPT_TIFINAGH => Some("HB_SCRIPT_TIFINAGH")
      case HB_SCRIPT_BALINESE => Some("HB_SCRIPT_BALINESE")
      case HB_SCRIPT_CUNEIFORM => Some("HB_SCRIPT_CUNEIFORM")
      case HB_SCRIPT_NKO => Some("HB_SCRIPT_NKO")
      case HB_SCRIPT_PHAGS_PA => Some("HB_SCRIPT_PHAGS_PA")
      case HB_SCRIPT_PHOENICIAN => Some("HB_SCRIPT_PHOENICIAN")
      case HB_SCRIPT_CARIAN => Some("HB_SCRIPT_CARIAN")
      case HB_SCRIPT_CHAM => Some("HB_SCRIPT_CHAM")
      case HB_SCRIPT_KAYAH_LI => Some("HB_SCRIPT_KAYAH_LI")
      case HB_SCRIPT_LEPCHA => Some("HB_SCRIPT_LEPCHA")
      case HB_SCRIPT_LYCIAN => Some("HB_SCRIPT_LYCIAN")
      case HB_SCRIPT_LYDIAN => Some("HB_SCRIPT_LYDIAN")
      case HB_SCRIPT_OL_CHIKI => Some("HB_SCRIPT_OL_CHIKI")
      case HB_SCRIPT_REJANG => Some("HB_SCRIPT_REJANG")
      case HB_SCRIPT_SAURASHTRA => Some("HB_SCRIPT_SAURASHTRA")
      case HB_SCRIPT_SUNDANESE => Some("HB_SCRIPT_SUNDANESE")
      case HB_SCRIPT_VAI => Some("HB_SCRIPT_VAI")
      case HB_SCRIPT_AVESTAN => Some("HB_SCRIPT_AVESTAN")
      case HB_SCRIPT_BAMUM => Some("HB_SCRIPT_BAMUM")
      case HB_SCRIPT_EGYPTIAN_HIEROGLYPHS => Some("HB_SCRIPT_EGYPTIAN_HIEROGLYPHS")
      case HB_SCRIPT_IMPERIAL_ARAMAIC => Some("HB_SCRIPT_IMPERIAL_ARAMAIC")
      case HB_SCRIPT_INSCRIPTIONAL_PAHLAVI => Some("HB_SCRIPT_INSCRIPTIONAL_PAHLAVI")
      case HB_SCRIPT_INSCRIPTIONAL_PARTHIAN => Some("HB_SCRIPT_INSCRIPTIONAL_PARTHIAN")
      case HB_SCRIPT_JAVANESE => Some("HB_SCRIPT_JAVANESE")
      case HB_SCRIPT_KAITHI => Some("HB_SCRIPT_KAITHI")
      case HB_SCRIPT_LISU => Some("HB_SCRIPT_LISU")
      case HB_SCRIPT_MEETEI_MAYEK => Some("HB_SCRIPT_MEETEI_MAYEK")
      case HB_SCRIPT_OLD_SOUTH_ARABIAN => Some("HB_SCRIPT_OLD_SOUTH_ARABIAN")
      case HB_SCRIPT_OLD_TURKIC => Some("HB_SCRIPT_OLD_TURKIC")
      case HB_SCRIPT_SAMARITAN => Some("HB_SCRIPT_SAMARITAN")
      case HB_SCRIPT_TAI_THAM => Some("HB_SCRIPT_TAI_THAM")
      case HB_SCRIPT_TAI_VIET => Some("HB_SCRIPT_TAI_VIET")
      case HB_SCRIPT_BATAK => Some("HB_SCRIPT_BATAK")
      case HB_SCRIPT_BRAHMI => Some("HB_SCRIPT_BRAHMI")
      case HB_SCRIPT_MANDAIC => Some("HB_SCRIPT_MANDAIC")
      case HB_SCRIPT_CHAKMA => Some("HB_SCRIPT_CHAKMA")
      case HB_SCRIPT_MEROITIC_CURSIVE => Some("HB_SCRIPT_MEROITIC_CURSIVE")
      case HB_SCRIPT_MEROITIC_HIEROGLYPHS => Some("HB_SCRIPT_MEROITIC_HIEROGLYPHS")
      case HB_SCRIPT_MIAO => Some("HB_SCRIPT_MIAO")
      case HB_SCRIPT_SHARADA => Some("HB_SCRIPT_SHARADA")
      case HB_SCRIPT_SORA_SOMPENG => Some("HB_SCRIPT_SORA_SOMPENG")
      case HB_SCRIPT_TAKRI => Some("HB_SCRIPT_TAKRI")
      case HB_SCRIPT_BASSA_VAH => Some("HB_SCRIPT_BASSA_VAH")
      case HB_SCRIPT_CAUCASIAN_ALBANIAN => Some("HB_SCRIPT_CAUCASIAN_ALBANIAN")
      case HB_SCRIPT_DUPLOYAN => Some("HB_SCRIPT_DUPLOYAN")
      case HB_SCRIPT_ELBASAN => Some("HB_SCRIPT_ELBASAN")
      case HB_SCRIPT_GRANTHA => Some("HB_SCRIPT_GRANTHA")
      case HB_SCRIPT_KHOJKI => Some("HB_SCRIPT_KHOJKI")
      case HB_SCRIPT_KHUDAWADI => Some("HB_SCRIPT_KHUDAWADI")
      case HB_SCRIPT_LINEAR_A => Some("HB_SCRIPT_LINEAR_A")
      case HB_SCRIPT_MAHAJANI => Some("HB_SCRIPT_MAHAJANI")
      case HB_SCRIPT_MANICHAEAN => Some("HB_SCRIPT_MANICHAEAN")
      case HB_SCRIPT_MENDE_KIKAKUI => Some("HB_SCRIPT_MENDE_KIKAKUI")
      case HB_SCRIPT_MODI => Some("HB_SCRIPT_MODI")
      case HB_SCRIPT_MRO => Some("HB_SCRIPT_MRO")
      case HB_SCRIPT_NABATAEAN => Some("HB_SCRIPT_NABATAEAN")
      case HB_SCRIPT_OLD_NORTH_ARABIAN => Some("HB_SCRIPT_OLD_NORTH_ARABIAN")
      case HB_SCRIPT_OLD_PERMIC => Some("HB_SCRIPT_OLD_PERMIC")
      case HB_SCRIPT_PAHAWH_HMONG => Some("HB_SCRIPT_PAHAWH_HMONG")
      case HB_SCRIPT_PALMYRENE => Some("HB_SCRIPT_PALMYRENE")
      case HB_SCRIPT_PAU_CIN_HAU => Some("HB_SCRIPT_PAU_CIN_HAU")
      case HB_SCRIPT_PSALTER_PAHLAVI => Some("HB_SCRIPT_PSALTER_PAHLAVI")
      case HB_SCRIPT_SIDDHAM => Some("HB_SCRIPT_SIDDHAM")
      case HB_SCRIPT_TIRHUTA => Some("HB_SCRIPT_TIRHUTA")
      case HB_SCRIPT_WARANG_CITI => Some("HB_SCRIPT_WARANG_CITI")
      case HB_SCRIPT_AHOM => Some("HB_SCRIPT_AHOM")
      case HB_SCRIPT_ANATOLIAN_HIEROGLYPHS => Some("HB_SCRIPT_ANATOLIAN_HIEROGLYPHS")
      case HB_SCRIPT_HATRAN => Some("HB_SCRIPT_HATRAN")
      case HB_SCRIPT_MULTANI => Some("HB_SCRIPT_MULTANI")
      case HB_SCRIPT_OLD_HUNGARIAN => Some("HB_SCRIPT_OLD_HUNGARIAN")
      case HB_SCRIPT_SIGNWRITING => Some("HB_SCRIPT_SIGNWRITING")
      case HB_SCRIPT_ADLAM => Some("HB_SCRIPT_ADLAM")
      case HB_SCRIPT_BHAIKSUKI => Some("HB_SCRIPT_BHAIKSUKI")
      case HB_SCRIPT_MARCHEN => Some("HB_SCRIPT_MARCHEN")
      case HB_SCRIPT_OSAGE => Some("HB_SCRIPT_OSAGE")
      case HB_SCRIPT_TANGUT => Some("HB_SCRIPT_TANGUT")
      case HB_SCRIPT_NEWA => Some("HB_SCRIPT_NEWA")
      case HB_SCRIPT_MASARAM_GONDI => Some("HB_SCRIPT_MASARAM_GONDI")
      case HB_SCRIPT_NUSHU => Some("HB_SCRIPT_NUSHU")
      case HB_SCRIPT_SOYOMBO => Some("HB_SCRIPT_SOYOMBO")
      case HB_SCRIPT_ZANABAZAR_SQUARE => Some("HB_SCRIPT_ZANABAZAR_SQUARE")
      case HB_SCRIPT_DOGRA => Some("HB_SCRIPT_DOGRA")
      case HB_SCRIPT_GUNJALA_GONDI => Some("HB_SCRIPT_GUNJALA_GONDI")
      case HB_SCRIPT_HANIFI_ROHINGYA => Some("HB_SCRIPT_HANIFI_ROHINGYA")
      case HB_SCRIPT_MAKASAR => Some("HB_SCRIPT_MAKASAR")
      case HB_SCRIPT_MEDEFAIDRIN => Some("HB_SCRIPT_MEDEFAIDRIN")
      case HB_SCRIPT_OLD_SOGDIAN => Some("HB_SCRIPT_OLD_SOGDIAN")
      case HB_SCRIPT_SOGDIAN => Some("HB_SCRIPT_SOGDIAN")
      case HB_SCRIPT_ELYMAIC => Some("HB_SCRIPT_ELYMAIC")
      case HB_SCRIPT_NANDINAGARI => Some("HB_SCRIPT_NANDINAGARI")
      case HB_SCRIPT_NYIAKENG_PUACHUE_HMONG => Some("HB_SCRIPT_NYIAKENG_PUACHUE_HMONG")
      case HB_SCRIPT_WANCHO => Some("HB_SCRIPT_WANCHO")
      case HB_SCRIPT_CHORASMIAN => Some("HB_SCRIPT_CHORASMIAN")
      case HB_SCRIPT_DIVES_AKURU => Some("HB_SCRIPT_DIVES_AKURU")
      case HB_SCRIPT_KHITAN_SMALL_SCRIPT => Some("HB_SCRIPT_KHITAN_SMALL_SCRIPT")
      case HB_SCRIPT_YEZIDI => Some("HB_SCRIPT_YEZIDI")
      case HB_SCRIPT_INVALID => Some("HB_SCRIPT_INVALID")
      case _HB_SCRIPT_MAX_VALUE => Some("_HB_SCRIPT_MAX_VALUE")
      case _HB_SCRIPT_MAX_VALUE_SIGNED => Some("_HB_SCRIPT_MAX_VALUE_SIGNED")
      case _ => _root_.scala.None
  extension (a: hb_script_t)
    inline def &(b: hb_script_t): hb_script_t = a & b
    inline def |(b: hb_script_t): hb_script_t = a | b
    inline def is(b: hb_script_t): Boolean = (a & b) == b

/**
 * hb_unicode_combining_class_t: _UNICODE_COMBINING_CLASS_NOT_REORDERED: Spacing and enclosing marks; also many vowel and consonant signs, even if nonspacing _UNICODE_COMBINING_CLASS_OVERLAY: Marks which overlay a base letter or symbol _UNICODE_COMBINING_CLASS_NUKTA: Diacritic nukta marks in Brahmi-derived scripts _UNICODE_COMBINING_CLASS_KANA_VOICING: Hiragana/Katakana voicing marks _UNICODE_COMBINING_CLASS_VIRAMA: Viramas _UNICODE_COMBINING_CLASS_CCC10: [Hebrew] _UNICODE_COMBINING_CLASS_CCC11: [Hebrew] _UNICODE_COMBINING_CLASS_CCC12: [Hebrew] _UNICODE_COMBINING_CLASS_CCC13: [Hebrew] _UNICODE_COMBINING_CLASS_CCC14: [Hebrew] _UNICODE_COMBINING_CLASS_CCC15: [Hebrew] _UNICODE_COMBINING_CLASS_CCC16: [Hebrew] _UNICODE_COMBINING_CLASS_CCC17: [Hebrew] _UNICODE_COMBINING_CLASS_CCC18: [Hebrew] _UNICODE_COMBINING_CLASS_CCC19: [Hebrew] _UNICODE_COMBINING_CLASS_CCC20: [Hebrew] _UNICODE_COMBINING_CLASS_CCC21: [Hebrew] _UNICODE_COMBINING_CLASS_CCC22: [Hebrew] _UNICODE_COMBINING_CLASS_CCC23: [Hebrew] _UNICODE_COMBINING_CLASS_CCC24: [Hebrew] _UNICODE_COMBINING_CLASS_CCC25: [Hebrew] _UNICODE_COMBINING_CLASS_CCC26: [Hebrew] _UNICODE_COMBINING_CLASS_CCC27: [Arabic] _UNICODE_COMBINING_CLASS_CCC28: [Arabic] _UNICODE_COMBINING_CLASS_CCC29: [Arabic] _UNICODE_COMBINING_CLASS_CCC30: [Arabic] _UNICODE_COMBINING_CLASS_CCC31: [Arabic] _UNICODE_COMBINING_CLASS_CCC32: [Arabic] _UNICODE_COMBINING_CLASS_CCC33: [Arabic] _UNICODE_COMBINING_CLASS_CCC34: [Arabic] _UNICODE_COMBINING_CLASS_CCC35: [Arabic] _UNICODE_COMBINING_CLASS_CCC36: [Syriac] _UNICODE_COMBINING_CLASS_CCC84: [Telugu] _UNICODE_COMBINING_CLASS_CCC91: [Telugu] _UNICODE_COMBINING_CLASS_CCC103: [Thai] _UNICODE_COMBINING_CLASS_CCC107: [Thai] _UNICODE_COMBINING_CLASS_CCC118: [Lao] _UNICODE_COMBINING_CLASS_CCC122: [Lao] _UNICODE_COMBINING_CLASS_CCC129: [Tibetan] _UNICODE_COMBINING_CLASS_CCC130: [Tibetan] _UNICODE_COMBINING_CLASS_CCC133: [Tibetan] _UNICODE_COMBINING_CLASS_ATTACHED_BELOW_LEFT: Marks attached at the bottom left _UNICODE_COMBINING_CLASS_ATTACHED_BELOW: Marks attached directly below _UNICODE_COMBINING_CLASS_ATTACHED_ABOVE: Marks attached directly above _UNICODE_COMBINING_CLASS_ATTACHED_ABOVE_RIGHT: Marks attached at the top right _UNICODE_COMBINING_CLASS_BELOW_LEFT: Distinct marks at the bottom left _UNICODE_COMBINING_CLASS_BELOW: Distinct marks directly below _UNICODE_COMBINING_CLASS_BELOW_RIGHT: Distinct marks at the bottom right _UNICODE_COMBINING_CLASS_LEFT: Distinct marks to the left _UNICODE_COMBINING_CLASS_RIGHT: Distinct marks to the right _UNICODE_COMBINING_CLASS_ABOVE_LEFT: Distinct marks at the top left _UNICODE_COMBINING_CLASS_ABOVE: Distinct marks directly above _UNICODE_COMBINING_CLASS_ABOVE_RIGHT: Distinct marks at the top right _UNICODE_COMBINING_CLASS_DOUBLE_BELOW: Distinct marks subtending two bases _UNICODE_COMBINING_CLASS_DOUBLE_ABOVE: Distinct marks extending above two bases _UNICODE_COMBINING_CLASS_IOTA_SUBSCRIPT: Greek iota subscript only _UNICODE_COMBINING_CLASS_INVALID: Invalid combining class
*/
opaque type hb_unicode_combining_class_t = CUnsignedInt
object hb_unicode_combining_class_t extends CEnumU[hb_unicode_combining_class_t]:
  given _tag: Tag[hb_unicode_combining_class_t] = Tag.UInt
  inline def define(inline a: Long): hb_unicode_combining_class_t = a.toUInt
  val HB_UNICODE_COMBINING_CLASS_NOT_REORDERED = define(0)
  val HB_UNICODE_COMBINING_CLASS_OVERLAY = define(1)
  val HB_UNICODE_COMBINING_CLASS_NUKTA = define(7)
  val HB_UNICODE_COMBINING_CLASS_KANA_VOICING = define(8)
  val HB_UNICODE_COMBINING_CLASS_VIRAMA = define(9)
  val HB_UNICODE_COMBINING_CLASS_CCC10 = define(10)
  val HB_UNICODE_COMBINING_CLASS_CCC11 = define(11)
  val HB_UNICODE_COMBINING_CLASS_CCC12 = define(12)
  val HB_UNICODE_COMBINING_CLASS_CCC13 = define(13)
  val HB_UNICODE_COMBINING_CLASS_CCC14 = define(14)
  val HB_UNICODE_COMBINING_CLASS_CCC15 = define(15)
  val HB_UNICODE_COMBINING_CLASS_CCC16 = define(16)
  val HB_UNICODE_COMBINING_CLASS_CCC17 = define(17)
  val HB_UNICODE_COMBINING_CLASS_CCC18 = define(18)
  val HB_UNICODE_COMBINING_CLASS_CCC19 = define(19)
  val HB_UNICODE_COMBINING_CLASS_CCC20 = define(20)
  val HB_UNICODE_COMBINING_CLASS_CCC21 = define(21)
  val HB_UNICODE_COMBINING_CLASS_CCC22 = define(22)
  val HB_UNICODE_COMBINING_CLASS_CCC23 = define(23)
  val HB_UNICODE_COMBINING_CLASS_CCC24 = define(24)
  val HB_UNICODE_COMBINING_CLASS_CCC25 = define(25)
  val HB_UNICODE_COMBINING_CLASS_CCC26 = define(26)
  val HB_UNICODE_COMBINING_CLASS_CCC27 = define(27)
  val HB_UNICODE_COMBINING_CLASS_CCC28 = define(28)
  val HB_UNICODE_COMBINING_CLASS_CCC29 = define(29)
  val HB_UNICODE_COMBINING_CLASS_CCC30 = define(30)
  val HB_UNICODE_COMBINING_CLASS_CCC31 = define(31)
  val HB_UNICODE_COMBINING_CLASS_CCC32 = define(32)
  val HB_UNICODE_COMBINING_CLASS_CCC33 = define(33)
  val HB_UNICODE_COMBINING_CLASS_CCC34 = define(34)
  val HB_UNICODE_COMBINING_CLASS_CCC35 = define(35)
  val HB_UNICODE_COMBINING_CLASS_CCC36 = define(36)
  val HB_UNICODE_COMBINING_CLASS_CCC84 = define(84)
  val HB_UNICODE_COMBINING_CLASS_CCC91 = define(91)
  val HB_UNICODE_COMBINING_CLASS_CCC103 = define(103)
  val HB_UNICODE_COMBINING_CLASS_CCC107 = define(107)
  val HB_UNICODE_COMBINING_CLASS_CCC118 = define(118)
  val HB_UNICODE_COMBINING_CLASS_CCC122 = define(122)
  val HB_UNICODE_COMBINING_CLASS_CCC129 = define(129)
  val HB_UNICODE_COMBINING_CLASS_CCC130 = define(130)
  val HB_UNICODE_COMBINING_CLASS_CCC133 = define(132)
  val HB_UNICODE_COMBINING_CLASS_ATTACHED_BELOW_LEFT = define(200)
  val HB_UNICODE_COMBINING_CLASS_ATTACHED_BELOW = define(202)
  val HB_UNICODE_COMBINING_CLASS_ATTACHED_ABOVE = define(214)
  val HB_UNICODE_COMBINING_CLASS_ATTACHED_ABOVE_RIGHT = define(216)
  val HB_UNICODE_COMBINING_CLASS_BELOW_LEFT = define(218)
  val HB_UNICODE_COMBINING_CLASS_BELOW = define(220)
  val HB_UNICODE_COMBINING_CLASS_BELOW_RIGHT = define(222)
  val HB_UNICODE_COMBINING_CLASS_LEFT = define(224)
  val HB_UNICODE_COMBINING_CLASS_RIGHT = define(226)
  val HB_UNICODE_COMBINING_CLASS_ABOVE_LEFT = define(228)
  val HB_UNICODE_COMBINING_CLASS_ABOVE = define(230)
  val HB_UNICODE_COMBINING_CLASS_ABOVE_RIGHT = define(232)
  val HB_UNICODE_COMBINING_CLASS_DOUBLE_BELOW = define(233)
  val HB_UNICODE_COMBINING_CLASS_DOUBLE_ABOVE = define(234)
  val HB_UNICODE_COMBINING_CLASS_IOTA_SUBSCRIPT = define(240)
  val HB_UNICODE_COMBINING_CLASS_INVALID = define(255)
  inline def getName(inline value: hb_unicode_combining_class_t): Option[String] =
    inline value match
      case HB_UNICODE_COMBINING_CLASS_NOT_REORDERED => Some("HB_UNICODE_COMBINING_CLASS_NOT_REORDERED")
      case HB_UNICODE_COMBINING_CLASS_OVERLAY => Some("HB_UNICODE_COMBINING_CLASS_OVERLAY")
      case HB_UNICODE_COMBINING_CLASS_NUKTA => Some("HB_UNICODE_COMBINING_CLASS_NUKTA")
      case HB_UNICODE_COMBINING_CLASS_KANA_VOICING => Some("HB_UNICODE_COMBINING_CLASS_KANA_VOICING")
      case HB_UNICODE_COMBINING_CLASS_VIRAMA => Some("HB_UNICODE_COMBINING_CLASS_VIRAMA")
      case HB_UNICODE_COMBINING_CLASS_CCC10 => Some("HB_UNICODE_COMBINING_CLASS_CCC10")
      case HB_UNICODE_COMBINING_CLASS_CCC11 => Some("HB_UNICODE_COMBINING_CLASS_CCC11")
      case HB_UNICODE_COMBINING_CLASS_CCC12 => Some("HB_UNICODE_COMBINING_CLASS_CCC12")
      case HB_UNICODE_COMBINING_CLASS_CCC13 => Some("HB_UNICODE_COMBINING_CLASS_CCC13")
      case HB_UNICODE_COMBINING_CLASS_CCC14 => Some("HB_UNICODE_COMBINING_CLASS_CCC14")
      case HB_UNICODE_COMBINING_CLASS_CCC15 => Some("HB_UNICODE_COMBINING_CLASS_CCC15")
      case HB_UNICODE_COMBINING_CLASS_CCC16 => Some("HB_UNICODE_COMBINING_CLASS_CCC16")
      case HB_UNICODE_COMBINING_CLASS_CCC17 => Some("HB_UNICODE_COMBINING_CLASS_CCC17")
      case HB_UNICODE_COMBINING_CLASS_CCC18 => Some("HB_UNICODE_COMBINING_CLASS_CCC18")
      case HB_UNICODE_COMBINING_CLASS_CCC19 => Some("HB_UNICODE_COMBINING_CLASS_CCC19")
      case HB_UNICODE_COMBINING_CLASS_CCC20 => Some("HB_UNICODE_COMBINING_CLASS_CCC20")
      case HB_UNICODE_COMBINING_CLASS_CCC21 => Some("HB_UNICODE_COMBINING_CLASS_CCC21")
      case HB_UNICODE_COMBINING_CLASS_CCC22 => Some("HB_UNICODE_COMBINING_CLASS_CCC22")
      case HB_UNICODE_COMBINING_CLASS_CCC23 => Some("HB_UNICODE_COMBINING_CLASS_CCC23")
      case HB_UNICODE_COMBINING_CLASS_CCC24 => Some("HB_UNICODE_COMBINING_CLASS_CCC24")
      case HB_UNICODE_COMBINING_CLASS_CCC25 => Some("HB_UNICODE_COMBINING_CLASS_CCC25")
      case HB_UNICODE_COMBINING_CLASS_CCC26 => Some("HB_UNICODE_COMBINING_CLASS_CCC26")
      case HB_UNICODE_COMBINING_CLASS_CCC27 => Some("HB_UNICODE_COMBINING_CLASS_CCC27")
      case HB_UNICODE_COMBINING_CLASS_CCC28 => Some("HB_UNICODE_COMBINING_CLASS_CCC28")
      case HB_UNICODE_COMBINING_CLASS_CCC29 => Some("HB_UNICODE_COMBINING_CLASS_CCC29")
      case HB_UNICODE_COMBINING_CLASS_CCC30 => Some("HB_UNICODE_COMBINING_CLASS_CCC30")
      case HB_UNICODE_COMBINING_CLASS_CCC31 => Some("HB_UNICODE_COMBINING_CLASS_CCC31")
      case HB_UNICODE_COMBINING_CLASS_CCC32 => Some("HB_UNICODE_COMBINING_CLASS_CCC32")
      case HB_UNICODE_COMBINING_CLASS_CCC33 => Some("HB_UNICODE_COMBINING_CLASS_CCC33")
      case HB_UNICODE_COMBINING_CLASS_CCC34 => Some("HB_UNICODE_COMBINING_CLASS_CCC34")
      case HB_UNICODE_COMBINING_CLASS_CCC35 => Some("HB_UNICODE_COMBINING_CLASS_CCC35")
      case HB_UNICODE_COMBINING_CLASS_CCC36 => Some("HB_UNICODE_COMBINING_CLASS_CCC36")
      case HB_UNICODE_COMBINING_CLASS_CCC84 => Some("HB_UNICODE_COMBINING_CLASS_CCC84")
      case HB_UNICODE_COMBINING_CLASS_CCC91 => Some("HB_UNICODE_COMBINING_CLASS_CCC91")
      case HB_UNICODE_COMBINING_CLASS_CCC103 => Some("HB_UNICODE_COMBINING_CLASS_CCC103")
      case HB_UNICODE_COMBINING_CLASS_CCC107 => Some("HB_UNICODE_COMBINING_CLASS_CCC107")
      case HB_UNICODE_COMBINING_CLASS_CCC118 => Some("HB_UNICODE_COMBINING_CLASS_CCC118")
      case HB_UNICODE_COMBINING_CLASS_CCC122 => Some("HB_UNICODE_COMBINING_CLASS_CCC122")
      case HB_UNICODE_COMBINING_CLASS_CCC129 => Some("HB_UNICODE_COMBINING_CLASS_CCC129")
      case HB_UNICODE_COMBINING_CLASS_CCC130 => Some("HB_UNICODE_COMBINING_CLASS_CCC130")
      case HB_UNICODE_COMBINING_CLASS_CCC133 => Some("HB_UNICODE_COMBINING_CLASS_CCC133")
      case HB_UNICODE_COMBINING_CLASS_ATTACHED_BELOW_LEFT => Some("HB_UNICODE_COMBINING_CLASS_ATTACHED_BELOW_LEFT")
      case HB_UNICODE_COMBINING_CLASS_ATTACHED_BELOW => Some("HB_UNICODE_COMBINING_CLASS_ATTACHED_BELOW")
      case HB_UNICODE_COMBINING_CLASS_ATTACHED_ABOVE => Some("HB_UNICODE_COMBINING_CLASS_ATTACHED_ABOVE")
      case HB_UNICODE_COMBINING_CLASS_ATTACHED_ABOVE_RIGHT => Some("HB_UNICODE_COMBINING_CLASS_ATTACHED_ABOVE_RIGHT")
      case HB_UNICODE_COMBINING_CLASS_BELOW_LEFT => Some("HB_UNICODE_COMBINING_CLASS_BELOW_LEFT")
      case HB_UNICODE_COMBINING_CLASS_BELOW => Some("HB_UNICODE_COMBINING_CLASS_BELOW")
      case HB_UNICODE_COMBINING_CLASS_BELOW_RIGHT => Some("HB_UNICODE_COMBINING_CLASS_BELOW_RIGHT")
      case HB_UNICODE_COMBINING_CLASS_LEFT => Some("HB_UNICODE_COMBINING_CLASS_LEFT")
      case HB_UNICODE_COMBINING_CLASS_RIGHT => Some("HB_UNICODE_COMBINING_CLASS_RIGHT")
      case HB_UNICODE_COMBINING_CLASS_ABOVE_LEFT => Some("HB_UNICODE_COMBINING_CLASS_ABOVE_LEFT")
      case HB_UNICODE_COMBINING_CLASS_ABOVE => Some("HB_UNICODE_COMBINING_CLASS_ABOVE")
      case HB_UNICODE_COMBINING_CLASS_ABOVE_RIGHT => Some("HB_UNICODE_COMBINING_CLASS_ABOVE_RIGHT")
      case HB_UNICODE_COMBINING_CLASS_DOUBLE_BELOW => Some("HB_UNICODE_COMBINING_CLASS_DOUBLE_BELOW")
      case HB_UNICODE_COMBINING_CLASS_DOUBLE_ABOVE => Some("HB_UNICODE_COMBINING_CLASS_DOUBLE_ABOVE")
      case HB_UNICODE_COMBINING_CLASS_IOTA_SUBSCRIPT => Some("HB_UNICODE_COMBINING_CLASS_IOTA_SUBSCRIPT")
      case HB_UNICODE_COMBINING_CLASS_INVALID => Some("HB_UNICODE_COMBINING_CLASS_INVALID")
      case _ => _root_.scala.None
  extension (a: hb_unicode_combining_class_t)
    inline def &(b: hb_unicode_combining_class_t): hb_unicode_combining_class_t = a & b
    inline def |(b: hb_unicode_combining_class_t): hb_unicode_combining_class_t = a | b
    inline def is(b: hb_unicode_combining_class_t): Boolean = (a & b) == b

/**
 * hb_unicode_general_category_t: _UNICODE_GENERAL_CATEGORY_CONTROL: [Cc] _UNICODE_GENERAL_CATEGORY_FORMAT: [Cf] _UNICODE_GENERAL_CATEGORY_UNASSIGNED: [Cn] _UNICODE_GENERAL_CATEGORY_PRIVATE_USE: [Co] _UNICODE_GENERAL_CATEGORY_SURROGATE: [Cs] _UNICODE_GENERAL_CATEGORY_LOWERCASE_LETTER: [Ll] _UNICODE_GENERAL_CATEGORY_MODIFIER_LETTER: [Lm] _UNICODE_GENERAL_CATEGORY_OTHER_LETTER: [Lo] _UNICODE_GENERAL_CATEGORY_TITLECASE_LETTER: [Lt] _UNICODE_GENERAL_CATEGORY_UPPERCASE_LETTER: [Lu] _UNICODE_GENERAL_CATEGORY_SPACING_MARK: [Mc] _UNICODE_GENERAL_CATEGORY_ENCLOSING_MARK: [Me] _UNICODE_GENERAL_CATEGORY_NON_SPACING_MARK: [Mn] _UNICODE_GENERAL_CATEGORY_DECIMAL_NUMBER: [Nd] _UNICODE_GENERAL_CATEGORY_LETTER_NUMBER: [Nl] _UNICODE_GENERAL_CATEGORY_OTHER_NUMBER: [No] _UNICODE_GENERAL_CATEGORY_CONNECT_PUNCTUATION: [Pc] _UNICODE_GENERAL_CATEGORY_DASH_PUNCTUATION: [Pd] _UNICODE_GENERAL_CATEGORY_CLOSE_PUNCTUATION: [Pe] _UNICODE_GENERAL_CATEGORY_FINAL_PUNCTUATION: [Pf] _UNICODE_GENERAL_CATEGORY_INITIAL_PUNCTUATION: [Pi] _UNICODE_GENERAL_CATEGORY_OTHER_PUNCTUATION: [Po] _UNICODE_GENERAL_CATEGORY_OPEN_PUNCTUATION: [Ps] _UNICODE_GENERAL_CATEGORY_CURRENCY_SYMBOL: [Sc] _UNICODE_GENERAL_CATEGORY_MODIFIER_SYMBOL: [Sk] _UNICODE_GENERAL_CATEGORY_MATH_SYMBOL: [Sm] _UNICODE_GENERAL_CATEGORY_OTHER_SYMBOL: [So] _UNICODE_GENERAL_CATEGORY_LINE_SEPARATOR: [Zl] _UNICODE_GENERAL_CATEGORY_PARAGRAPH_SEPARATOR: [Zp] _UNICODE_GENERAL_CATEGORY_SPACE_SEPARATOR: [Zs]
*/
opaque type hb_unicode_general_category_t = CUnsignedInt
object hb_unicode_general_category_t extends CEnumU[hb_unicode_general_category_t]:
  given _tag: Tag[hb_unicode_general_category_t] = Tag.UInt
  inline def define(inline a: Long): hb_unicode_general_category_t = a.toUInt
  val HB_UNICODE_GENERAL_CATEGORY_CONTROL = define(0)
  val HB_UNICODE_GENERAL_CATEGORY_FORMAT = define(1)
  val HB_UNICODE_GENERAL_CATEGORY_UNASSIGNED = define(2)
  val HB_UNICODE_GENERAL_CATEGORY_PRIVATE_USE = define(3)
  val HB_UNICODE_GENERAL_CATEGORY_SURROGATE = define(4)
  val HB_UNICODE_GENERAL_CATEGORY_LOWERCASE_LETTER = define(5)
  val HB_UNICODE_GENERAL_CATEGORY_MODIFIER_LETTER = define(6)
  val HB_UNICODE_GENERAL_CATEGORY_OTHER_LETTER = define(7)
  val HB_UNICODE_GENERAL_CATEGORY_TITLECASE_LETTER = define(8)
  val HB_UNICODE_GENERAL_CATEGORY_UPPERCASE_LETTER = define(9)
  val HB_UNICODE_GENERAL_CATEGORY_SPACING_MARK = define(10)
  val HB_UNICODE_GENERAL_CATEGORY_ENCLOSING_MARK = define(11)
  val HB_UNICODE_GENERAL_CATEGORY_NON_SPACING_MARK = define(12)
  val HB_UNICODE_GENERAL_CATEGORY_DECIMAL_NUMBER = define(13)
  val HB_UNICODE_GENERAL_CATEGORY_LETTER_NUMBER = define(14)
  val HB_UNICODE_GENERAL_CATEGORY_OTHER_NUMBER = define(15)
  val HB_UNICODE_GENERAL_CATEGORY_CONNECT_PUNCTUATION = define(16)
  val HB_UNICODE_GENERAL_CATEGORY_DASH_PUNCTUATION = define(17)
  val HB_UNICODE_GENERAL_CATEGORY_CLOSE_PUNCTUATION = define(18)
  val HB_UNICODE_GENERAL_CATEGORY_FINAL_PUNCTUATION = define(19)
  val HB_UNICODE_GENERAL_CATEGORY_INITIAL_PUNCTUATION = define(20)
  val HB_UNICODE_GENERAL_CATEGORY_OTHER_PUNCTUATION = define(21)
  val HB_UNICODE_GENERAL_CATEGORY_OPEN_PUNCTUATION = define(22)
  val HB_UNICODE_GENERAL_CATEGORY_CURRENCY_SYMBOL = define(23)
  val HB_UNICODE_GENERAL_CATEGORY_MODIFIER_SYMBOL = define(24)
  val HB_UNICODE_GENERAL_CATEGORY_MATH_SYMBOL = define(25)
  val HB_UNICODE_GENERAL_CATEGORY_OTHER_SYMBOL = define(26)
  val HB_UNICODE_GENERAL_CATEGORY_LINE_SEPARATOR = define(27)
  val HB_UNICODE_GENERAL_CATEGORY_PARAGRAPH_SEPARATOR = define(28)
  val HB_UNICODE_GENERAL_CATEGORY_SPACE_SEPARATOR = define(29)
  inline def getName(inline value: hb_unicode_general_category_t): Option[String] =
    inline value match
      case HB_UNICODE_GENERAL_CATEGORY_CONTROL => Some("HB_UNICODE_GENERAL_CATEGORY_CONTROL")
      case HB_UNICODE_GENERAL_CATEGORY_FORMAT => Some("HB_UNICODE_GENERAL_CATEGORY_FORMAT")
      case HB_UNICODE_GENERAL_CATEGORY_UNASSIGNED => Some("HB_UNICODE_GENERAL_CATEGORY_UNASSIGNED")
      case HB_UNICODE_GENERAL_CATEGORY_PRIVATE_USE => Some("HB_UNICODE_GENERAL_CATEGORY_PRIVATE_USE")
      case HB_UNICODE_GENERAL_CATEGORY_SURROGATE => Some("HB_UNICODE_GENERAL_CATEGORY_SURROGATE")
      case HB_UNICODE_GENERAL_CATEGORY_LOWERCASE_LETTER => Some("HB_UNICODE_GENERAL_CATEGORY_LOWERCASE_LETTER")
      case HB_UNICODE_GENERAL_CATEGORY_MODIFIER_LETTER => Some("HB_UNICODE_GENERAL_CATEGORY_MODIFIER_LETTER")
      case HB_UNICODE_GENERAL_CATEGORY_OTHER_LETTER => Some("HB_UNICODE_GENERAL_CATEGORY_OTHER_LETTER")
      case HB_UNICODE_GENERAL_CATEGORY_TITLECASE_LETTER => Some("HB_UNICODE_GENERAL_CATEGORY_TITLECASE_LETTER")
      case HB_UNICODE_GENERAL_CATEGORY_UPPERCASE_LETTER => Some("HB_UNICODE_GENERAL_CATEGORY_UPPERCASE_LETTER")
      case HB_UNICODE_GENERAL_CATEGORY_SPACING_MARK => Some("HB_UNICODE_GENERAL_CATEGORY_SPACING_MARK")
      case HB_UNICODE_GENERAL_CATEGORY_ENCLOSING_MARK => Some("HB_UNICODE_GENERAL_CATEGORY_ENCLOSING_MARK")
      case HB_UNICODE_GENERAL_CATEGORY_NON_SPACING_MARK => Some("HB_UNICODE_GENERAL_CATEGORY_NON_SPACING_MARK")
      case HB_UNICODE_GENERAL_CATEGORY_DECIMAL_NUMBER => Some("HB_UNICODE_GENERAL_CATEGORY_DECIMAL_NUMBER")
      case HB_UNICODE_GENERAL_CATEGORY_LETTER_NUMBER => Some("HB_UNICODE_GENERAL_CATEGORY_LETTER_NUMBER")
      case HB_UNICODE_GENERAL_CATEGORY_OTHER_NUMBER => Some("HB_UNICODE_GENERAL_CATEGORY_OTHER_NUMBER")
      case HB_UNICODE_GENERAL_CATEGORY_CONNECT_PUNCTUATION => Some("HB_UNICODE_GENERAL_CATEGORY_CONNECT_PUNCTUATION")
      case HB_UNICODE_GENERAL_CATEGORY_DASH_PUNCTUATION => Some("HB_UNICODE_GENERAL_CATEGORY_DASH_PUNCTUATION")
      case HB_UNICODE_GENERAL_CATEGORY_CLOSE_PUNCTUATION => Some("HB_UNICODE_GENERAL_CATEGORY_CLOSE_PUNCTUATION")
      case HB_UNICODE_GENERAL_CATEGORY_FINAL_PUNCTUATION => Some("HB_UNICODE_GENERAL_CATEGORY_FINAL_PUNCTUATION")
      case HB_UNICODE_GENERAL_CATEGORY_INITIAL_PUNCTUATION => Some("HB_UNICODE_GENERAL_CATEGORY_INITIAL_PUNCTUATION")
      case HB_UNICODE_GENERAL_CATEGORY_OTHER_PUNCTUATION => Some("HB_UNICODE_GENERAL_CATEGORY_OTHER_PUNCTUATION")
      case HB_UNICODE_GENERAL_CATEGORY_OPEN_PUNCTUATION => Some("HB_UNICODE_GENERAL_CATEGORY_OPEN_PUNCTUATION")
      case HB_UNICODE_GENERAL_CATEGORY_CURRENCY_SYMBOL => Some("HB_UNICODE_GENERAL_CATEGORY_CURRENCY_SYMBOL")
      case HB_UNICODE_GENERAL_CATEGORY_MODIFIER_SYMBOL => Some("HB_UNICODE_GENERAL_CATEGORY_MODIFIER_SYMBOL")
      case HB_UNICODE_GENERAL_CATEGORY_MATH_SYMBOL => Some("HB_UNICODE_GENERAL_CATEGORY_MATH_SYMBOL")
      case HB_UNICODE_GENERAL_CATEGORY_OTHER_SYMBOL => Some("HB_UNICODE_GENERAL_CATEGORY_OTHER_SYMBOL")
      case HB_UNICODE_GENERAL_CATEGORY_LINE_SEPARATOR => Some("HB_UNICODE_GENERAL_CATEGORY_LINE_SEPARATOR")
      case HB_UNICODE_GENERAL_CATEGORY_PARAGRAPH_SEPARATOR => Some("HB_UNICODE_GENERAL_CATEGORY_PARAGRAPH_SEPARATOR")
      case HB_UNICODE_GENERAL_CATEGORY_SPACE_SEPARATOR => Some("HB_UNICODE_GENERAL_CATEGORY_SPACE_SEPARATOR")
      case _ => _root_.scala.None
  extension (a: hb_unicode_general_category_t)
    inline def &(b: hb_unicode_general_category_t): hb_unicode_general_category_t = a & b
    inline def |(b: hb_unicode_general_category_t): hb_unicode_general_category_t = a | b
    inline def is(b: hb_unicode_general_category_t): Boolean = (a & b) == b