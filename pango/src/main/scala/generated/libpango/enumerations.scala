package libpango
package enumerations

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

private[libpango] trait CEnum[T](using eq: T =:= Int):
  given Tag[T] = Tag.Int.asInstanceOf[Tag[T]]
  extension (inline t: T) 
    inline def int: CInt = eq.apply(t)
    inline def value: CInt = eq.apply(t)
private[libpango] trait CEnumU[T](using eq: T =:= UInt):
  given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
  extension (inline t: T)
   inline def int: CInt = eq.apply(t).toInt
   inline def uint: CUnsignedInt = eq.apply(t)
   inline def value: CUnsignedInt = eq.apply(t)
/**
 * PangoAlignment: _ALIGN_LEFT: Put all available space on the right _ALIGN_CENTER: Center the line within the available space _ALIGN_RIGHT: Put all available space on the left

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
*/
opaque type PangoAlignment = CUnsignedInt
object PangoAlignment extends CEnumU[PangoAlignment]:
  given _tag: Tag[PangoAlignment] = Tag.UInt
  inline def define(inline a: Long): PangoAlignment = a.toUInt
  val PANGO_ALIGN_LEFT = define(0)
  val PANGO_ALIGN_CENTER = define(1)
  val PANGO_ALIGN_RIGHT = define(2)
  inline def getName(inline value: PangoAlignment): Option[String] =
    inline value match
      case PANGO_ALIGN_LEFT => Some("PANGO_ALIGN_LEFT")
      case PANGO_ALIGN_CENTER => Some("PANGO_ALIGN_CENTER")
      case PANGO_ALIGN_RIGHT => Some("PANGO_ALIGN_RIGHT")
      case _ => None
  extension (a: PangoAlignment)
    inline def &(b: PangoAlignment): PangoAlignment = a & b
    inline def |(b: PangoAlignment): PangoAlignment = a | b
    inline def is(b: PangoAlignment): Boolean = (a & b) == b

/**
 * PangoAttrType: _ATTR_INVALID: does not happen _ATTR_LANGUAGE: language ([struct.AttrLanguage]) _ATTR_FAMILY: font family name list ([struct.AttrString]) _ATTR_STYLE: font slant style ([struct.AttrInt]) _ATTR_WEIGHT: font weight ([struct.AttrInt]) _ATTR_VARIANT: font variant (normal or small caps) ([struct.AttrInt]) _ATTR_STRETCH: font stretch ([struct.AttrInt]) _ATTR_SIZE: font size in points scaled by %PANGO_SCALE ([struct.AttrInt]) _ATTR_FONT_DESC: font description ([struct.AttrFontDesc]) _ATTR_FOREGROUND: foreground color ([struct.AttrColor]) _ATTR_BACKGROUND: background color ([struct.AttrColor]) _ATTR_UNDERLINE: whether the text has an underline ([struct.AttrInt]) _ATTR_STRIKETHROUGH: whether the text is struck-through ([struct.AttrInt]) _ATTR_RISE: baseline displacement ([struct.AttrInt]) _ATTR_SHAPE: shape ([struct.AttrShape]) _ATTR_SCALE: font size scale factor ([struct.AttrFloat]) _ATTR_FALLBACK: whether fallback is enabled ([struct.AttrInt]) _ATTR_LETTER_SPACING: letter spacing ([struct]) _ATTR_UNDERLINE_COLOR: underline color ([struct.AttrColor]) _ATTR_STRIKETHROUGH_COLOR: strikethrough color ([struct.AttrColor]) _ATTR_ABSOLUTE_SIZE: font size in pixels scaled by %PANGO_SCALE ([struct.AttrInt]) _ATTR_GRAVITY: base text gravity ([struct.AttrInt]) _ATTR_GRAVITY_HINT: gravity hint ([struct.AttrInt]) _ATTR_FONT_FEATURES: OpenType font features ([struct.AttrFontFeatures]). Since 1.38 _ATTR_FOREGROUND_ALPHA: foreground alpha ([struct.AttrInt]). Since 1.38 _ATTR_BACKGROUND_ALPHA: background alpha ([struct.AttrInt]). Since 1.38 _ATTR_ALLOW_BREAKS: whether breaks are allowed ([struct.AttrInt]). Since 1.44 _ATTR_SHOW: how to render invisible characters ([struct.AttrInt]). Since 1.44 _ATTR_INSERT_HYPHENS: whether to insert hyphens at intra-word line breaks ([struct.AttrInt]). Since 1.44 _ATTR_OVERLINE: whether the text has an overline ([struct.AttrInt]). Since 1.46 _ATTR_OVERLINE_COLOR: overline color ([struct.AttrColor]). Since 1.46 _ATTR_LINE_HEIGHT: line height factor ([struct.AttrFloat]). Since: 1.50 _ATTR_ABSOLUTE_LINE_HEIGHT: line height ([struct.AttrInt]). Since: 1.50 _ATTR_WORD: override segmentation to classify the range of the attribute as a single word ([struct.AttrInt]). Since 1.50 _ATTR_SENTENCE: override segmentation to classify the range of the attribute as a single sentence ([struct.AttrInt]). Since 1.50 _ATTR_BASELINE_SHIFT: baseline displacement ([struct.AttrInt]). Since 1.50 _ATTR_FONT_SCALE: font-relative size change ([struct.AttrInt]). Since 1.50

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoAttrType = CUnsignedInt
object PangoAttrType extends CEnumU[PangoAttrType]:
  given _tag: Tag[PangoAttrType] = Tag.UInt
  inline def define(inline a: Long): PangoAttrType = a.toUInt
  val PANGO_ATTR_INVALID = define(0)
  val PANGO_ATTR_LANGUAGE = define(1)
  val PANGO_ATTR_FAMILY = define(2)
  val PANGO_ATTR_STYLE = define(3)
  val PANGO_ATTR_WEIGHT = define(4)
  val PANGO_ATTR_VARIANT = define(5)
  val PANGO_ATTR_STRETCH = define(6)
  val PANGO_ATTR_SIZE = define(7)
  val PANGO_ATTR_FONT_DESC = define(8)
  val PANGO_ATTR_FOREGROUND = define(9)
  val PANGO_ATTR_BACKGROUND = define(10)
  val PANGO_ATTR_UNDERLINE = define(11)
  val PANGO_ATTR_STRIKETHROUGH = define(12)
  val PANGO_ATTR_RISE = define(13)
  val PANGO_ATTR_SHAPE = define(14)
  val PANGO_ATTR_SCALE = define(15)
  val PANGO_ATTR_FALLBACK = define(16)
  val PANGO_ATTR_LETTER_SPACING = define(17)
  val PANGO_ATTR_UNDERLINE_COLOR = define(18)
  val PANGO_ATTR_STRIKETHROUGH_COLOR = define(19)
  val PANGO_ATTR_ABSOLUTE_SIZE = define(20)
  val PANGO_ATTR_GRAVITY = define(21)
  val PANGO_ATTR_GRAVITY_HINT = define(22)
  val PANGO_ATTR_FONT_FEATURES = define(23)
  val PANGO_ATTR_FOREGROUND_ALPHA = define(24)
  val PANGO_ATTR_BACKGROUND_ALPHA = define(25)
  val PANGO_ATTR_ALLOW_BREAKS = define(26)
  val PANGO_ATTR_SHOW = define(27)
  val PANGO_ATTR_INSERT_HYPHENS = define(28)
  val PANGO_ATTR_OVERLINE = define(29)
  val PANGO_ATTR_OVERLINE_COLOR = define(30)
  val PANGO_ATTR_LINE_HEIGHT = define(31)
  val PANGO_ATTR_ABSOLUTE_LINE_HEIGHT = define(32)
  val PANGO_ATTR_TEXT_TRANSFORM = define(33)
  val PANGO_ATTR_WORD = define(34)
  val PANGO_ATTR_SENTENCE = define(35)
  val PANGO_ATTR_BASELINE_SHIFT = define(36)
  val PANGO_ATTR_FONT_SCALE = define(37)
  inline def getName(inline value: PangoAttrType): Option[String] =
    inline value match
      case PANGO_ATTR_INVALID => Some("PANGO_ATTR_INVALID")
      case PANGO_ATTR_LANGUAGE => Some("PANGO_ATTR_LANGUAGE")
      case PANGO_ATTR_FAMILY => Some("PANGO_ATTR_FAMILY")
      case PANGO_ATTR_STYLE => Some("PANGO_ATTR_STYLE")
      case PANGO_ATTR_WEIGHT => Some("PANGO_ATTR_WEIGHT")
      case PANGO_ATTR_VARIANT => Some("PANGO_ATTR_VARIANT")
      case PANGO_ATTR_STRETCH => Some("PANGO_ATTR_STRETCH")
      case PANGO_ATTR_SIZE => Some("PANGO_ATTR_SIZE")
      case PANGO_ATTR_FONT_DESC => Some("PANGO_ATTR_FONT_DESC")
      case PANGO_ATTR_FOREGROUND => Some("PANGO_ATTR_FOREGROUND")
      case PANGO_ATTR_BACKGROUND => Some("PANGO_ATTR_BACKGROUND")
      case PANGO_ATTR_UNDERLINE => Some("PANGO_ATTR_UNDERLINE")
      case PANGO_ATTR_STRIKETHROUGH => Some("PANGO_ATTR_STRIKETHROUGH")
      case PANGO_ATTR_RISE => Some("PANGO_ATTR_RISE")
      case PANGO_ATTR_SHAPE => Some("PANGO_ATTR_SHAPE")
      case PANGO_ATTR_SCALE => Some("PANGO_ATTR_SCALE")
      case PANGO_ATTR_FALLBACK => Some("PANGO_ATTR_FALLBACK")
      case PANGO_ATTR_LETTER_SPACING => Some("PANGO_ATTR_LETTER_SPACING")
      case PANGO_ATTR_UNDERLINE_COLOR => Some("PANGO_ATTR_UNDERLINE_COLOR")
      case PANGO_ATTR_STRIKETHROUGH_COLOR => Some("PANGO_ATTR_STRIKETHROUGH_COLOR")
      case PANGO_ATTR_ABSOLUTE_SIZE => Some("PANGO_ATTR_ABSOLUTE_SIZE")
      case PANGO_ATTR_GRAVITY => Some("PANGO_ATTR_GRAVITY")
      case PANGO_ATTR_GRAVITY_HINT => Some("PANGO_ATTR_GRAVITY_HINT")
      case PANGO_ATTR_FONT_FEATURES => Some("PANGO_ATTR_FONT_FEATURES")
      case PANGO_ATTR_FOREGROUND_ALPHA => Some("PANGO_ATTR_FOREGROUND_ALPHA")
      case PANGO_ATTR_BACKGROUND_ALPHA => Some("PANGO_ATTR_BACKGROUND_ALPHA")
      case PANGO_ATTR_ALLOW_BREAKS => Some("PANGO_ATTR_ALLOW_BREAKS")
      case PANGO_ATTR_SHOW => Some("PANGO_ATTR_SHOW")
      case PANGO_ATTR_INSERT_HYPHENS => Some("PANGO_ATTR_INSERT_HYPHENS")
      case PANGO_ATTR_OVERLINE => Some("PANGO_ATTR_OVERLINE")
      case PANGO_ATTR_OVERLINE_COLOR => Some("PANGO_ATTR_OVERLINE_COLOR")
      case PANGO_ATTR_LINE_HEIGHT => Some("PANGO_ATTR_LINE_HEIGHT")
      case PANGO_ATTR_ABSOLUTE_LINE_HEIGHT => Some("PANGO_ATTR_ABSOLUTE_LINE_HEIGHT")
      case PANGO_ATTR_TEXT_TRANSFORM => Some("PANGO_ATTR_TEXT_TRANSFORM")
      case PANGO_ATTR_WORD => Some("PANGO_ATTR_WORD")
      case PANGO_ATTR_SENTENCE => Some("PANGO_ATTR_SENTENCE")
      case PANGO_ATTR_BASELINE_SHIFT => Some("PANGO_ATTR_BASELINE_SHIFT")
      case PANGO_ATTR_FONT_SCALE => Some("PANGO_ATTR_FONT_SCALE")
      case _ => None
  extension (a: PangoAttrType)
    inline def &(b: PangoAttrType): PangoAttrType = a & b
    inline def |(b: PangoAttrType): PangoAttrType = a | b
    inline def is(b: PangoAttrType): Boolean = (a & b) == b

/**
 * PangoBaselineShift: _BASELINE_SHIFT_NONE: Leave the baseline unchanged _BASELINE_SHIFT_SUPERSCRIPT: Shift the baseline to the superscript position, relative to the previous run _BASELINE_SHIFT_SUBSCRIPT: Shift the baseline to the subscript position, relative to the previous run

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoBaselineShift = CUnsignedInt
object PangoBaselineShift extends CEnumU[PangoBaselineShift]:
  given _tag: Tag[PangoBaselineShift] = Tag.UInt
  inline def define(inline a: Long): PangoBaselineShift = a.toUInt
  val PANGO_BASELINE_SHIFT_NONE = define(0)
  val PANGO_BASELINE_SHIFT_SUPERSCRIPT = define(1)
  val PANGO_BASELINE_SHIFT_SUBSCRIPT = define(2)
  inline def getName(inline value: PangoBaselineShift): Option[String] =
    inline value match
      case PANGO_BASELINE_SHIFT_NONE => Some("PANGO_BASELINE_SHIFT_NONE")
      case PANGO_BASELINE_SHIFT_SUPERSCRIPT => Some("PANGO_BASELINE_SHIFT_SUPERSCRIPT")
      case PANGO_BASELINE_SHIFT_SUBSCRIPT => Some("PANGO_BASELINE_SHIFT_SUBSCRIPT")
      case _ => None
  extension (a: PangoBaselineShift)
    inline def &(b: PangoBaselineShift): PangoBaselineShift = a & b
    inline def |(b: PangoBaselineShift): PangoBaselineShift = a | b
    inline def is(b: PangoBaselineShift): Boolean = (a & b) == b

/**
 * PangoBidiType: _BIDI_TYPE_L: Left-to-Right _BIDI_TYPE_LRE: Left-to-Right Embedding _BIDI_TYPE_LRO: Left-to-Right Override _BIDI_TYPE_R: Right-to-Left _BIDI_TYPE_AL: Right-to-Left Arabic _BIDI_TYPE_RLE: Right-to-Left Embedding _BIDI_TYPE_RLO: Right-to-Left Override _BIDI_TYPE_PDF: Pop Directional Format _BIDI_TYPE_EN: European Number _BIDI_TYPE_ES: European Number Separator _BIDI_TYPE_ET: European Number Terminator _BIDI_TYPE_AN: Arabic Number _BIDI_TYPE_CS: Common Number Separator _BIDI_TYPE_NSM: Nonspacing Mark _BIDI_TYPE_BN: Boundary Neutral _BIDI_TYPE_B: Paragraph Separator _BIDI_TYPE_S: Segment Separator _BIDI_TYPE_WS: Whitespace _BIDI_TYPE_ON: Other Neutrals _BIDI_TYPE_LRI: Left-to-Right isolate. Since 1.48.6 _BIDI_TYPE_RLI: Right-to-Left isolate. Since 1.48.6 _BIDI_TYPE_FSI: First strong isolate. Since 1.48.6 _BIDI_TYPE_PDI: Pop directional isolate. Since 1.48.6

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-bidi-type.h
*/
opaque type PangoBidiType = CUnsignedInt
object PangoBidiType extends CEnumU[PangoBidiType]:
  given _tag: Tag[PangoBidiType] = Tag.UInt
  inline def define(inline a: Long): PangoBidiType = a.toUInt
  val PANGO_BIDI_TYPE_L = define(0)
  val PANGO_BIDI_TYPE_LRE = define(1)
  val PANGO_BIDI_TYPE_LRO = define(2)
  val PANGO_BIDI_TYPE_R = define(3)
  val PANGO_BIDI_TYPE_AL = define(4)
  val PANGO_BIDI_TYPE_RLE = define(5)
  val PANGO_BIDI_TYPE_RLO = define(6)
  val PANGO_BIDI_TYPE_PDF = define(7)
  val PANGO_BIDI_TYPE_EN = define(8)
  val PANGO_BIDI_TYPE_ES = define(9)
  val PANGO_BIDI_TYPE_ET = define(10)
  val PANGO_BIDI_TYPE_AN = define(11)
  val PANGO_BIDI_TYPE_CS = define(12)
  val PANGO_BIDI_TYPE_NSM = define(13)
  val PANGO_BIDI_TYPE_BN = define(14)
  val PANGO_BIDI_TYPE_B = define(15)
  val PANGO_BIDI_TYPE_S = define(16)
  val PANGO_BIDI_TYPE_WS = define(17)
  val PANGO_BIDI_TYPE_ON = define(18)
  val PANGO_BIDI_TYPE_LRI = define(19)
  val PANGO_BIDI_TYPE_RLI = define(20)
  val PANGO_BIDI_TYPE_FSI = define(21)
  val PANGO_BIDI_TYPE_PDI = define(22)
  inline def getName(inline value: PangoBidiType): Option[String] =
    inline value match
      case PANGO_BIDI_TYPE_L => Some("PANGO_BIDI_TYPE_L")
      case PANGO_BIDI_TYPE_LRE => Some("PANGO_BIDI_TYPE_LRE")
      case PANGO_BIDI_TYPE_LRO => Some("PANGO_BIDI_TYPE_LRO")
      case PANGO_BIDI_TYPE_R => Some("PANGO_BIDI_TYPE_R")
      case PANGO_BIDI_TYPE_AL => Some("PANGO_BIDI_TYPE_AL")
      case PANGO_BIDI_TYPE_RLE => Some("PANGO_BIDI_TYPE_RLE")
      case PANGO_BIDI_TYPE_RLO => Some("PANGO_BIDI_TYPE_RLO")
      case PANGO_BIDI_TYPE_PDF => Some("PANGO_BIDI_TYPE_PDF")
      case PANGO_BIDI_TYPE_EN => Some("PANGO_BIDI_TYPE_EN")
      case PANGO_BIDI_TYPE_ES => Some("PANGO_BIDI_TYPE_ES")
      case PANGO_BIDI_TYPE_ET => Some("PANGO_BIDI_TYPE_ET")
      case PANGO_BIDI_TYPE_AN => Some("PANGO_BIDI_TYPE_AN")
      case PANGO_BIDI_TYPE_CS => Some("PANGO_BIDI_TYPE_CS")
      case PANGO_BIDI_TYPE_NSM => Some("PANGO_BIDI_TYPE_NSM")
      case PANGO_BIDI_TYPE_BN => Some("PANGO_BIDI_TYPE_BN")
      case PANGO_BIDI_TYPE_B => Some("PANGO_BIDI_TYPE_B")
      case PANGO_BIDI_TYPE_S => Some("PANGO_BIDI_TYPE_S")
      case PANGO_BIDI_TYPE_WS => Some("PANGO_BIDI_TYPE_WS")
      case PANGO_BIDI_TYPE_ON => Some("PANGO_BIDI_TYPE_ON")
      case PANGO_BIDI_TYPE_LRI => Some("PANGO_BIDI_TYPE_LRI")
      case PANGO_BIDI_TYPE_RLI => Some("PANGO_BIDI_TYPE_RLI")
      case PANGO_BIDI_TYPE_FSI => Some("PANGO_BIDI_TYPE_FSI")
      case PANGO_BIDI_TYPE_PDI => Some("PANGO_BIDI_TYPE_PDI")
      case _ => None
  extension (a: PangoBidiType)
    inline def &(b: PangoBidiType): PangoBidiType = a & b
    inline def |(b: PangoBidiType): PangoBidiType = a | b
    inline def is(b: PangoBidiType): Boolean = (a & b) == b

/**
 * PangoCoverageLevel: _COVERAGE_NONE: The character is not representable with the font. _COVERAGE_FALLBACK: The character is represented in a way that may be comprehensible but is not the correct graphical form. For instance, a Hangul character represented as a a sequence of Jamos, or a Latin transliteration of a Cyrillic word. _COVERAGE_APPROXIMATE: The character is represented as basically the correct graphical form, but with a stylistic variant inappropriate for the current script. _COVERAGE_EXACT: The character is represented as the correct graphical form.

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-coverage.h
*/
opaque type PangoCoverageLevel = CUnsignedInt
object PangoCoverageLevel extends CEnumU[PangoCoverageLevel]:
  given _tag: Tag[PangoCoverageLevel] = Tag.UInt
  inline def define(inline a: Long): PangoCoverageLevel = a.toUInt
  val PANGO_COVERAGE_NONE = define(0)
  val PANGO_COVERAGE_FALLBACK = define(1)
  val PANGO_COVERAGE_APPROXIMATE = define(2)
  val PANGO_COVERAGE_EXACT = define(3)
  inline def getName(inline value: PangoCoverageLevel): Option[String] =
    inline value match
      case PANGO_COVERAGE_NONE => Some("PANGO_COVERAGE_NONE")
      case PANGO_COVERAGE_FALLBACK => Some("PANGO_COVERAGE_FALLBACK")
      case PANGO_COVERAGE_APPROXIMATE => Some("PANGO_COVERAGE_APPROXIMATE")
      case PANGO_COVERAGE_EXACT => Some("PANGO_COVERAGE_EXACT")
      case _ => None
  extension (a: PangoCoverageLevel)
    inline def &(b: PangoCoverageLevel): PangoCoverageLevel = a & b
    inline def |(b: PangoCoverageLevel): PangoCoverageLevel = a | b
    inline def is(b: PangoCoverageLevel): Boolean = (a & b) == b

/**
 * PangoDirection: _DIRECTION_LTR: A strong left-to-right direction _DIRECTION_RTL: A strong right-to-left direction _DIRECTION_TTB_LTR: Deprecated value; treated the same as `PANGO_DIRECTION_RTL`. _DIRECTION_TTB_RTL: Deprecated value; treated the same as `PANGO_DIRECTION_LTR` _DIRECTION_WEAK_LTR: A weak left-to-right direction _DIRECTION_WEAK_RTL: A weak right-to-left direction _DIRECTION_NEUTRAL: No direction specified

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-direction.h
*/
opaque type PangoDirection = CUnsignedInt
object PangoDirection extends CEnumU[PangoDirection]:
  given _tag: Tag[PangoDirection] = Tag.UInt
  inline def define(inline a: Long): PangoDirection = a.toUInt
  val PANGO_DIRECTION_LTR = define(0)
  val PANGO_DIRECTION_RTL = define(1)
  val PANGO_DIRECTION_TTB_LTR = define(2)
  val PANGO_DIRECTION_TTB_RTL = define(3)
  val PANGO_DIRECTION_WEAK_LTR = define(4)
  val PANGO_DIRECTION_WEAK_RTL = define(5)
  val PANGO_DIRECTION_NEUTRAL = define(6)
  inline def getName(inline value: PangoDirection): Option[String] =
    inline value match
      case PANGO_DIRECTION_LTR => Some("PANGO_DIRECTION_LTR")
      case PANGO_DIRECTION_RTL => Some("PANGO_DIRECTION_RTL")
      case PANGO_DIRECTION_TTB_LTR => Some("PANGO_DIRECTION_TTB_LTR")
      case PANGO_DIRECTION_TTB_RTL => Some("PANGO_DIRECTION_TTB_RTL")
      case PANGO_DIRECTION_WEAK_LTR => Some("PANGO_DIRECTION_WEAK_LTR")
      case PANGO_DIRECTION_WEAK_RTL => Some("PANGO_DIRECTION_WEAK_RTL")
      case PANGO_DIRECTION_NEUTRAL => Some("PANGO_DIRECTION_NEUTRAL")
      case _ => None
  extension (a: PangoDirection)
    inline def &(b: PangoDirection): PangoDirection = a & b
    inline def |(b: PangoDirection): PangoDirection = a | b
    inline def is(b: PangoDirection): Boolean = (a & b) == b

/**
 * PangoEllipsizeMode: _ELLIPSIZE_NONE: No ellipsization _ELLIPSIZE_START: Omit characters at the start of the text _ELLIPSIZE_MIDDLE: Omit characters in the middle of the text _ELLIPSIZE_END: Omit characters at the end of the text

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
*/
opaque type PangoEllipsizeMode = CUnsignedInt
object PangoEllipsizeMode extends CEnumU[PangoEllipsizeMode]:
  given _tag: Tag[PangoEllipsizeMode] = Tag.UInt
  inline def define(inline a: Long): PangoEllipsizeMode = a.toUInt
  val PANGO_ELLIPSIZE_NONE = define(0)
  val PANGO_ELLIPSIZE_START = define(1)
  val PANGO_ELLIPSIZE_MIDDLE = define(2)
  val PANGO_ELLIPSIZE_END = define(3)
  inline def getName(inline value: PangoEllipsizeMode): Option[String] =
    inline value match
      case PANGO_ELLIPSIZE_NONE => Some("PANGO_ELLIPSIZE_NONE")
      case PANGO_ELLIPSIZE_START => Some("PANGO_ELLIPSIZE_START")
      case PANGO_ELLIPSIZE_MIDDLE => Some("PANGO_ELLIPSIZE_MIDDLE")
      case PANGO_ELLIPSIZE_END => Some("PANGO_ELLIPSIZE_END")
      case _ => None
  extension (a: PangoEllipsizeMode)
    inline def &(b: PangoEllipsizeMode): PangoEllipsizeMode = a & b
    inline def |(b: PangoEllipsizeMode): PangoEllipsizeMode = a | b
    inline def is(b: PangoEllipsizeMode): Boolean = (a & b) == b

/**
 * PangoFontMask: _FONT_MASK_FAMILY: the font family is specified. _FONT_MASK_STYLE: the font style is specified. _FONT_MASK_VARIANT: the font variant is specified. _FONT_MASK_WEIGHT: the font weight is specified. _FONT_MASK_STRETCH: the font stretch is specified. _FONT_MASK_SIZE: the font size is specified. _FONT_MASK_GRAVITY: the font gravity is specified (Since: 1.16.) _FONT_MASK_VARIATIONS: OpenType font variations are specified (Since: 1.42)

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
*/
opaque type PangoFontMask = CUnsignedInt
object PangoFontMask extends CEnumU[PangoFontMask]:
  given _tag: Tag[PangoFontMask] = Tag.UInt
  inline def define(inline a: Long): PangoFontMask = a.toUInt
  val PANGO_FONT_MASK_FAMILY = define(1)
  val PANGO_FONT_MASK_STYLE = define(2)
  val PANGO_FONT_MASK_VARIANT = define(4)
  val PANGO_FONT_MASK_WEIGHT = define(8)
  val PANGO_FONT_MASK_STRETCH = define(16)
  val PANGO_FONT_MASK_SIZE = define(32)
  val PANGO_FONT_MASK_GRAVITY = define(64)
  val PANGO_FONT_MASK_VARIATIONS = define(128)
  inline def getName(inline value: PangoFontMask): Option[String] =
    inline value match
      case PANGO_FONT_MASK_FAMILY => Some("PANGO_FONT_MASK_FAMILY")
      case PANGO_FONT_MASK_STYLE => Some("PANGO_FONT_MASK_STYLE")
      case PANGO_FONT_MASK_VARIANT => Some("PANGO_FONT_MASK_VARIANT")
      case PANGO_FONT_MASK_WEIGHT => Some("PANGO_FONT_MASK_WEIGHT")
      case PANGO_FONT_MASK_STRETCH => Some("PANGO_FONT_MASK_STRETCH")
      case PANGO_FONT_MASK_SIZE => Some("PANGO_FONT_MASK_SIZE")
      case PANGO_FONT_MASK_GRAVITY => Some("PANGO_FONT_MASK_GRAVITY")
      case PANGO_FONT_MASK_VARIATIONS => Some("PANGO_FONT_MASK_VARIATIONS")
      case _ => None
  extension (a: PangoFontMask)
    inline def &(b: PangoFontMask): PangoFontMask = a & b
    inline def |(b: PangoFontMask): PangoFontMask = a | b
    inline def is(b: PangoFontMask): Boolean = (a & b) == b

/**
 * PangoFontScale: _FONT_SCALE_NONE: Leave the font size unchanged _FONT_SCALE_SUPERSCRIPT: Change the font to a size suitable for superscripts _FONT_SCALE_SUBSCRIPT: Change the font to a size suitable for subscripts _FONT_SCALE_SMALL_CAPS: Change the font to a size suitable for Small Caps

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoFontScale = CUnsignedInt
object PangoFontScale extends CEnumU[PangoFontScale]:
  given _tag: Tag[PangoFontScale] = Tag.UInt
  inline def define(inline a: Long): PangoFontScale = a.toUInt
  val PANGO_FONT_SCALE_NONE = define(0)
  val PANGO_FONT_SCALE_SUPERSCRIPT = define(1)
  val PANGO_FONT_SCALE_SUBSCRIPT = define(2)
  val PANGO_FONT_SCALE_SMALL_CAPS = define(3)
  inline def getName(inline value: PangoFontScale): Option[String] =
    inline value match
      case PANGO_FONT_SCALE_NONE => Some("PANGO_FONT_SCALE_NONE")
      case PANGO_FONT_SCALE_SUPERSCRIPT => Some("PANGO_FONT_SCALE_SUPERSCRIPT")
      case PANGO_FONT_SCALE_SUBSCRIPT => Some("PANGO_FONT_SCALE_SUBSCRIPT")
      case PANGO_FONT_SCALE_SMALL_CAPS => Some("PANGO_FONT_SCALE_SMALL_CAPS")
      case _ => None
  extension (a: PangoFontScale)
    inline def &(b: PangoFontScale): PangoFontScale = a & b
    inline def |(b: PangoFontScale): PangoFontScale = a | b
    inline def is(b: PangoFontScale): Boolean = (a & b) == b

/**
 * PangoGravity: _GRAVITY_SOUTH: Glyphs stand upright (default) _GRAVITY_EAST: Glyphs are rotated 90 degrees counter-clockwise. _GRAVITY_NORTH: Glyphs are upside-down. _GRAVITY_WEST: Glyphs are rotated 90 degrees clockwise. _GRAVITY_AUTO: Gravity is resolved from the context matrix

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-gravity.h
*/
opaque type PangoGravity = CUnsignedInt
object PangoGravity extends CEnumU[PangoGravity]:
  given _tag: Tag[PangoGravity] = Tag.UInt
  inline def define(inline a: Long): PangoGravity = a.toUInt
  val PANGO_GRAVITY_SOUTH = define(0)
  val PANGO_GRAVITY_EAST = define(1)
  val PANGO_GRAVITY_NORTH = define(2)
  val PANGO_GRAVITY_WEST = define(3)
  val PANGO_GRAVITY_AUTO = define(4)
  inline def getName(inline value: PangoGravity): Option[String] =
    inline value match
      case PANGO_GRAVITY_SOUTH => Some("PANGO_GRAVITY_SOUTH")
      case PANGO_GRAVITY_EAST => Some("PANGO_GRAVITY_EAST")
      case PANGO_GRAVITY_NORTH => Some("PANGO_GRAVITY_NORTH")
      case PANGO_GRAVITY_WEST => Some("PANGO_GRAVITY_WEST")
      case PANGO_GRAVITY_AUTO => Some("PANGO_GRAVITY_AUTO")
      case _ => None
  extension (a: PangoGravity)
    inline def &(b: PangoGravity): PangoGravity = a & b
    inline def |(b: PangoGravity): PangoGravity = a | b
    inline def is(b: PangoGravity): Boolean = (a & b) == b

/**
 * PangoGravityHint: _GRAVITY_HINT_NATURAL: scripts will take their natural gravity based on the base gravity and the script. This is the default. _GRAVITY_HINT_STRONG: always use the base gravity set, regardless of the script. _GRAVITY_HINT_LINE: for scripts not in their natural direction (eg. Latin in East gravity), choose per-script gravity such that every script respects the line progression. This means, Latin and Arabic will take opposite gravities and both flow top-to-bottom for example.

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-gravity.h
*/
opaque type PangoGravityHint = CUnsignedInt
object PangoGravityHint extends CEnumU[PangoGravityHint]:
  given _tag: Tag[PangoGravityHint] = Tag.UInt
  inline def define(inline a: Long): PangoGravityHint = a.toUInt
  val PANGO_GRAVITY_HINT_NATURAL = define(0)
  val PANGO_GRAVITY_HINT_STRONG = define(1)
  val PANGO_GRAVITY_HINT_LINE = define(2)
  inline def getName(inline value: PangoGravityHint): Option[String] =
    inline value match
      case PANGO_GRAVITY_HINT_NATURAL => Some("PANGO_GRAVITY_HINT_NATURAL")
      case PANGO_GRAVITY_HINT_STRONG => Some("PANGO_GRAVITY_HINT_STRONG")
      case PANGO_GRAVITY_HINT_LINE => Some("PANGO_GRAVITY_HINT_LINE")
      case _ => None
  extension (a: PangoGravityHint)
    inline def &(b: PangoGravityHint): PangoGravityHint = a & b
    inline def |(b: PangoGravityHint): PangoGravityHint = a | b
    inline def is(b: PangoGravityHint): Boolean = (a & b) == b

/**
 * PangoLayoutDeserializeError: _LAYOUT_DESERIALIZE_INVALID: Unspecified error _LAYOUT_DESERIALIZE_INVALID_VALUE: A JSon value could not be interpreted _LAYOUT_DESERIALIZE_MISSING_VALUE: A required JSon member was not found

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
*/
opaque type PangoLayoutDeserializeError = CUnsignedInt
object PangoLayoutDeserializeError extends CEnumU[PangoLayoutDeserializeError]:
  given _tag: Tag[PangoLayoutDeserializeError] = Tag.UInt
  inline def define(inline a: Long): PangoLayoutDeserializeError = a.toUInt
  val PANGO_LAYOUT_DESERIALIZE_INVALID = define(0)
  val PANGO_LAYOUT_DESERIALIZE_INVALID_VALUE = define(1)
  val PANGO_LAYOUT_DESERIALIZE_MISSING_VALUE = define(2)
  inline def getName(inline value: PangoLayoutDeserializeError): Option[String] =
    inline value match
      case PANGO_LAYOUT_DESERIALIZE_INVALID => Some("PANGO_LAYOUT_DESERIALIZE_INVALID")
      case PANGO_LAYOUT_DESERIALIZE_INVALID_VALUE => Some("PANGO_LAYOUT_DESERIALIZE_INVALID_VALUE")
      case PANGO_LAYOUT_DESERIALIZE_MISSING_VALUE => Some("PANGO_LAYOUT_DESERIALIZE_MISSING_VALUE")
      case _ => None
  extension (a: PangoLayoutDeserializeError)
    inline def &(b: PangoLayoutDeserializeError): PangoLayoutDeserializeError = a & b
    inline def |(b: PangoLayoutDeserializeError): PangoLayoutDeserializeError = a | b
    inline def is(b: PangoLayoutDeserializeError): Boolean = (a & b) == b

/**
 * PangoLayoutDeserializeFlags: _LAYOUT_DESERIALIZE_DEFAULT: Default behavior _LAYOUT_DESERIALIZE_CONTEXT: Apply context information from the serialization to the `PangoContext`

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
*/
opaque type PangoLayoutDeserializeFlags = CUnsignedInt
object PangoLayoutDeserializeFlags extends CEnumU[PangoLayoutDeserializeFlags]:
  given _tag: Tag[PangoLayoutDeserializeFlags] = Tag.UInt
  inline def define(inline a: Long): PangoLayoutDeserializeFlags = a.toUInt
  val PANGO_LAYOUT_DESERIALIZE_DEFAULT = define(0)
  val PANGO_LAYOUT_DESERIALIZE_CONTEXT = define(1)
  inline def getName(inline value: PangoLayoutDeserializeFlags): Option[String] =
    inline value match
      case PANGO_LAYOUT_DESERIALIZE_DEFAULT => Some("PANGO_LAYOUT_DESERIALIZE_DEFAULT")
      case PANGO_LAYOUT_DESERIALIZE_CONTEXT => Some("PANGO_LAYOUT_DESERIALIZE_CONTEXT")
      case _ => None
  extension (a: PangoLayoutDeserializeFlags)
    inline def &(b: PangoLayoutDeserializeFlags): PangoLayoutDeserializeFlags = a & b
    inline def |(b: PangoLayoutDeserializeFlags): PangoLayoutDeserializeFlags = a | b
    inline def is(b: PangoLayoutDeserializeFlags): Boolean = (a & b) == b

/**
 * PangoLayoutSerializeFlags: _LAYOUT_SERIALIZE_DEFAULT: Default behavior _LAYOUT_SERIALIZE_CONTEXT: Include context information _LAYOUT_SERIALIZE_OUTPUT: Include information about the formatted output

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
*/
opaque type PangoLayoutSerializeFlags = CUnsignedInt
object PangoLayoutSerializeFlags extends CEnumU[PangoLayoutSerializeFlags]:
  given _tag: Tag[PangoLayoutSerializeFlags] = Tag.UInt
  inline def define(inline a: Long): PangoLayoutSerializeFlags = a.toUInt
  val PANGO_LAYOUT_SERIALIZE_DEFAULT = define(0)
  val PANGO_LAYOUT_SERIALIZE_CONTEXT = define(1)
  val PANGO_LAYOUT_SERIALIZE_OUTPUT = define(2)
  inline def getName(inline value: PangoLayoutSerializeFlags): Option[String] =
    inline value match
      case PANGO_LAYOUT_SERIALIZE_DEFAULT => Some("PANGO_LAYOUT_SERIALIZE_DEFAULT")
      case PANGO_LAYOUT_SERIALIZE_CONTEXT => Some("PANGO_LAYOUT_SERIALIZE_CONTEXT")
      case PANGO_LAYOUT_SERIALIZE_OUTPUT => Some("PANGO_LAYOUT_SERIALIZE_OUTPUT")
      case _ => None
  extension (a: PangoLayoutSerializeFlags)
    inline def &(b: PangoLayoutSerializeFlags): PangoLayoutSerializeFlags = a & b
    inline def |(b: PangoLayoutSerializeFlags): PangoLayoutSerializeFlags = a | b
    inline def is(b: PangoLayoutSerializeFlags): Boolean = (a & b) == b

/**
 * PangoOverline: _OVERLINE_NONE: no overline should be drawn _OVERLINE_SINGLE: Draw a single line above the ink extents of the text being underlined.

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoOverline = CUnsignedInt
object PangoOverline extends CEnumU[PangoOverline]:
  given _tag: Tag[PangoOverline] = Tag.UInt
  inline def define(inline a: Long): PangoOverline = a.toUInt
  val PANGO_OVERLINE_NONE = define(0)
  val PANGO_OVERLINE_SINGLE = define(1)
  inline def getName(inline value: PangoOverline): Option[String] =
    inline value match
      case PANGO_OVERLINE_NONE => Some("PANGO_OVERLINE_NONE")
      case PANGO_OVERLINE_SINGLE => Some("PANGO_OVERLINE_SINGLE")
      case _ => None
  extension (a: PangoOverline)
    inline def &(b: PangoOverline): PangoOverline = a & b
    inline def |(b: PangoOverline): PangoOverline = a | b
    inline def is(b: PangoOverline): Boolean = (a & b) == b

/**
 * [bindgen] header: /usr/include/pango-1.0/pango/pango-renderer.h
*/
opaque type PangoRenderPart = CUnsignedInt
object PangoRenderPart extends CEnumU[PangoRenderPart]:
  given _tag: Tag[PangoRenderPart] = Tag.UInt
  inline def define(inline a: Long): PangoRenderPart = a.toUInt
  val PANGO_RENDER_PART_FOREGROUND = define(0)
  val PANGO_RENDER_PART_BACKGROUND = define(1)
  val PANGO_RENDER_PART_UNDERLINE = define(2)
  val PANGO_RENDER_PART_STRIKETHROUGH = define(3)
  val PANGO_RENDER_PART_OVERLINE = define(4)
  inline def getName(inline value: PangoRenderPart): Option[String] =
    inline value match
      case PANGO_RENDER_PART_FOREGROUND => Some("PANGO_RENDER_PART_FOREGROUND")
      case PANGO_RENDER_PART_BACKGROUND => Some("PANGO_RENDER_PART_BACKGROUND")
      case PANGO_RENDER_PART_UNDERLINE => Some("PANGO_RENDER_PART_UNDERLINE")
      case PANGO_RENDER_PART_STRIKETHROUGH => Some("PANGO_RENDER_PART_STRIKETHROUGH")
      case PANGO_RENDER_PART_OVERLINE => Some("PANGO_RENDER_PART_OVERLINE")
      case _ => None
  extension (a: PangoRenderPart)
    inline def &(b: PangoRenderPart): PangoRenderPart = a & b
    inline def |(b: PangoRenderPart): PangoRenderPart = a | b
    inline def is(b: PangoRenderPart): Boolean = (a & b) == b

/**
 * PangoScript: _SCRIPT_INVALID_CODE: a value never returned from pango_script_for_unichar() _SCRIPT_COMMON: a character used by multiple different scripts _SCRIPT_INHERITED: a mark glyph that takes its script from the base glyph to which it is attached _SCRIPT_ARABIC: Arabic _SCRIPT_ARMENIAN: Armenian _SCRIPT_BENGALI: Bengali _SCRIPT_BOPOMOFO: Bopomofo _SCRIPT_CHEROKEE: Cherokee _SCRIPT_COPTIC: Coptic _SCRIPT_CYRILLIC: Cyrillic _SCRIPT_DESERET: Deseret _SCRIPT_DEVANAGARI: Devanagari _SCRIPT_ETHIOPIC: Ethiopic _SCRIPT_GEORGIAN: Georgian _SCRIPT_GOTHIC: Gothic _SCRIPT_GREEK: Greek _SCRIPT_GUJARATI: Gujarati _SCRIPT_GURMUKHI: Gurmukhi _SCRIPT_HAN: Han _SCRIPT_HANGUL: Hangul _SCRIPT_HEBREW: Hebrew _SCRIPT_HIRAGANA: Hiragana _SCRIPT_KANNADA: Kannada _SCRIPT_KATAKANA: Katakana _SCRIPT_KHMER: Khmer _SCRIPT_LAO: Lao _SCRIPT_LATIN: Latin _SCRIPT_MALAYALAM: Malayalam _SCRIPT_MONGOLIAN: Mongolian _SCRIPT_MYANMAR: Myanmar _SCRIPT_OGHAM: Ogham _SCRIPT_OLD_ITALIC: Old Italic _SCRIPT_ORIYA: Oriya _SCRIPT_RUNIC: Runic _SCRIPT_SINHALA: Sinhala _SCRIPT_SYRIAC: Syriac _SCRIPT_TAMIL: Tamil _SCRIPT_TELUGU: Telugu _SCRIPT_THAANA: Thaana _SCRIPT_THAI: Thai _SCRIPT_TIBETAN: Tibetan _SCRIPT_CANADIAN_ABORIGINAL: Canadian Aboriginal _SCRIPT_YI: Yi _SCRIPT_TAGALOG: Tagalog _SCRIPT_HANUNOO: Hanunoo _SCRIPT_BUHID: Buhid _SCRIPT_TAGBANWA: Tagbanwa _SCRIPT_BRAILLE: Braille _SCRIPT_CYPRIOT: Cypriot _SCRIPT_LIMBU: Limbu _SCRIPT_OSMANYA: Osmanya _SCRIPT_SHAVIAN: Shavian _SCRIPT_LINEAR_B: Linear B _SCRIPT_TAI_LE: Tai Le _SCRIPT_UGARITIC: Ugaritic _SCRIPT_NEW_TAI_LUE: New Tai Lue. Since 1.10 _SCRIPT_BUGINESE: Buginese. Since 1.10 _SCRIPT_GLAGOLITIC: Glagolitic. Since 1.10 _SCRIPT_TIFINAGH: Tifinagh. Since 1.10 _SCRIPT_SYLOTI_NAGRI: Syloti Nagri. Since 1.10 _SCRIPT_OLD_PERSIAN: Old Persian. Since 1.10 _SCRIPT_KHAROSHTHI: Kharoshthi. Since 1.10 _SCRIPT_UNKNOWN: an unassigned code point. Since 1.14 _SCRIPT_BALINESE: Balinese. Since 1.14 _SCRIPT_CUNEIFORM: Cuneiform. Since 1.14 _SCRIPT_PHOENICIAN: Phoenician. Since 1.14 _SCRIPT_PHAGS_PA: Phags-pa. Since 1.14 _SCRIPT_NKO: N'Ko. Since 1.14 _SCRIPT_KAYAH_LI: Kayah Li. Since 1.20.1 _SCRIPT_LEPCHA: Lepcha. Since 1.20.1 _SCRIPT_REJANG: Rejang. Since 1.20.1 _SCRIPT_SUNDANESE: Sundanese. Since 1.20.1 _SCRIPT_SAURASHTRA: Saurashtra. Since 1.20.1 _SCRIPT_CHAM: Cham. Since 1.20.1 _SCRIPT_OL_CHIKI: Ol Chiki. Since 1.20.1 _SCRIPT_VAI: Vai. Since 1.20.1 _SCRIPT_CARIAN: Carian. Since 1.20.1 _SCRIPT_LYCIAN: Lycian. Since 1.20.1 _SCRIPT_LYDIAN: Lydian. Since 1.20.1 _SCRIPT_BATAK: Batak. Since 1.32 _SCRIPT_BRAHMI: Brahmi. Since 1.32 _SCRIPT_MANDAIC: Mandaic. Since 1.32 _SCRIPT_CHAKMA: Chakma. Since: 1.32 _SCRIPT_MEROITIC_CURSIVE: Meroitic Cursive. Since: 1.32 _SCRIPT_MEROITIC_HIEROGLYPHS: Meroitic Hieroglyphs. Since: 1.32 _SCRIPT_MIAO: Miao. Since: 1.32 _SCRIPT_SHARADA: Sharada. Since: 1.32 _SCRIPT_SORA_SOMPENG: Sora Sompeng. Since: 1.32 _SCRIPT_TAKRI: Takri. Since: 1.32 _SCRIPT_BASSA_VAH: Bassa. Since: 1.40 _SCRIPT_CAUCASIAN_ALBANIAN: Caucasian Albanian. Since: 1.40 _SCRIPT_DUPLOYAN: Duployan. Since: 1.40 _SCRIPT_ELBASAN: Elbasan. Since: 1.40 _SCRIPT_GRANTHA: Grantha. Since: 1.40 _SCRIPT_KHOJKI: Kjohki. Since: 1.40 _SCRIPT_KHUDAWADI: Khudawadi, Sindhi. Since: 1.40 _SCRIPT_LINEAR_A: Linear A. Since: 1.40 _SCRIPT_MAHAJANI: Mahajani. Since: 1.40 _SCRIPT_MANICHAEAN: Manichaean. Since: 1.40 _SCRIPT_MENDE_KIKAKUI: Mende Kikakui. Since: 1.40 _SCRIPT_MODI: Modi. Since: 1.40 _SCRIPT_MRO: Mro. Since: 1.40 _SCRIPT_NABATAEAN: Nabataean. Since: 1.40 _SCRIPT_OLD_NORTH_ARABIAN: Old North Arabian. Since: 1.40 _SCRIPT_OLD_PERMIC: Old Permic. Since: 1.40 _SCRIPT_PAHAWH_HMONG: Pahawh Hmong. Since: 1.40 _SCRIPT_PALMYRENE: Palmyrene. Since: 1.40 _SCRIPT_PAU_CIN_HAU: Pau Cin Hau. Since: 1.40 _SCRIPT_PSALTER_PAHLAVI: Psalter Pahlavi. Since: 1.40 _SCRIPT_SIDDHAM: Siddham. Since: 1.40 _SCRIPT_TIRHUTA: Tirhuta. Since: 1.40 _SCRIPT_WARANG_CITI: Warang Citi. Since: 1.40 _SCRIPT_AHOM: Ahom. Since: 1.40 _SCRIPT_ANATOLIAN_HIEROGLYPHS: Anatolian Hieroglyphs. Since: 1.40 _SCRIPT_HATRAN: Hatran. Since: 1.40 _SCRIPT_MULTANI: Multani. Since: 1.40 _SCRIPT_OLD_HUNGARIAN: Old Hungarian. Since: 1.40 _SCRIPT_SIGNWRITING: Signwriting. Since: 1.40

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-script.h
*/
opaque type PangoScript = CInt
object PangoScript extends CEnum[PangoScript]:
  given _tag: Tag[PangoScript] = Tag.Int
  inline def define(inline a: CInt): PangoScript = a
  val PANGO_SCRIPT_INVALID_CODE = define(-1)
  val PANGO_SCRIPT_COMMON = define(0)
  val PANGO_SCRIPT_INHERITED = define(1)
  val PANGO_SCRIPT_ARABIC = define(2)
  val PANGO_SCRIPT_ARMENIAN = define(3)
  val PANGO_SCRIPT_BENGALI = define(4)
  val PANGO_SCRIPT_BOPOMOFO = define(5)
  val PANGO_SCRIPT_CHEROKEE = define(6)
  val PANGO_SCRIPT_COPTIC = define(7)
  val PANGO_SCRIPT_CYRILLIC = define(8)
  val PANGO_SCRIPT_DESERET = define(9)
  val PANGO_SCRIPT_DEVANAGARI = define(10)
  val PANGO_SCRIPT_ETHIOPIC = define(11)
  val PANGO_SCRIPT_GEORGIAN = define(12)
  val PANGO_SCRIPT_GOTHIC = define(13)
  val PANGO_SCRIPT_GREEK = define(14)
  val PANGO_SCRIPT_GUJARATI = define(15)
  val PANGO_SCRIPT_GURMUKHI = define(16)
  val PANGO_SCRIPT_HAN = define(17)
  val PANGO_SCRIPT_HANGUL = define(18)
  val PANGO_SCRIPT_HEBREW = define(19)
  val PANGO_SCRIPT_HIRAGANA = define(20)
  val PANGO_SCRIPT_KANNADA = define(21)
  val PANGO_SCRIPT_KATAKANA = define(22)
  val PANGO_SCRIPT_KHMER = define(23)
  val PANGO_SCRIPT_LAO = define(24)
  val PANGO_SCRIPT_LATIN = define(25)
  val PANGO_SCRIPT_MALAYALAM = define(26)
  val PANGO_SCRIPT_MONGOLIAN = define(27)
  val PANGO_SCRIPT_MYANMAR = define(28)
  val PANGO_SCRIPT_OGHAM = define(29)
  val PANGO_SCRIPT_OLD_ITALIC = define(30)
  val PANGO_SCRIPT_ORIYA = define(31)
  val PANGO_SCRIPT_RUNIC = define(32)
  val PANGO_SCRIPT_SINHALA = define(33)
  val PANGO_SCRIPT_SYRIAC = define(34)
  val PANGO_SCRIPT_TAMIL = define(35)
  val PANGO_SCRIPT_TELUGU = define(36)
  val PANGO_SCRIPT_THAANA = define(37)
  val PANGO_SCRIPT_THAI = define(38)
  val PANGO_SCRIPT_TIBETAN = define(39)
  val PANGO_SCRIPT_CANADIAN_ABORIGINAL = define(40)
  val PANGO_SCRIPT_YI = define(41)
  val PANGO_SCRIPT_TAGALOG = define(42)
  val PANGO_SCRIPT_HANUNOO = define(43)
  val PANGO_SCRIPT_BUHID = define(44)
  val PANGO_SCRIPT_TAGBANWA = define(45)
  val PANGO_SCRIPT_BRAILLE = define(46)
  val PANGO_SCRIPT_CYPRIOT = define(47)
  val PANGO_SCRIPT_LIMBU = define(48)
  val PANGO_SCRIPT_OSMANYA = define(49)
  val PANGO_SCRIPT_SHAVIAN = define(50)
  val PANGO_SCRIPT_LINEAR_B = define(51)
  val PANGO_SCRIPT_TAI_LE = define(52)
  val PANGO_SCRIPT_UGARITIC = define(53)
  val PANGO_SCRIPT_NEW_TAI_LUE = define(54)
  val PANGO_SCRIPT_BUGINESE = define(55)
  val PANGO_SCRIPT_GLAGOLITIC = define(56)
  val PANGO_SCRIPT_TIFINAGH = define(57)
  val PANGO_SCRIPT_SYLOTI_NAGRI = define(58)
  val PANGO_SCRIPT_OLD_PERSIAN = define(59)
  val PANGO_SCRIPT_KHAROSHTHI = define(60)
  val PANGO_SCRIPT_UNKNOWN = define(61)
  val PANGO_SCRIPT_BALINESE = define(62)
  val PANGO_SCRIPT_CUNEIFORM = define(63)
  val PANGO_SCRIPT_PHOENICIAN = define(64)
  val PANGO_SCRIPT_PHAGS_PA = define(65)
  val PANGO_SCRIPT_NKO = define(66)
  val PANGO_SCRIPT_KAYAH_LI = define(67)
  val PANGO_SCRIPT_LEPCHA = define(68)
  val PANGO_SCRIPT_REJANG = define(69)
  val PANGO_SCRIPT_SUNDANESE = define(70)
  val PANGO_SCRIPT_SAURASHTRA = define(71)
  val PANGO_SCRIPT_CHAM = define(72)
  val PANGO_SCRIPT_OL_CHIKI = define(73)
  val PANGO_SCRIPT_VAI = define(74)
  val PANGO_SCRIPT_CARIAN = define(75)
  val PANGO_SCRIPT_LYCIAN = define(76)
  val PANGO_SCRIPT_LYDIAN = define(77)
  val PANGO_SCRIPT_BATAK = define(78)
  val PANGO_SCRIPT_BRAHMI = define(79)
  val PANGO_SCRIPT_MANDAIC = define(80)
  val PANGO_SCRIPT_CHAKMA = define(81)
  val PANGO_SCRIPT_MEROITIC_CURSIVE = define(82)
  val PANGO_SCRIPT_MEROITIC_HIEROGLYPHS = define(83)
  val PANGO_SCRIPT_MIAO = define(84)
  val PANGO_SCRIPT_SHARADA = define(85)
  val PANGO_SCRIPT_SORA_SOMPENG = define(86)
  val PANGO_SCRIPT_TAKRI = define(87)
  val PANGO_SCRIPT_BASSA_VAH = define(88)
  val PANGO_SCRIPT_CAUCASIAN_ALBANIAN = define(89)
  val PANGO_SCRIPT_DUPLOYAN = define(90)
  val PANGO_SCRIPT_ELBASAN = define(91)
  val PANGO_SCRIPT_GRANTHA = define(92)
  val PANGO_SCRIPT_KHOJKI = define(93)
  val PANGO_SCRIPT_KHUDAWADI = define(94)
  val PANGO_SCRIPT_LINEAR_A = define(95)
  val PANGO_SCRIPT_MAHAJANI = define(96)
  val PANGO_SCRIPT_MANICHAEAN = define(97)
  val PANGO_SCRIPT_MENDE_KIKAKUI = define(98)
  val PANGO_SCRIPT_MODI = define(99)
  val PANGO_SCRIPT_MRO = define(100)
  val PANGO_SCRIPT_NABATAEAN = define(101)
  val PANGO_SCRIPT_OLD_NORTH_ARABIAN = define(102)
  val PANGO_SCRIPT_OLD_PERMIC = define(103)
  val PANGO_SCRIPT_PAHAWH_HMONG = define(104)
  val PANGO_SCRIPT_PALMYRENE = define(105)
  val PANGO_SCRIPT_PAU_CIN_HAU = define(106)
  val PANGO_SCRIPT_PSALTER_PAHLAVI = define(107)
  val PANGO_SCRIPT_SIDDHAM = define(108)
  val PANGO_SCRIPT_TIRHUTA = define(109)
  val PANGO_SCRIPT_WARANG_CITI = define(110)
  val PANGO_SCRIPT_AHOM = define(111)
  val PANGO_SCRIPT_ANATOLIAN_HIEROGLYPHS = define(112)
  val PANGO_SCRIPT_HATRAN = define(113)
  val PANGO_SCRIPT_MULTANI = define(114)
  val PANGO_SCRIPT_OLD_HUNGARIAN = define(115)
  val PANGO_SCRIPT_SIGNWRITING = define(116)
  inline def getName(inline value: PangoScript): Option[String] =
    inline value match
      case PANGO_SCRIPT_INVALID_CODE => Some("PANGO_SCRIPT_INVALID_CODE")
      case PANGO_SCRIPT_COMMON => Some("PANGO_SCRIPT_COMMON")
      case PANGO_SCRIPT_INHERITED => Some("PANGO_SCRIPT_INHERITED")
      case PANGO_SCRIPT_ARABIC => Some("PANGO_SCRIPT_ARABIC")
      case PANGO_SCRIPT_ARMENIAN => Some("PANGO_SCRIPT_ARMENIAN")
      case PANGO_SCRIPT_BENGALI => Some("PANGO_SCRIPT_BENGALI")
      case PANGO_SCRIPT_BOPOMOFO => Some("PANGO_SCRIPT_BOPOMOFO")
      case PANGO_SCRIPT_CHEROKEE => Some("PANGO_SCRIPT_CHEROKEE")
      case PANGO_SCRIPT_COPTIC => Some("PANGO_SCRIPT_COPTIC")
      case PANGO_SCRIPT_CYRILLIC => Some("PANGO_SCRIPT_CYRILLIC")
      case PANGO_SCRIPT_DESERET => Some("PANGO_SCRIPT_DESERET")
      case PANGO_SCRIPT_DEVANAGARI => Some("PANGO_SCRIPT_DEVANAGARI")
      case PANGO_SCRIPT_ETHIOPIC => Some("PANGO_SCRIPT_ETHIOPIC")
      case PANGO_SCRIPT_GEORGIAN => Some("PANGO_SCRIPT_GEORGIAN")
      case PANGO_SCRIPT_GOTHIC => Some("PANGO_SCRIPT_GOTHIC")
      case PANGO_SCRIPT_GREEK => Some("PANGO_SCRIPT_GREEK")
      case PANGO_SCRIPT_GUJARATI => Some("PANGO_SCRIPT_GUJARATI")
      case PANGO_SCRIPT_GURMUKHI => Some("PANGO_SCRIPT_GURMUKHI")
      case PANGO_SCRIPT_HAN => Some("PANGO_SCRIPT_HAN")
      case PANGO_SCRIPT_HANGUL => Some("PANGO_SCRIPT_HANGUL")
      case PANGO_SCRIPT_HEBREW => Some("PANGO_SCRIPT_HEBREW")
      case PANGO_SCRIPT_HIRAGANA => Some("PANGO_SCRIPT_HIRAGANA")
      case PANGO_SCRIPT_KANNADA => Some("PANGO_SCRIPT_KANNADA")
      case PANGO_SCRIPT_KATAKANA => Some("PANGO_SCRIPT_KATAKANA")
      case PANGO_SCRIPT_KHMER => Some("PANGO_SCRIPT_KHMER")
      case PANGO_SCRIPT_LAO => Some("PANGO_SCRIPT_LAO")
      case PANGO_SCRIPT_LATIN => Some("PANGO_SCRIPT_LATIN")
      case PANGO_SCRIPT_MALAYALAM => Some("PANGO_SCRIPT_MALAYALAM")
      case PANGO_SCRIPT_MONGOLIAN => Some("PANGO_SCRIPT_MONGOLIAN")
      case PANGO_SCRIPT_MYANMAR => Some("PANGO_SCRIPT_MYANMAR")
      case PANGO_SCRIPT_OGHAM => Some("PANGO_SCRIPT_OGHAM")
      case PANGO_SCRIPT_OLD_ITALIC => Some("PANGO_SCRIPT_OLD_ITALIC")
      case PANGO_SCRIPT_ORIYA => Some("PANGO_SCRIPT_ORIYA")
      case PANGO_SCRIPT_RUNIC => Some("PANGO_SCRIPT_RUNIC")
      case PANGO_SCRIPT_SINHALA => Some("PANGO_SCRIPT_SINHALA")
      case PANGO_SCRIPT_SYRIAC => Some("PANGO_SCRIPT_SYRIAC")
      case PANGO_SCRIPT_TAMIL => Some("PANGO_SCRIPT_TAMIL")
      case PANGO_SCRIPT_TELUGU => Some("PANGO_SCRIPT_TELUGU")
      case PANGO_SCRIPT_THAANA => Some("PANGO_SCRIPT_THAANA")
      case PANGO_SCRIPT_THAI => Some("PANGO_SCRIPT_THAI")
      case PANGO_SCRIPT_TIBETAN => Some("PANGO_SCRIPT_TIBETAN")
      case PANGO_SCRIPT_CANADIAN_ABORIGINAL => Some("PANGO_SCRIPT_CANADIAN_ABORIGINAL")
      case PANGO_SCRIPT_YI => Some("PANGO_SCRIPT_YI")
      case PANGO_SCRIPT_TAGALOG => Some("PANGO_SCRIPT_TAGALOG")
      case PANGO_SCRIPT_HANUNOO => Some("PANGO_SCRIPT_HANUNOO")
      case PANGO_SCRIPT_BUHID => Some("PANGO_SCRIPT_BUHID")
      case PANGO_SCRIPT_TAGBANWA => Some("PANGO_SCRIPT_TAGBANWA")
      case PANGO_SCRIPT_BRAILLE => Some("PANGO_SCRIPT_BRAILLE")
      case PANGO_SCRIPT_CYPRIOT => Some("PANGO_SCRIPT_CYPRIOT")
      case PANGO_SCRIPT_LIMBU => Some("PANGO_SCRIPT_LIMBU")
      case PANGO_SCRIPT_OSMANYA => Some("PANGO_SCRIPT_OSMANYA")
      case PANGO_SCRIPT_SHAVIAN => Some("PANGO_SCRIPT_SHAVIAN")
      case PANGO_SCRIPT_LINEAR_B => Some("PANGO_SCRIPT_LINEAR_B")
      case PANGO_SCRIPT_TAI_LE => Some("PANGO_SCRIPT_TAI_LE")
      case PANGO_SCRIPT_UGARITIC => Some("PANGO_SCRIPT_UGARITIC")
      case PANGO_SCRIPT_NEW_TAI_LUE => Some("PANGO_SCRIPT_NEW_TAI_LUE")
      case PANGO_SCRIPT_BUGINESE => Some("PANGO_SCRIPT_BUGINESE")
      case PANGO_SCRIPT_GLAGOLITIC => Some("PANGO_SCRIPT_GLAGOLITIC")
      case PANGO_SCRIPT_TIFINAGH => Some("PANGO_SCRIPT_TIFINAGH")
      case PANGO_SCRIPT_SYLOTI_NAGRI => Some("PANGO_SCRIPT_SYLOTI_NAGRI")
      case PANGO_SCRIPT_OLD_PERSIAN => Some("PANGO_SCRIPT_OLD_PERSIAN")
      case PANGO_SCRIPT_KHAROSHTHI => Some("PANGO_SCRIPT_KHAROSHTHI")
      case PANGO_SCRIPT_UNKNOWN => Some("PANGO_SCRIPT_UNKNOWN")
      case PANGO_SCRIPT_BALINESE => Some("PANGO_SCRIPT_BALINESE")
      case PANGO_SCRIPT_CUNEIFORM => Some("PANGO_SCRIPT_CUNEIFORM")
      case PANGO_SCRIPT_PHOENICIAN => Some("PANGO_SCRIPT_PHOENICIAN")
      case PANGO_SCRIPT_PHAGS_PA => Some("PANGO_SCRIPT_PHAGS_PA")
      case PANGO_SCRIPT_NKO => Some("PANGO_SCRIPT_NKO")
      case PANGO_SCRIPT_KAYAH_LI => Some("PANGO_SCRIPT_KAYAH_LI")
      case PANGO_SCRIPT_LEPCHA => Some("PANGO_SCRIPT_LEPCHA")
      case PANGO_SCRIPT_REJANG => Some("PANGO_SCRIPT_REJANG")
      case PANGO_SCRIPT_SUNDANESE => Some("PANGO_SCRIPT_SUNDANESE")
      case PANGO_SCRIPT_SAURASHTRA => Some("PANGO_SCRIPT_SAURASHTRA")
      case PANGO_SCRIPT_CHAM => Some("PANGO_SCRIPT_CHAM")
      case PANGO_SCRIPT_OL_CHIKI => Some("PANGO_SCRIPT_OL_CHIKI")
      case PANGO_SCRIPT_VAI => Some("PANGO_SCRIPT_VAI")
      case PANGO_SCRIPT_CARIAN => Some("PANGO_SCRIPT_CARIAN")
      case PANGO_SCRIPT_LYCIAN => Some("PANGO_SCRIPT_LYCIAN")
      case PANGO_SCRIPT_LYDIAN => Some("PANGO_SCRIPT_LYDIAN")
      case PANGO_SCRIPT_BATAK => Some("PANGO_SCRIPT_BATAK")
      case PANGO_SCRIPT_BRAHMI => Some("PANGO_SCRIPT_BRAHMI")
      case PANGO_SCRIPT_MANDAIC => Some("PANGO_SCRIPT_MANDAIC")
      case PANGO_SCRIPT_CHAKMA => Some("PANGO_SCRIPT_CHAKMA")
      case PANGO_SCRIPT_MEROITIC_CURSIVE => Some("PANGO_SCRIPT_MEROITIC_CURSIVE")
      case PANGO_SCRIPT_MEROITIC_HIEROGLYPHS => Some("PANGO_SCRIPT_MEROITIC_HIEROGLYPHS")
      case PANGO_SCRIPT_MIAO => Some("PANGO_SCRIPT_MIAO")
      case PANGO_SCRIPT_SHARADA => Some("PANGO_SCRIPT_SHARADA")
      case PANGO_SCRIPT_SORA_SOMPENG => Some("PANGO_SCRIPT_SORA_SOMPENG")
      case PANGO_SCRIPT_TAKRI => Some("PANGO_SCRIPT_TAKRI")
      case PANGO_SCRIPT_BASSA_VAH => Some("PANGO_SCRIPT_BASSA_VAH")
      case PANGO_SCRIPT_CAUCASIAN_ALBANIAN => Some("PANGO_SCRIPT_CAUCASIAN_ALBANIAN")
      case PANGO_SCRIPT_DUPLOYAN => Some("PANGO_SCRIPT_DUPLOYAN")
      case PANGO_SCRIPT_ELBASAN => Some("PANGO_SCRIPT_ELBASAN")
      case PANGO_SCRIPT_GRANTHA => Some("PANGO_SCRIPT_GRANTHA")
      case PANGO_SCRIPT_KHOJKI => Some("PANGO_SCRIPT_KHOJKI")
      case PANGO_SCRIPT_KHUDAWADI => Some("PANGO_SCRIPT_KHUDAWADI")
      case PANGO_SCRIPT_LINEAR_A => Some("PANGO_SCRIPT_LINEAR_A")
      case PANGO_SCRIPT_MAHAJANI => Some("PANGO_SCRIPT_MAHAJANI")
      case PANGO_SCRIPT_MANICHAEAN => Some("PANGO_SCRIPT_MANICHAEAN")
      case PANGO_SCRIPT_MENDE_KIKAKUI => Some("PANGO_SCRIPT_MENDE_KIKAKUI")
      case PANGO_SCRIPT_MODI => Some("PANGO_SCRIPT_MODI")
      case PANGO_SCRIPT_MRO => Some("PANGO_SCRIPT_MRO")
      case PANGO_SCRIPT_NABATAEAN => Some("PANGO_SCRIPT_NABATAEAN")
      case PANGO_SCRIPT_OLD_NORTH_ARABIAN => Some("PANGO_SCRIPT_OLD_NORTH_ARABIAN")
      case PANGO_SCRIPT_OLD_PERMIC => Some("PANGO_SCRIPT_OLD_PERMIC")
      case PANGO_SCRIPT_PAHAWH_HMONG => Some("PANGO_SCRIPT_PAHAWH_HMONG")
      case PANGO_SCRIPT_PALMYRENE => Some("PANGO_SCRIPT_PALMYRENE")
      case PANGO_SCRIPT_PAU_CIN_HAU => Some("PANGO_SCRIPT_PAU_CIN_HAU")
      case PANGO_SCRIPT_PSALTER_PAHLAVI => Some("PANGO_SCRIPT_PSALTER_PAHLAVI")
      case PANGO_SCRIPT_SIDDHAM => Some("PANGO_SCRIPT_SIDDHAM")
      case PANGO_SCRIPT_TIRHUTA => Some("PANGO_SCRIPT_TIRHUTA")
      case PANGO_SCRIPT_WARANG_CITI => Some("PANGO_SCRIPT_WARANG_CITI")
      case PANGO_SCRIPT_AHOM => Some("PANGO_SCRIPT_AHOM")
      case PANGO_SCRIPT_ANATOLIAN_HIEROGLYPHS => Some("PANGO_SCRIPT_ANATOLIAN_HIEROGLYPHS")
      case PANGO_SCRIPT_HATRAN => Some("PANGO_SCRIPT_HATRAN")
      case PANGO_SCRIPT_MULTANI => Some("PANGO_SCRIPT_MULTANI")
      case PANGO_SCRIPT_OLD_HUNGARIAN => Some("PANGO_SCRIPT_OLD_HUNGARIAN")
      case PANGO_SCRIPT_SIGNWRITING => Some("PANGO_SCRIPT_SIGNWRITING")
      case _ => None
  extension (a: PangoScript)
    inline def &(b: PangoScript): PangoScript = a & b
    inline def |(b: PangoScript): PangoScript = a | b
    inline def is(b: PangoScript): Boolean = (a & b) == b

/**
 * PangoShapeFlags: _SHAPE_NONE: Default value _SHAPE_ROUND_POSITIONS: Round glyph positions and widths to whole device units This option should be set if the target renderer can't do subpixel positioning of glyphs

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-glyph.h
*/
opaque type PangoShapeFlags = CUnsignedInt
object PangoShapeFlags extends CEnumU[PangoShapeFlags]:
  given _tag: Tag[PangoShapeFlags] = Tag.UInt
  inline def define(inline a: Long): PangoShapeFlags = a.toUInt
  val PANGO_SHAPE_NONE = define(0)
  val PANGO_SHAPE_ROUND_POSITIONS = define(1)
  inline def getName(inline value: PangoShapeFlags): Option[String] =
    inline value match
      case PANGO_SHAPE_NONE => Some("PANGO_SHAPE_NONE")
      case PANGO_SHAPE_ROUND_POSITIONS => Some("PANGO_SHAPE_ROUND_POSITIONS")
      case _ => None
  extension (a: PangoShapeFlags)
    inline def &(b: PangoShapeFlags): PangoShapeFlags = a & b
    inline def |(b: PangoShapeFlags): PangoShapeFlags = a | b
    inline def is(b: PangoShapeFlags): Boolean = (a & b) == b

/**
 * PangoShowFlags: _SHOW_NONE: No special treatment for invisible characters _SHOW_SPACES: Render spaces, tabs and newlines visibly _SHOW_LINE_BREAKS: Render line breaks visibly _SHOW_IGNORABLES: Render default-ignorable Unicode characters visibly

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoShowFlags = CUnsignedInt
object PangoShowFlags extends CEnumU[PangoShowFlags]:
  given _tag: Tag[PangoShowFlags] = Tag.UInt
  inline def define(inline a: Long): PangoShowFlags = a.toUInt
  val PANGO_SHOW_NONE = define(0)
  val PANGO_SHOW_SPACES = define(1)
  val PANGO_SHOW_LINE_BREAKS = define(2)
  val PANGO_SHOW_IGNORABLES = define(4)
  inline def getName(inline value: PangoShowFlags): Option[String] =
    inline value match
      case PANGO_SHOW_NONE => Some("PANGO_SHOW_NONE")
      case PANGO_SHOW_SPACES => Some("PANGO_SHOW_SPACES")
      case PANGO_SHOW_LINE_BREAKS => Some("PANGO_SHOW_LINE_BREAKS")
      case PANGO_SHOW_IGNORABLES => Some("PANGO_SHOW_IGNORABLES")
      case _ => None
  extension (a: PangoShowFlags)
    inline def &(b: PangoShowFlags): PangoShowFlags = a & b
    inline def |(b: PangoShowFlags): PangoShowFlags = a | b
    inline def is(b: PangoShowFlags): Boolean = (a & b) == b

/**
 * PangoStretch: _STRETCH_ULTRA_CONDENSED: ultra condensed width _STRETCH_EXTRA_CONDENSED: extra condensed width _STRETCH_CONDENSED: condensed width _STRETCH_SEMI_CONDENSED: semi condensed width _STRETCH_NORMAL: the normal width _STRETCH_SEMI_EXPANDED: semi expanded width _STRETCH_EXPANDED: expanded width _STRETCH_EXTRA_EXPANDED: extra expanded width _STRETCH_ULTRA_EXPANDED: ultra expanded width

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
*/
opaque type PangoStretch = CUnsignedInt
object PangoStretch extends CEnumU[PangoStretch]:
  given _tag: Tag[PangoStretch] = Tag.UInt
  inline def define(inline a: Long): PangoStretch = a.toUInt
  val PANGO_STRETCH_ULTRA_CONDENSED = define(0)
  val PANGO_STRETCH_EXTRA_CONDENSED = define(1)
  val PANGO_STRETCH_CONDENSED = define(2)
  val PANGO_STRETCH_SEMI_CONDENSED = define(3)
  val PANGO_STRETCH_NORMAL = define(4)
  val PANGO_STRETCH_SEMI_EXPANDED = define(5)
  val PANGO_STRETCH_EXPANDED = define(6)
  val PANGO_STRETCH_EXTRA_EXPANDED = define(7)
  val PANGO_STRETCH_ULTRA_EXPANDED = define(8)
  inline def getName(inline value: PangoStretch): Option[String] =
    inline value match
      case PANGO_STRETCH_ULTRA_CONDENSED => Some("PANGO_STRETCH_ULTRA_CONDENSED")
      case PANGO_STRETCH_EXTRA_CONDENSED => Some("PANGO_STRETCH_EXTRA_CONDENSED")
      case PANGO_STRETCH_CONDENSED => Some("PANGO_STRETCH_CONDENSED")
      case PANGO_STRETCH_SEMI_CONDENSED => Some("PANGO_STRETCH_SEMI_CONDENSED")
      case PANGO_STRETCH_NORMAL => Some("PANGO_STRETCH_NORMAL")
      case PANGO_STRETCH_SEMI_EXPANDED => Some("PANGO_STRETCH_SEMI_EXPANDED")
      case PANGO_STRETCH_EXPANDED => Some("PANGO_STRETCH_EXPANDED")
      case PANGO_STRETCH_EXTRA_EXPANDED => Some("PANGO_STRETCH_EXTRA_EXPANDED")
      case PANGO_STRETCH_ULTRA_EXPANDED => Some("PANGO_STRETCH_ULTRA_EXPANDED")
      case _ => None
  extension (a: PangoStretch)
    inline def &(b: PangoStretch): PangoStretch = a & b
    inline def |(b: PangoStretch): PangoStretch = a | b
    inline def is(b: PangoStretch): Boolean = (a & b) == b

/**
 * PangoStyle: _STYLE_NORMAL: the font is upright. _STYLE_OBLIQUE: the font is slanted, but in a roman style. _STYLE_ITALIC: the font is slanted in an italic style.

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
*/
opaque type PangoStyle = CUnsignedInt
object PangoStyle extends CEnumU[PangoStyle]:
  given _tag: Tag[PangoStyle] = Tag.UInt
  inline def define(inline a: Long): PangoStyle = a.toUInt
  val PANGO_STYLE_NORMAL = define(0)
  val PANGO_STYLE_OBLIQUE = define(1)
  val PANGO_STYLE_ITALIC = define(2)
  inline def getName(inline value: PangoStyle): Option[String] =
    inline value match
      case PANGO_STYLE_NORMAL => Some("PANGO_STYLE_NORMAL")
      case PANGO_STYLE_OBLIQUE => Some("PANGO_STYLE_OBLIQUE")
      case PANGO_STYLE_ITALIC => Some("PANGO_STYLE_ITALIC")
      case _ => None
  extension (a: PangoStyle)
    inline def &(b: PangoStyle): PangoStyle = a & b
    inline def |(b: PangoStyle): PangoStyle = a | b
    inline def is(b: PangoStyle): Boolean = (a & b) == b

/**
 * PangoTabAlign: _TAB_LEFT: the text appears to the right of the tab stop position _TAB_RIGHT: the text appears to the left of the tab stop position until the available space is filled. Since: 1.50 _TAB_CENTER: the text is centered at the tab stop position until the available space is filled. Since: 1.50 _TAB_DECIMAL: text before the first occurrence of the decimal point character appears to the left of the tab stop position (until the available space is filled), the rest to the right. Since: 1.50

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-tabs.h
*/
opaque type PangoTabAlign = CUnsignedInt
object PangoTabAlign extends CEnumU[PangoTabAlign]:
  given _tag: Tag[PangoTabAlign] = Tag.UInt
  inline def define(inline a: Long): PangoTabAlign = a.toUInt
  val PANGO_TAB_LEFT = define(0)
  val PANGO_TAB_RIGHT = define(1)
  val PANGO_TAB_CENTER = define(2)
  val PANGO_TAB_DECIMAL = define(3)
  inline def getName(inline value: PangoTabAlign): Option[String] =
    inline value match
      case PANGO_TAB_LEFT => Some("PANGO_TAB_LEFT")
      case PANGO_TAB_RIGHT => Some("PANGO_TAB_RIGHT")
      case PANGO_TAB_CENTER => Some("PANGO_TAB_CENTER")
      case PANGO_TAB_DECIMAL => Some("PANGO_TAB_DECIMAL")
      case _ => None
  extension (a: PangoTabAlign)
    inline def &(b: PangoTabAlign): PangoTabAlign = a & b
    inline def |(b: PangoTabAlign): PangoTabAlign = a | b
    inline def is(b: PangoTabAlign): Boolean = (a & b) == b

/**
 * PangoTextTransform: _TEXT_TRANSFORM_NONE: Leave text unchanged _TEXT_TRANSFORM_LOWERCASE: Display letters and numbers as lowercase _TEXT_TRANSFORM_UPPERCASE: Display letters and numbers as uppercase _TEXT_TRANSFORM_CAPITALIZE: Display the first character of a word in titlecase

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoTextTransform = CUnsignedInt
object PangoTextTransform extends CEnumU[PangoTextTransform]:
  given _tag: Tag[PangoTextTransform] = Tag.UInt
  inline def define(inline a: Long): PangoTextTransform = a.toUInt
  val PANGO_TEXT_TRANSFORM_NONE = define(0)
  val PANGO_TEXT_TRANSFORM_LOWERCASE = define(1)
  val PANGO_TEXT_TRANSFORM_UPPERCASE = define(2)
  val PANGO_TEXT_TRANSFORM_CAPITALIZE = define(3)
  inline def getName(inline value: PangoTextTransform): Option[String] =
    inline value match
      case PANGO_TEXT_TRANSFORM_NONE => Some("PANGO_TEXT_TRANSFORM_NONE")
      case PANGO_TEXT_TRANSFORM_LOWERCASE => Some("PANGO_TEXT_TRANSFORM_LOWERCASE")
      case PANGO_TEXT_TRANSFORM_UPPERCASE => Some("PANGO_TEXT_TRANSFORM_UPPERCASE")
      case PANGO_TEXT_TRANSFORM_CAPITALIZE => Some("PANGO_TEXT_TRANSFORM_CAPITALIZE")
      case _ => None
  extension (a: PangoTextTransform)
    inline def &(b: PangoTextTransform): PangoTextTransform = a & b
    inline def |(b: PangoTextTransform): PangoTextTransform = a | b
    inline def is(b: PangoTextTransform): Boolean = (a & b) == b

/**
 * PangoUnderline: _UNDERLINE_NONE: no underline should be drawn _UNDERLINE_SINGLE: a single underline should be drawn _UNDERLINE_DOUBLE: a double underline should be drawn _UNDERLINE_LOW: a single underline should be drawn at a position beneath the ink extents of the text being underlined. This should be used only for underlining single characters, such as for keyboard accelerators. %PANGO_UNDERLINE_SINGLE should be used for extended portions of text. _UNDERLINE_ERROR: an underline indicating an error should be drawn below. The exact style of rendering is up to the `PangoRenderer` in use, but typical styles include wavy or dotted lines. This underline is typically used to indicate an error such as a possible mispelling; in some cases a contrasting color may automatically be used. This type of underlining is available since Pango 1.4. _UNDERLINE_SINGLE_LINE: Like _UNDERLINE_SINGLE, but drawn continuously across multiple runs. This type of underlining is available since Pango 1.46. _UNDERLINE_DOUBLE_LINE: Like _UNDERLINE_DOUBLE, but drawn continuously across multiple runs. This type of underlining is available since Pango 1.46. _UNDERLINE_ERROR_LINE: Like _UNDERLINE_ERROR, but drawn continuously across multiple runs. This type of underlining is available since Pango 1.46.

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-attributes.h
*/
opaque type PangoUnderline = CUnsignedInt
object PangoUnderline extends CEnumU[PangoUnderline]:
  given _tag: Tag[PangoUnderline] = Tag.UInt
  inline def define(inline a: Long): PangoUnderline = a.toUInt
  val PANGO_UNDERLINE_NONE = define(0)
  val PANGO_UNDERLINE_SINGLE = define(1)
  val PANGO_UNDERLINE_DOUBLE = define(2)
  val PANGO_UNDERLINE_LOW = define(3)
  val PANGO_UNDERLINE_ERROR = define(4)
  val PANGO_UNDERLINE_SINGLE_LINE = define(5)
  val PANGO_UNDERLINE_DOUBLE_LINE = define(6)
  val PANGO_UNDERLINE_ERROR_LINE = define(7)
  inline def getName(inline value: PangoUnderline): Option[String] =
    inline value match
      case PANGO_UNDERLINE_NONE => Some("PANGO_UNDERLINE_NONE")
      case PANGO_UNDERLINE_SINGLE => Some("PANGO_UNDERLINE_SINGLE")
      case PANGO_UNDERLINE_DOUBLE => Some("PANGO_UNDERLINE_DOUBLE")
      case PANGO_UNDERLINE_LOW => Some("PANGO_UNDERLINE_LOW")
      case PANGO_UNDERLINE_ERROR => Some("PANGO_UNDERLINE_ERROR")
      case PANGO_UNDERLINE_SINGLE_LINE => Some("PANGO_UNDERLINE_SINGLE_LINE")
      case PANGO_UNDERLINE_DOUBLE_LINE => Some("PANGO_UNDERLINE_DOUBLE_LINE")
      case PANGO_UNDERLINE_ERROR_LINE => Some("PANGO_UNDERLINE_ERROR_LINE")
      case _ => None
  extension (a: PangoUnderline)
    inline def &(b: PangoUnderline): PangoUnderline = a & b
    inline def |(b: PangoUnderline): PangoUnderline = a | b
    inline def is(b: PangoUnderline): Boolean = (a & b) == b

/**
 * PangoVariant: _VARIANT_NORMAL: A normal font. _VARIANT_SMALL_CAPS: A font with the lower case characters replaced by smaller variants of the capital characters. _VARIANT_ALL_SMALL_CAPS: A font with all characters replaced by smaller variants of the capital characters. Since: 1.50 _VARIANT_PETITE_CAPS: A font with the lower case characters replaced by smaller variants of the capital characters. Petite Caps can be even smaller than Small Caps. Since: 1.50 _VARIANT_ALL_PETITE_CAPS: A font with all characters replaced by smaller variants of the capital characters. Petite Caps can be even smaller than Small Caps. Since: 1.50 _VARIANT_UNICASE: A font with the upper case characters replaced by smaller variants of the capital letters. Since: 1.50 _VARIANT_TITLE_CAPS: A font with capital letters that are more suitable for all-uppercase titles. Since: 1.50

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
*/
opaque type PangoVariant = CUnsignedInt
object PangoVariant extends CEnumU[PangoVariant]:
  given _tag: Tag[PangoVariant] = Tag.UInt
  inline def define(inline a: Long): PangoVariant = a.toUInt
  val PANGO_VARIANT_NORMAL = define(0)
  val PANGO_VARIANT_SMALL_CAPS = define(1)
  val PANGO_VARIANT_ALL_SMALL_CAPS = define(2)
  val PANGO_VARIANT_PETITE_CAPS = define(3)
  val PANGO_VARIANT_ALL_PETITE_CAPS = define(4)
  val PANGO_VARIANT_UNICASE = define(5)
  val PANGO_VARIANT_TITLE_CAPS = define(6)
  inline def getName(inline value: PangoVariant): Option[String] =
    inline value match
      case PANGO_VARIANT_NORMAL => Some("PANGO_VARIANT_NORMAL")
      case PANGO_VARIANT_SMALL_CAPS => Some("PANGO_VARIANT_SMALL_CAPS")
      case PANGO_VARIANT_ALL_SMALL_CAPS => Some("PANGO_VARIANT_ALL_SMALL_CAPS")
      case PANGO_VARIANT_PETITE_CAPS => Some("PANGO_VARIANT_PETITE_CAPS")
      case PANGO_VARIANT_ALL_PETITE_CAPS => Some("PANGO_VARIANT_ALL_PETITE_CAPS")
      case PANGO_VARIANT_UNICASE => Some("PANGO_VARIANT_UNICASE")
      case PANGO_VARIANT_TITLE_CAPS => Some("PANGO_VARIANT_TITLE_CAPS")
      case _ => None
  extension (a: PangoVariant)
    inline def &(b: PangoVariant): PangoVariant = a & b
    inline def |(b: PangoVariant): PangoVariant = a | b
    inline def is(b: PangoVariant): Boolean = (a & b) == b

/**
 * PangoWeight: _WEIGHT_THIN: the thin weight (= 100) Since: 1.24 _WEIGHT_ULTRALIGHT: the ultralight weight (= 200) _WEIGHT_LIGHT: the light weight (= 300) _WEIGHT_SEMILIGHT: the semilight weight (= 350) Since: 1.36.7 _WEIGHT_BOOK: the book weight (= 380) Since: 1.24) _WEIGHT_NORMAL: the default weight (= 400) _WEIGHT_MEDIUM: the normal weight (= 500) Since: 1.24 _WEIGHT_SEMIBOLD: the semibold weight (= 600) _WEIGHT_BOLD: the bold weight (= 700) _WEIGHT_ULTRABOLD: the ultrabold weight (= 800) _WEIGHT_HEAVY: the heavy weight (= 900) _WEIGHT_ULTRAHEAVY: the ultraheavy weight (= 1000) Since: 1.24

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-font.h
*/
opaque type PangoWeight = CUnsignedInt
object PangoWeight extends CEnumU[PangoWeight]:
  given _tag: Tag[PangoWeight] = Tag.UInt
  inline def define(inline a: Long): PangoWeight = a.toUInt
  val PANGO_WEIGHT_THIN = define(100)
  val PANGO_WEIGHT_ULTRALIGHT = define(200)
  val PANGO_WEIGHT_LIGHT = define(300)
  val PANGO_WEIGHT_SEMILIGHT = define(350)
  val PANGO_WEIGHT_BOOK = define(380)
  val PANGO_WEIGHT_NORMAL = define(400)
  val PANGO_WEIGHT_MEDIUM = define(500)
  val PANGO_WEIGHT_SEMIBOLD = define(600)
  val PANGO_WEIGHT_BOLD = define(700)
  val PANGO_WEIGHT_ULTRABOLD = define(800)
  val PANGO_WEIGHT_HEAVY = define(900)
  val PANGO_WEIGHT_ULTRAHEAVY = define(1000)
  inline def getName(inline value: PangoWeight): Option[String] =
    inline value match
      case PANGO_WEIGHT_THIN => Some("PANGO_WEIGHT_THIN")
      case PANGO_WEIGHT_ULTRALIGHT => Some("PANGO_WEIGHT_ULTRALIGHT")
      case PANGO_WEIGHT_LIGHT => Some("PANGO_WEIGHT_LIGHT")
      case PANGO_WEIGHT_SEMILIGHT => Some("PANGO_WEIGHT_SEMILIGHT")
      case PANGO_WEIGHT_BOOK => Some("PANGO_WEIGHT_BOOK")
      case PANGO_WEIGHT_NORMAL => Some("PANGO_WEIGHT_NORMAL")
      case PANGO_WEIGHT_MEDIUM => Some("PANGO_WEIGHT_MEDIUM")
      case PANGO_WEIGHT_SEMIBOLD => Some("PANGO_WEIGHT_SEMIBOLD")
      case PANGO_WEIGHT_BOLD => Some("PANGO_WEIGHT_BOLD")
      case PANGO_WEIGHT_ULTRABOLD => Some("PANGO_WEIGHT_ULTRABOLD")
      case PANGO_WEIGHT_HEAVY => Some("PANGO_WEIGHT_HEAVY")
      case PANGO_WEIGHT_ULTRAHEAVY => Some("PANGO_WEIGHT_ULTRAHEAVY")
      case _ => None
  extension (a: PangoWeight)
    inline def &(b: PangoWeight): PangoWeight = a & b
    inline def |(b: PangoWeight): PangoWeight = a | b
    inline def is(b: PangoWeight): Boolean = (a & b) == b

/**
 * PangoWrapMode: _WRAP_WORD: wrap lines at word boundaries. _WRAP_CHAR: wrap lines at character boundaries. _WRAP_WORD_CHAR: wrap lines at word boundaries, but fall back to character boundaries if there is not enough space for a full word.

 * [bindgen] header: /usr/include/pango-1.0/pango/pango-layout.h
*/
opaque type PangoWrapMode = CUnsignedInt
object PangoWrapMode extends CEnumU[PangoWrapMode]:
  given _tag: Tag[PangoWrapMode] = Tag.UInt
  inline def define(inline a: Long): PangoWrapMode = a.toUInt
  val PANGO_WRAP_WORD = define(0)
  val PANGO_WRAP_CHAR = define(1)
  val PANGO_WRAP_WORD_CHAR = define(2)
  inline def getName(inline value: PangoWrapMode): Option[String] =
    inline value match
      case PANGO_WRAP_WORD => Some("PANGO_WRAP_WORD")
      case PANGO_WRAP_CHAR => Some("PANGO_WRAP_CHAR")
      case PANGO_WRAP_WORD_CHAR => Some("PANGO_WRAP_WORD_CHAR")
      case _ => None
  extension (a: PangoWrapMode)
    inline def &(b: PangoWrapMode): PangoWrapMode = a & b
    inline def |(b: PangoWrapMode): PangoWrapMode = a | b
    inline def is(b: PangoWrapMode): Boolean = (a & b) == b

