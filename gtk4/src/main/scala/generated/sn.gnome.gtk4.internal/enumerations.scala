package sn.gnome.gtk4.internal

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

private[internal] trait CEnum[T](using eq: T =:= Int):
  given Tag[T] = Tag.Int.asInstanceOf[Tag[T]]
  extension (inline t: T) 
    inline def int: CInt = eq.apply(t)
    inline def value: CInt = eq.apply(t)
private[internal] trait CEnumU[T](using eq: T =:= UInt):
  given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
  extension (inline t: T)
   inline def int: CInt = eq.apply(t).toInt
   inline def uint: CUnsignedInt = eq.apply(t)
   inline def value: CUnsignedInt = eq.apply(t)
/**
 * GdkAxisFlags: _AXIS_FLAG_X: X axis is present _AXIS_FLAG_Y: Y axis is present _AXIS_FLAG_DELTA_X: Scroll X delta axis is present _AXIS_FLAG_DELTA_Y: Scroll Y delta axis is present _AXIS_FLAG_PRESSURE: Pressure axis is present _AXIS_FLAG_XTILT: X tilt axis is present _AXIS_FLAG_YTILT: Y tilt axis is present _AXIS_FLAG_WHEEL: Wheel axis is present _AXIS_FLAG_DISTANCE: Distance axis is present _AXIS_FLAG_ROTATION: Z-axis rotation is present _AXIS_FLAG_SLIDER: Slider axis is present
*/
opaque type GdkAxisFlags = CUnsignedInt
object GdkAxisFlags extends CEnumU[GdkAxisFlags]:
  given _tag: Tag[GdkAxisFlags] = Tag.UInt
  inline def define(inline a: Long): GdkAxisFlags = a.toUInt
  val GDK_AXIS_FLAG_X = define(2)
  val GDK_AXIS_FLAG_Y = define(4)
  val GDK_AXIS_FLAG_DELTA_X = define(8)
  val GDK_AXIS_FLAG_DELTA_Y = define(16)
  val GDK_AXIS_FLAG_PRESSURE = define(32)
  val GDK_AXIS_FLAG_XTILT = define(64)
  val GDK_AXIS_FLAG_YTILT = define(128)
  val GDK_AXIS_FLAG_WHEEL = define(256)
  val GDK_AXIS_FLAG_DISTANCE = define(512)
  val GDK_AXIS_FLAG_ROTATION = define(1024)
  val GDK_AXIS_FLAG_SLIDER = define(2048)
  inline def getName(inline value: GdkAxisFlags): Option[String] =
    inline value match
      case GDK_AXIS_FLAG_X => Some("GDK_AXIS_FLAG_X")
      case GDK_AXIS_FLAG_Y => Some("GDK_AXIS_FLAG_Y")
      case GDK_AXIS_FLAG_DELTA_X => Some("GDK_AXIS_FLAG_DELTA_X")
      case GDK_AXIS_FLAG_DELTA_Y => Some("GDK_AXIS_FLAG_DELTA_Y")
      case GDK_AXIS_FLAG_PRESSURE => Some("GDK_AXIS_FLAG_PRESSURE")
      case GDK_AXIS_FLAG_XTILT => Some("GDK_AXIS_FLAG_XTILT")
      case GDK_AXIS_FLAG_YTILT => Some("GDK_AXIS_FLAG_YTILT")
      case GDK_AXIS_FLAG_WHEEL => Some("GDK_AXIS_FLAG_WHEEL")
      case GDK_AXIS_FLAG_DISTANCE => Some("GDK_AXIS_FLAG_DISTANCE")
      case GDK_AXIS_FLAG_ROTATION => Some("GDK_AXIS_FLAG_ROTATION")
      case GDK_AXIS_FLAG_SLIDER => Some("GDK_AXIS_FLAG_SLIDER")
      case _ => None
  extension (a: GdkAxisFlags)
    inline def &(b: GdkAxisFlags): GdkAxisFlags = a & b
    inline def |(b: GdkAxisFlags): GdkAxisFlags = a | b
    inline def is(b: GdkAxisFlags): Boolean = (a & b) == b

/**
 * GdkAxisUse: _AXIS_IGNORE: the axis is ignored. _AXIS_X: the axis is used as the x axis. _AXIS_Y: the axis is used as the y axis. _AXIS_DELTA_X: the axis is used as the scroll x delta _AXIS_DELTA_Y: the axis is used as the scroll y delta _AXIS_PRESSURE: the axis is used for pressure information. _AXIS_XTILT: the axis is used for x tilt information. _AXIS_YTILT: the axis is used for y tilt information. _AXIS_WHEEL: the axis is used for wheel information. _AXIS_DISTANCE: the axis is used for pen/tablet distance information _AXIS_ROTATION: the axis is used for pen rotation information _AXIS_SLIDER: the axis is used for pen slider information _AXIS_LAST: a constant equal to the numerically highest axis value.
*/
opaque type GdkAxisUse = CUnsignedInt
object GdkAxisUse extends CEnumU[GdkAxisUse]:
  given _tag: Tag[GdkAxisUse] = Tag.UInt
  inline def define(inline a: Long): GdkAxisUse = a.toUInt
  val GDK_AXIS_IGNORE = define(0)
  val GDK_AXIS_X = define(1)
  val GDK_AXIS_Y = define(2)
  val GDK_AXIS_DELTA_X = define(3)
  val GDK_AXIS_DELTA_Y = define(4)
  val GDK_AXIS_PRESSURE = define(5)
  val GDK_AXIS_XTILT = define(6)
  val GDK_AXIS_YTILT = define(7)
  val GDK_AXIS_WHEEL = define(8)
  val GDK_AXIS_DISTANCE = define(9)
  val GDK_AXIS_ROTATION = define(10)
  val GDK_AXIS_SLIDER = define(11)
  val GDK_AXIS_LAST = define(12)
  inline def getName(inline value: GdkAxisUse): Option[String] =
    inline value match
      case GDK_AXIS_IGNORE => Some("GDK_AXIS_IGNORE")
      case GDK_AXIS_X => Some("GDK_AXIS_X")
      case GDK_AXIS_Y => Some("GDK_AXIS_Y")
      case GDK_AXIS_DELTA_X => Some("GDK_AXIS_DELTA_X")
      case GDK_AXIS_DELTA_Y => Some("GDK_AXIS_DELTA_Y")
      case GDK_AXIS_PRESSURE => Some("GDK_AXIS_PRESSURE")
      case GDK_AXIS_XTILT => Some("GDK_AXIS_XTILT")
      case GDK_AXIS_YTILT => Some("GDK_AXIS_YTILT")
      case GDK_AXIS_WHEEL => Some("GDK_AXIS_WHEEL")
      case GDK_AXIS_DISTANCE => Some("GDK_AXIS_DISTANCE")
      case GDK_AXIS_ROTATION => Some("GDK_AXIS_ROTATION")
      case GDK_AXIS_SLIDER => Some("GDK_AXIS_SLIDER")
      case GDK_AXIS_LAST => Some("GDK_AXIS_LAST")
      case _ => None
  extension (a: GdkAxisUse)
    inline def &(b: GdkAxisUse): GdkAxisUse = a & b
    inline def |(b: GdkAxisUse): GdkAxisUse = a | b
    inline def is(b: GdkAxisUse): Boolean = (a & b) == b

/**
 * GdkDragAction: _ACTION_COPY: Copy the data. _ACTION_MOVE: Move the data, i.e. first copy it, then delete it from the source using the DELETE target of the X selection protocol. _ACTION_LINK: Add a link to the data. Note that this is only useful if source and destination agree on what it means, and is not supported on all platforms. _ACTION_ASK: Ask the user what to do with the data.
*/
opaque type GdkDragAction = CUnsignedInt
object GdkDragAction extends CEnumU[GdkDragAction]:
  given _tag: Tag[GdkDragAction] = Tag.UInt
  inline def define(inline a: Long): GdkDragAction = a.toUInt
  val GDK_ACTION_COPY = define(1)
  val GDK_ACTION_MOVE = define(2)
  val GDK_ACTION_LINK = define(4)
  val GDK_ACTION_ASK = define(8)
  inline def getName(inline value: GdkDragAction): Option[String] =
    inline value match
      case GDK_ACTION_COPY => Some("GDK_ACTION_COPY")
      case GDK_ACTION_MOVE => Some("GDK_ACTION_MOVE")
      case GDK_ACTION_LINK => Some("GDK_ACTION_LINK")
      case GDK_ACTION_ASK => Some("GDK_ACTION_ASK")
      case _ => None
  extension (a: GdkDragAction)
    inline def &(b: GdkDragAction): GdkDragAction = a & b
    inline def |(b: GdkDragAction): GdkDragAction = a | b
    inline def is(b: GdkDragAction): Boolean = (a & b) == b

/**
 * GdkKeyMatch: _KEY_MATCH_NONE: The key event does not match _KEY_MATCH_PARTIAL: The key event matches if keyboard state (specifically, the currently active group) is ignored _KEY_MATCH_EXACT: The key event matches
*/
opaque type GdkKeyMatch = CUnsignedInt
object GdkKeyMatch extends CEnumU[GdkKeyMatch]:
  given _tag: Tag[GdkKeyMatch] = Tag.UInt
  inline def define(inline a: Long): GdkKeyMatch = a.toUInt
  val GDK_KEY_MATCH_NONE = define(0)
  val GDK_KEY_MATCH_PARTIAL = define(1)
  val GDK_KEY_MATCH_EXACT = define(2)
  inline def getName(inline value: GdkKeyMatch): Option[String] =
    inline value match
      case GDK_KEY_MATCH_NONE => Some("GDK_KEY_MATCH_NONE")
      case GDK_KEY_MATCH_PARTIAL => Some("GDK_KEY_MATCH_PARTIAL")
      case GDK_KEY_MATCH_EXACT => Some("GDK_KEY_MATCH_EXACT")
      case _ => None
  extension (a: GdkKeyMatch)
    inline def &(b: GdkKeyMatch): GdkKeyMatch = a & b
    inline def |(b: GdkKeyMatch): GdkKeyMatch = a | b
    inline def is(b: GdkKeyMatch): Boolean = (a & b) == b

/**
 * GdkModifierType: _SHIFT_MASK: the Shift key. _LOCK_MASK: a Lock key (depending on the modifier mapping of the X server this may either be CapsLock or ShiftLock). _CONTROL_MASK: the Control key. _ALT_MASK: the fourth modifier key (it depends on the modifier mapping of the X server which key is interpreted as this modifier, but normally it is the Alt key). _BUTTON1_MASK: the first mouse button. _BUTTON2_MASK: the second mouse button. _BUTTON3_MASK: the third mouse button. _BUTTON4_MASK: the fourth mouse button. _BUTTON5_MASK: the fifth mouse button. _SUPER_MASK: the Super modifier _HYPER_MASK: the Hyper modifier _META_MASK: the Meta modifier
*/
opaque type GdkModifierType = CUnsignedInt
object GdkModifierType extends CEnumU[GdkModifierType]:
  given _tag: Tag[GdkModifierType] = Tag.UInt
  inline def define(inline a: Long): GdkModifierType = a.toUInt
  val GDK_SHIFT_MASK = define(1)
  val GDK_LOCK_MASK = define(2)
  val GDK_CONTROL_MASK = define(4)
  val GDK_ALT_MASK = define(8)
  val GDK_BUTTON1_MASK = define(256)
  val GDK_BUTTON2_MASK = define(512)
  val GDK_BUTTON3_MASK = define(1024)
  val GDK_BUTTON4_MASK = define(2048)
  val GDK_BUTTON5_MASK = define(4096)
  val GDK_SUPER_MASK = define(67108864)
  val GDK_HYPER_MASK = define(134217728)
  val GDK_META_MASK = define(268435456)
  inline def getName(inline value: GdkModifierType): Option[String] =
    inline value match
      case GDK_SHIFT_MASK => Some("GDK_SHIFT_MASK")
      case GDK_LOCK_MASK => Some("GDK_LOCK_MASK")
      case GDK_CONTROL_MASK => Some("GDK_CONTROL_MASK")
      case GDK_ALT_MASK => Some("GDK_ALT_MASK")
      case GDK_BUTTON1_MASK => Some("GDK_BUTTON1_MASK")
      case GDK_BUTTON2_MASK => Some("GDK_BUTTON2_MASK")
      case GDK_BUTTON3_MASK => Some("GDK_BUTTON3_MASK")
      case GDK_BUTTON4_MASK => Some("GDK_BUTTON4_MASK")
      case GDK_BUTTON5_MASK => Some("GDK_BUTTON5_MASK")
      case GDK_SUPER_MASK => Some("GDK_SUPER_MASK")
      case GDK_HYPER_MASK => Some("GDK_HYPER_MASK")
      case GDK_META_MASK => Some("GDK_META_MASK")
      case _ => None
  extension (a: GdkModifierType)
    inline def &(b: GdkModifierType): GdkModifierType = a & b
    inline def |(b: GdkModifierType): GdkModifierType = a | b
    inline def is(b: GdkModifierType): Boolean = (a & b) == b

/**
 * GskBlendMode: _BLEND_MODE_DEFAULT: The default blend mode, which specifies no blending _BLEND_MODE_MULTIPLY: The source color is multiplied by the destination and replaces the destination _BLEND_MODE_SCREEN: Multiplies the complements of the destination and source color values, then complements the result. _BLEND_MODE_OVERLAY: Multiplies or screens the colors, depending on the destination color value. This is the inverse of hard-list _BLEND_MODE_DARKEN: Selects the darker of the destination and source colors _BLEND_MODE_LIGHTEN: Selects the lighter of the destination and source colors _BLEND_MODE_COLOR_DODGE: Brightens the destination color to reflect the source color _BLEND_MODE_COLOR_BURN: Darkens the destination color to reflect the source color _BLEND_MODE_HARD_LIGHT: Multiplies or screens the colors, depending on the source color value _BLEND_MODE_SOFT_LIGHT: Darkens or lightens the colors, depending on the source color value _BLEND_MODE_DIFFERENCE: Subtracts the darker of the two constituent colors from the lighter color _BLEND_MODE_EXCLUSION: Produces an effect similar to that of the difference mode but lower in contrast _BLEND_MODE_COLOR: Creates a color with the hue and saturation of the source color and the luminosity of the destination color _BLEND_MODE_HUE: Creates a color with the hue of the source color and the saturation and luminosity of the destination color _BLEND_MODE_SATURATION: Creates a color with the saturation of the source color and the hue and luminosity of the destination color _BLEND_MODE_LUMINOSITY: Creates a color with the luminosity of the source color and the hue and saturation of the destination color
*/
opaque type GskBlendMode = CUnsignedInt
object GskBlendMode extends CEnumU[GskBlendMode]:
  given _tag: Tag[GskBlendMode] = Tag.UInt
  inline def define(inline a: Long): GskBlendMode = a.toUInt
  val GSK_BLEND_MODE_DEFAULT = define(0)
  val GSK_BLEND_MODE_MULTIPLY = define(1)
  val GSK_BLEND_MODE_SCREEN = define(2)
  val GSK_BLEND_MODE_OVERLAY = define(3)
  val GSK_BLEND_MODE_DARKEN = define(4)
  val GSK_BLEND_MODE_LIGHTEN = define(5)
  val GSK_BLEND_MODE_COLOR_DODGE = define(6)
  val GSK_BLEND_MODE_COLOR_BURN = define(7)
  val GSK_BLEND_MODE_HARD_LIGHT = define(8)
  val GSK_BLEND_MODE_SOFT_LIGHT = define(9)
  val GSK_BLEND_MODE_DIFFERENCE = define(10)
  val GSK_BLEND_MODE_EXCLUSION = define(11)
  val GSK_BLEND_MODE_COLOR = define(12)
  val GSK_BLEND_MODE_HUE = define(13)
  val GSK_BLEND_MODE_SATURATION = define(14)
  val GSK_BLEND_MODE_LUMINOSITY = define(15)
  inline def getName(inline value: GskBlendMode): Option[String] =
    inline value match
      case GSK_BLEND_MODE_DEFAULT => Some("GSK_BLEND_MODE_DEFAULT")
      case GSK_BLEND_MODE_MULTIPLY => Some("GSK_BLEND_MODE_MULTIPLY")
      case GSK_BLEND_MODE_SCREEN => Some("GSK_BLEND_MODE_SCREEN")
      case GSK_BLEND_MODE_OVERLAY => Some("GSK_BLEND_MODE_OVERLAY")
      case GSK_BLEND_MODE_DARKEN => Some("GSK_BLEND_MODE_DARKEN")
      case GSK_BLEND_MODE_LIGHTEN => Some("GSK_BLEND_MODE_LIGHTEN")
      case GSK_BLEND_MODE_COLOR_DODGE => Some("GSK_BLEND_MODE_COLOR_DODGE")
      case GSK_BLEND_MODE_COLOR_BURN => Some("GSK_BLEND_MODE_COLOR_BURN")
      case GSK_BLEND_MODE_HARD_LIGHT => Some("GSK_BLEND_MODE_HARD_LIGHT")
      case GSK_BLEND_MODE_SOFT_LIGHT => Some("GSK_BLEND_MODE_SOFT_LIGHT")
      case GSK_BLEND_MODE_DIFFERENCE => Some("GSK_BLEND_MODE_DIFFERENCE")
      case GSK_BLEND_MODE_EXCLUSION => Some("GSK_BLEND_MODE_EXCLUSION")
      case GSK_BLEND_MODE_COLOR => Some("GSK_BLEND_MODE_COLOR")
      case GSK_BLEND_MODE_HUE => Some("GSK_BLEND_MODE_HUE")
      case GSK_BLEND_MODE_SATURATION => Some("GSK_BLEND_MODE_SATURATION")
      case GSK_BLEND_MODE_LUMINOSITY => Some("GSK_BLEND_MODE_LUMINOSITY")
      case _ => None
  extension (a: GskBlendMode)
    inline def &(b: GskBlendMode): GskBlendMode = a & b
    inline def |(b: GskBlendMode): GskBlendMode = a | b
    inline def is(b: GskBlendMode): Boolean = (a & b) == b

/**
 * GtkAccessibleAutocomplete: _ACCESSIBLE_AUTOCOMPLETE_NONE: Automatic suggestions are not displayed. _ACCESSIBLE_AUTOCOMPLETE_INLINE: When a user is providing input, text suggesting one way to complete the provided input may be dynamically inserted after the caret. _ACCESSIBLE_AUTOCOMPLETE_LIST: When a user is providing input, an element containing a collection of values that could complete the provided input may be displayed. _ACCESSIBLE_AUTOCOMPLETE_BOTH: When a user is providing input, an element containing a collection of values that could complete the provided input may be displayed. If displayed, one value in the collection is automatically selected, and the text needed to complete the automatically selected value appears after the caret in the input.
*/
opaque type GtkAccessibleAutocomplete = CUnsignedInt
object GtkAccessibleAutocomplete extends CEnumU[GtkAccessibleAutocomplete]:
  given _tag: Tag[GtkAccessibleAutocomplete] = Tag.UInt
  inline def define(inline a: Long): GtkAccessibleAutocomplete = a.toUInt
  val GTK_ACCESSIBLE_AUTOCOMPLETE_NONE = define(0)
  val GTK_ACCESSIBLE_AUTOCOMPLETE_INLINE = define(1)
  val GTK_ACCESSIBLE_AUTOCOMPLETE_LIST = define(2)
  val GTK_ACCESSIBLE_AUTOCOMPLETE_BOTH = define(3)
  inline def getName(inline value: GtkAccessibleAutocomplete): Option[String] =
    inline value match
      case GTK_ACCESSIBLE_AUTOCOMPLETE_NONE => Some("GTK_ACCESSIBLE_AUTOCOMPLETE_NONE")
      case GTK_ACCESSIBLE_AUTOCOMPLETE_INLINE => Some("GTK_ACCESSIBLE_AUTOCOMPLETE_INLINE")
      case GTK_ACCESSIBLE_AUTOCOMPLETE_LIST => Some("GTK_ACCESSIBLE_AUTOCOMPLETE_LIST")
      case GTK_ACCESSIBLE_AUTOCOMPLETE_BOTH => Some("GTK_ACCESSIBLE_AUTOCOMPLETE_BOTH")
      case _ => None
  extension (a: GtkAccessibleAutocomplete)
    inline def &(b: GtkAccessibleAutocomplete): GtkAccessibleAutocomplete = a & b
    inline def |(b: GtkAccessibleAutocomplete): GtkAccessibleAutocomplete = a | b
    inline def is(b: GtkAccessibleAutocomplete): Boolean = (a & b) == b

/**
 * GtkAccessibleInvalidState: _ACCESSIBLE_INVALID_FALSE: There are no detected errors in the value _ACCESSIBLE_INVALID_TRUE: The value entered by the user has failed validation _ACCESSIBLE_INVALID_GRAMMAR: A grammatical error was detected _ACCESSIBLE_INVALID_SPELLING: A spelling error was detected
*/
opaque type GtkAccessibleInvalidState = CUnsignedInt
object GtkAccessibleInvalidState extends CEnumU[GtkAccessibleInvalidState]:
  given _tag: Tag[GtkAccessibleInvalidState] = Tag.UInt
  inline def define(inline a: Long): GtkAccessibleInvalidState = a.toUInt
  val GTK_ACCESSIBLE_INVALID_FALSE = define(0)
  val GTK_ACCESSIBLE_INVALID_TRUE = define(1)
  val GTK_ACCESSIBLE_INVALID_GRAMMAR = define(2)
  val GTK_ACCESSIBLE_INVALID_SPELLING = define(3)
  inline def getName(inline value: GtkAccessibleInvalidState): Option[String] =
    inline value match
      case GTK_ACCESSIBLE_INVALID_FALSE => Some("GTK_ACCESSIBLE_INVALID_FALSE")
      case GTK_ACCESSIBLE_INVALID_TRUE => Some("GTK_ACCESSIBLE_INVALID_TRUE")
      case GTK_ACCESSIBLE_INVALID_GRAMMAR => Some("GTK_ACCESSIBLE_INVALID_GRAMMAR")
      case GTK_ACCESSIBLE_INVALID_SPELLING => Some("GTK_ACCESSIBLE_INVALID_SPELLING")
      case _ => None
  extension (a: GtkAccessibleInvalidState)
    inline def &(b: GtkAccessibleInvalidState): GtkAccessibleInvalidState = a & b
    inline def |(b: GtkAccessibleInvalidState): GtkAccessibleInvalidState = a | b
    inline def is(b: GtkAccessibleInvalidState): Boolean = (a & b) == b

/**
 * GtkAccessibleProperty: _ACCESSIBLE_PROPERTY_AUTOCOMPLETE: Indicates whether inputting text could trigger display of one or more predictions of the user's intended value for a combobox, searchbox, or textbox and specifies how predictions would be presented if they were made. Value type: [enum] _ACCESSIBLE_PROPERTY_DESCRIPTION: Defines a string value that describes or annotates the current element. Value type: string _ACCESSIBLE_PROPERTY_HAS_POPUP: Indicates the availability and type of interactive popup element, such as menu or dialog, that can be triggered by an element. _ACCESSIBLE_PROPERTY_KEY_SHORTCUTS: Indicates keyboard shortcuts that an author has implemented to activate or give focus to an element. Value type: string _ACCESSIBLE_PROPERTY_LABEL: Defines a string value that labels the current element. Value type: string _ACCESSIBLE_PROPERTY_LEVEL: Defines the hierarchical level of an element within a structure. Value type: integer _ACCESSIBLE_PROPERTY_MODAL: Indicates whether an element is modal when displayed. Value type: boolean _ACCESSIBLE_PROPERTY_MULTI_LINE: Indicates whether a text box accepts multiple lines of input or only a single line. Value type: boolean _ACCESSIBLE_PROPERTY_MULTI_SELECTABLE: Indicates that the user may select more than one item from the current selectable descendants. Value type: boolean _ACCESSIBLE_PROPERTY_ORIENTATION: Indicates whether the element's orientation is horizontal, vertical, or unknown/ambiguous. Value type: [enum] _ACCESSIBLE_PROPERTY_PLACEHOLDER: Defines a short hint (a word or short phrase) intended to aid the user with data entry when the control has no value. A hint could be a sample value or a brief description of the expected format. Value type: string _ACCESSIBLE_PROPERTY_READ_ONLY: Indicates that the element is not editable, but is otherwise operable. Value type: boolean _ACCESSIBLE_PROPERTY_REQUIRED: Indicates that user input is required on the element before a form may be submitted. Value type: boolean _ACCESSIBLE_PROPERTY_ROLE_DESCRIPTION: Defines a human-readable, author-localized description for the role of an element. Value type: string _ACCESSIBLE_PROPERTY_SORT: Indicates if items in a table or grid are sorted in ascending or descending order. Value type: [enum] _ACCESSIBLE_PROPERTY_VALUE_MAX: Defines the maximum allowed value for a range widget. Value type: double _ACCESSIBLE_PROPERTY_VALUE_MIN: Defines the minimum allowed value for a range widget. Value type: double _ACCESSIBLE_PROPERTY_VALUE_NOW: Defines the current value for a range widget. Value type: double _ACCESSIBLE_PROPERTY_VALUE_TEXT: Defines the human readable text alternative of aria-valuenow for a range widget. Value type: string
*/
opaque type GtkAccessibleProperty = CUnsignedInt
object GtkAccessibleProperty extends CEnumU[GtkAccessibleProperty]:
  given _tag: Tag[GtkAccessibleProperty] = Tag.UInt
  inline def define(inline a: Long): GtkAccessibleProperty = a.toUInt
  val GTK_ACCESSIBLE_PROPERTY_AUTOCOMPLETE = define(0)
  val GTK_ACCESSIBLE_PROPERTY_DESCRIPTION = define(1)
  val GTK_ACCESSIBLE_PROPERTY_HAS_POPUP = define(2)
  val GTK_ACCESSIBLE_PROPERTY_KEY_SHORTCUTS = define(3)
  val GTK_ACCESSIBLE_PROPERTY_LABEL = define(4)
  val GTK_ACCESSIBLE_PROPERTY_LEVEL = define(5)
  val GTK_ACCESSIBLE_PROPERTY_MODAL = define(6)
  val GTK_ACCESSIBLE_PROPERTY_MULTI_LINE = define(7)
  val GTK_ACCESSIBLE_PROPERTY_MULTI_SELECTABLE = define(8)
  val GTK_ACCESSIBLE_PROPERTY_ORIENTATION = define(9)
  val GTK_ACCESSIBLE_PROPERTY_PLACEHOLDER = define(10)
  val GTK_ACCESSIBLE_PROPERTY_READ_ONLY = define(11)
  val GTK_ACCESSIBLE_PROPERTY_REQUIRED = define(12)
  val GTK_ACCESSIBLE_PROPERTY_ROLE_DESCRIPTION = define(13)
  val GTK_ACCESSIBLE_PROPERTY_SORT = define(14)
  val GTK_ACCESSIBLE_PROPERTY_VALUE_MAX = define(15)
  val GTK_ACCESSIBLE_PROPERTY_VALUE_MIN = define(16)
  val GTK_ACCESSIBLE_PROPERTY_VALUE_NOW = define(17)
  val GTK_ACCESSIBLE_PROPERTY_VALUE_TEXT = define(18)
  inline def getName(inline value: GtkAccessibleProperty): Option[String] =
    inline value match
      case GTK_ACCESSIBLE_PROPERTY_AUTOCOMPLETE => Some("GTK_ACCESSIBLE_PROPERTY_AUTOCOMPLETE")
      case GTK_ACCESSIBLE_PROPERTY_DESCRIPTION => Some("GTK_ACCESSIBLE_PROPERTY_DESCRIPTION")
      case GTK_ACCESSIBLE_PROPERTY_HAS_POPUP => Some("GTK_ACCESSIBLE_PROPERTY_HAS_POPUP")
      case GTK_ACCESSIBLE_PROPERTY_KEY_SHORTCUTS => Some("GTK_ACCESSIBLE_PROPERTY_KEY_SHORTCUTS")
      case GTK_ACCESSIBLE_PROPERTY_LABEL => Some("GTK_ACCESSIBLE_PROPERTY_LABEL")
      case GTK_ACCESSIBLE_PROPERTY_LEVEL => Some("GTK_ACCESSIBLE_PROPERTY_LEVEL")
      case GTK_ACCESSIBLE_PROPERTY_MODAL => Some("GTK_ACCESSIBLE_PROPERTY_MODAL")
      case GTK_ACCESSIBLE_PROPERTY_MULTI_LINE => Some("GTK_ACCESSIBLE_PROPERTY_MULTI_LINE")
      case GTK_ACCESSIBLE_PROPERTY_MULTI_SELECTABLE => Some("GTK_ACCESSIBLE_PROPERTY_MULTI_SELECTABLE")
      case GTK_ACCESSIBLE_PROPERTY_ORIENTATION => Some("GTK_ACCESSIBLE_PROPERTY_ORIENTATION")
      case GTK_ACCESSIBLE_PROPERTY_PLACEHOLDER => Some("GTK_ACCESSIBLE_PROPERTY_PLACEHOLDER")
      case GTK_ACCESSIBLE_PROPERTY_READ_ONLY => Some("GTK_ACCESSIBLE_PROPERTY_READ_ONLY")
      case GTK_ACCESSIBLE_PROPERTY_REQUIRED => Some("GTK_ACCESSIBLE_PROPERTY_REQUIRED")
      case GTK_ACCESSIBLE_PROPERTY_ROLE_DESCRIPTION => Some("GTK_ACCESSIBLE_PROPERTY_ROLE_DESCRIPTION")
      case GTK_ACCESSIBLE_PROPERTY_SORT => Some("GTK_ACCESSIBLE_PROPERTY_SORT")
      case GTK_ACCESSIBLE_PROPERTY_VALUE_MAX => Some("GTK_ACCESSIBLE_PROPERTY_VALUE_MAX")
      case GTK_ACCESSIBLE_PROPERTY_VALUE_MIN => Some("GTK_ACCESSIBLE_PROPERTY_VALUE_MIN")
      case GTK_ACCESSIBLE_PROPERTY_VALUE_NOW => Some("GTK_ACCESSIBLE_PROPERTY_VALUE_NOW")
      case GTK_ACCESSIBLE_PROPERTY_VALUE_TEXT => Some("GTK_ACCESSIBLE_PROPERTY_VALUE_TEXT")
      case _ => None
  extension (a: GtkAccessibleProperty)
    inline def &(b: GtkAccessibleProperty): GtkAccessibleProperty = a & b
    inline def |(b: GtkAccessibleProperty): GtkAccessibleProperty = a | b
    inline def is(b: GtkAccessibleProperty): Boolean = (a & b) == b

/**
 * GtkAccessibleRelation: _ACCESSIBLE_RELATION_ACTIVE_DESCENDANT: Identifies the currently active element when focus is on a composite widget, combobox, textbox, group, or application. Value type: reference _ACCESSIBLE_RELATION_COL_COUNT: Defines the total number of columns in a table, grid, or treegrid. Value type: integer _ACCESSIBLE_RELATION_COL_INDEX: Defines an element's column index or position with respect to the total number of columns within a table, grid, or treegrid. Value type: integer _ACCESSIBLE_RELATION_COL_INDEX_TEXT: Defines a human readable text alternative of %GTK_ACCESSIBLE_RELATION_COL_INDEX. Value type: string _ACCESSIBLE_RELATION_COL_SPAN: Defines the number of columns spanned by a cell or gridcell within a table, grid, or treegrid. Value type: integer _ACCESSIBLE_RELATION_CONTROLS: Identifies the element (or elements) whose contents or presence are controlled by the current element. Value type: reference _ACCESSIBLE_RELATION_DESCRIBED_BY: Identifies the element (or elements) that describes the object. Value type: reference _ACCESSIBLE_RELATION_DETAILS: Identifies the element (or elements) that provide additional information related to the object. Value type: reference _ACCESSIBLE_RELATION_ERROR_MESSAGE: Identifies the element that provides an error message for an object. Value type: reference _ACCESSIBLE_RELATION_FLOW_TO: Identifies the next element (or elements) in an alternate reading order of content which, at the user's discretion, allows assistive technology to override the general default of reading in document source order. Value type: reference _ACCESSIBLE_RELATION_LABELLED_BY: Identifies the element (or elements) that labels the current element. Value type: reference _ACCESSIBLE_RELATION_OWNS: Identifies an element (or elements) in order to define a visual, functional, or contextual parent/child relationship between elements where the widget hierarchy cannot be used to represent the relationship. Value type: reference _ACCESSIBLE_RELATION_POS_IN_SET: Defines an element's number or position in the current set of listitems or treeitems. Value type: integer _ACCESSIBLE_RELATION_ROW_COUNT: Defines the total number of rows in a table, grid, or treegrid. Value type: integer _ACCESSIBLE_RELATION_ROW_INDEX: Defines an element's row index or position with respect to the total number of rows within a table, grid, or treegrid. Value type: integer _ACCESSIBLE_RELATION_ROW_INDEX_TEXT: Defines a human readable text alternative of aria-rowindex. Value type: string _ACCESSIBLE_RELATION_ROW_SPAN: Defines the number of rows spanned by a cell or gridcell within a table, grid, or treegrid. Value type: integer _ACCESSIBLE_RELATION_SET_SIZE: Defines the number of items in the current set of listitems or treeitems. Value type: integer
*/
opaque type GtkAccessibleRelation = CUnsignedInt
object GtkAccessibleRelation extends CEnumU[GtkAccessibleRelation]:
  given _tag: Tag[GtkAccessibleRelation] = Tag.UInt
  inline def define(inline a: Long): GtkAccessibleRelation = a.toUInt
  val GTK_ACCESSIBLE_RELATION_ACTIVE_DESCENDANT = define(0)
  val GTK_ACCESSIBLE_RELATION_COL_COUNT = define(1)
  val GTK_ACCESSIBLE_RELATION_COL_INDEX = define(2)
  val GTK_ACCESSIBLE_RELATION_COL_INDEX_TEXT = define(3)
  val GTK_ACCESSIBLE_RELATION_COL_SPAN = define(4)
  val GTK_ACCESSIBLE_RELATION_CONTROLS = define(5)
  val GTK_ACCESSIBLE_RELATION_DESCRIBED_BY = define(6)
  val GTK_ACCESSIBLE_RELATION_DETAILS = define(7)
  val GTK_ACCESSIBLE_RELATION_ERROR_MESSAGE = define(8)
  val GTK_ACCESSIBLE_RELATION_FLOW_TO = define(9)
  val GTK_ACCESSIBLE_RELATION_LABELLED_BY = define(10)
  val GTK_ACCESSIBLE_RELATION_OWNS = define(11)
  val GTK_ACCESSIBLE_RELATION_POS_IN_SET = define(12)
  val GTK_ACCESSIBLE_RELATION_ROW_COUNT = define(13)
  val GTK_ACCESSIBLE_RELATION_ROW_INDEX = define(14)
  val GTK_ACCESSIBLE_RELATION_ROW_INDEX_TEXT = define(15)
  val GTK_ACCESSIBLE_RELATION_ROW_SPAN = define(16)
  val GTK_ACCESSIBLE_RELATION_SET_SIZE = define(17)
  inline def getName(inline value: GtkAccessibleRelation): Option[String] =
    inline value match
      case GTK_ACCESSIBLE_RELATION_ACTIVE_DESCENDANT => Some("GTK_ACCESSIBLE_RELATION_ACTIVE_DESCENDANT")
      case GTK_ACCESSIBLE_RELATION_COL_COUNT => Some("GTK_ACCESSIBLE_RELATION_COL_COUNT")
      case GTK_ACCESSIBLE_RELATION_COL_INDEX => Some("GTK_ACCESSIBLE_RELATION_COL_INDEX")
      case GTK_ACCESSIBLE_RELATION_COL_INDEX_TEXT => Some("GTK_ACCESSIBLE_RELATION_COL_INDEX_TEXT")
      case GTK_ACCESSIBLE_RELATION_COL_SPAN => Some("GTK_ACCESSIBLE_RELATION_COL_SPAN")
      case GTK_ACCESSIBLE_RELATION_CONTROLS => Some("GTK_ACCESSIBLE_RELATION_CONTROLS")
      case GTK_ACCESSIBLE_RELATION_DESCRIBED_BY => Some("GTK_ACCESSIBLE_RELATION_DESCRIBED_BY")
      case GTK_ACCESSIBLE_RELATION_DETAILS => Some("GTK_ACCESSIBLE_RELATION_DETAILS")
      case GTK_ACCESSIBLE_RELATION_ERROR_MESSAGE => Some("GTK_ACCESSIBLE_RELATION_ERROR_MESSAGE")
      case GTK_ACCESSIBLE_RELATION_FLOW_TO => Some("GTK_ACCESSIBLE_RELATION_FLOW_TO")
      case GTK_ACCESSIBLE_RELATION_LABELLED_BY => Some("GTK_ACCESSIBLE_RELATION_LABELLED_BY")
      case GTK_ACCESSIBLE_RELATION_OWNS => Some("GTK_ACCESSIBLE_RELATION_OWNS")
      case GTK_ACCESSIBLE_RELATION_POS_IN_SET => Some("GTK_ACCESSIBLE_RELATION_POS_IN_SET")
      case GTK_ACCESSIBLE_RELATION_ROW_COUNT => Some("GTK_ACCESSIBLE_RELATION_ROW_COUNT")
      case GTK_ACCESSIBLE_RELATION_ROW_INDEX => Some("GTK_ACCESSIBLE_RELATION_ROW_INDEX")
      case GTK_ACCESSIBLE_RELATION_ROW_INDEX_TEXT => Some("GTK_ACCESSIBLE_RELATION_ROW_INDEX_TEXT")
      case GTK_ACCESSIBLE_RELATION_ROW_SPAN => Some("GTK_ACCESSIBLE_RELATION_ROW_SPAN")
      case GTK_ACCESSIBLE_RELATION_SET_SIZE => Some("GTK_ACCESSIBLE_RELATION_SET_SIZE")
      case _ => None
  extension (a: GtkAccessibleRelation)
    inline def &(b: GtkAccessibleRelation): GtkAccessibleRelation = a & b
    inline def |(b: GtkAccessibleRelation): GtkAccessibleRelation = a | b
    inline def is(b: GtkAccessibleRelation): Boolean = (a & b) == b

/**
 * GtkAccessibleRole: _ACCESSIBLE_ROLE_ALERT: An element with important, and usually time-sensitive, information _ACCESSIBLE_ROLE_ALERT_DIALOG: A type of dialog that contains an alert message _ACCESSIBLE_ROLE_BANNER: Unused _ACCESSIBLE_ROLE_BUTTON: An input element that allows for user-triggered actions when clicked or pressed _ACCESSIBLE_ROLE_CAPTION: Unused _ACCESSIBLE_ROLE_CELL: Unused _ACCESSIBLE_ROLE_CHECKBOX: A checkable input element that has three possible values: `true`, `false`, or `mixed` _ACCESSIBLE_ROLE_COLUMN_HEADER: A header in a columned list. _ACCESSIBLE_ROLE_COMBO_BOX: An input that controls another element, such as a list or a grid, that can dynamically pop up to help the user set the value of the input _ACCESSIBLE_ROLE_COMMAND: Abstract role. _ACCESSIBLE_ROLE_COMPOSITE: Abstract role. _ACCESSIBLE_ROLE_DIALOG: A dialog is a window that is designed to interrupt the current processing of an application in order to prompt the user to enter information or require a response. _ACCESSIBLE_ROLE_DOCUMENT: Unused _ACCESSIBLE_ROLE_FEED: Unused _ACCESSIBLE_ROLE_FORM: Unused _ACCESSIBLE_ROLE_GENERIC: Unused _ACCESSIBLE_ROLE_GRID: A grid of items. _ACCESSIBLE_ROLE_GRID_CELL: An item in a grid or tree grid. _ACCESSIBLE_ROLE_GROUP: An element that groups multiple widgets. GTK uses this role for various containers, like [class], [class], and [class]. _ACCESSIBLE_ROLE_HEADING: Unused _ACCESSIBLE_ROLE_IMG: An image. _ACCESSIBLE_ROLE_INPUT: Abstract role. _ACCESSIBLE_ROLE_LABEL: A visible name or caption for a user interface component. _ACCESSIBLE_ROLE_LANDMARK: Abstract role. _ACCESSIBLE_ROLE_LEGEND: Unused _ACCESSIBLE_ROLE_LINK: A clickable link. _ACCESSIBLE_ROLE_LIST: A list of items. _ACCESSIBLE_ROLE_LIST_BOX: Unused. _ACCESSIBLE_ROLE_LIST_ITEM: An item in a list. _ACCESSIBLE_ROLE_LOG: Unused _ACCESSIBLE_ROLE_MAIN: Unused _ACCESSIBLE_ROLE_MARQUEE: Unused _ACCESSIBLE_ROLE_MATH: Unused _ACCESSIBLE_ROLE_METER: An element that represents a value within a known range. _ACCESSIBLE_ROLE_MENU: A menu. _ACCESSIBLE_ROLE_MENU_BAR: A menubar. _ACCESSIBLE_ROLE_MENU_ITEM: An item in a menu. _ACCESSIBLE_ROLE_MENU_ITEM_CHECKBOX: A check item in a menu. _ACCESSIBLE_ROLE_MENU_ITEM_RADIO: A radio item in a menu. _ACCESSIBLE_ROLE_NAVIGATION: Unused _ACCESSIBLE_ROLE_NONE: An element that is not represented to accessibility technologies. _ACCESSIBLE_ROLE_NOTE: Unused _ACCESSIBLE_ROLE_OPTION: Unused _ACCESSIBLE_ROLE_PRESENTATION: An element that is not represented to accessibility technologies. _ACCESSIBLE_ROLE_PROGRESS_BAR: An element that displays the progress status for tasks that take a long time. _ACCESSIBLE_ROLE_RADIO: A checkable input in a group of radio roles, only one of which can be checked at a time. _ACCESSIBLE_ROLE_RADIO_GROUP: Unused _ACCESSIBLE_ROLE_RANGE: Abstract role. _ACCESSIBLE_ROLE_REGION: Unused _ACCESSIBLE_ROLE_ROW: A row in a columned list. _ACCESSIBLE_ROLE_ROW_GROUP: Unused _ACCESSIBLE_ROLE_ROW_HEADER: Unused _ACCESSIBLE_ROLE_SCROLLBAR: A graphical object that controls the scrolling of content within a viewing area, regardless of whether the content is fully displayed within the viewing area. _ACCESSIBLE_ROLE_SEARCH: Unused _ACCESSIBLE_ROLE_SEARCH_BOX: A type of textbox intended for specifying search criteria. _ACCESSIBLE_ROLE_SECTION: Abstract role. _ACCESSIBLE_ROLE_SECTION_HEAD: Abstract role. _ACCESSIBLE_ROLE_SELECT: Abstract role. _ACCESSIBLE_ROLE_SEPARATOR: A divider that separates and distinguishes sections of content or groups of menuitems. _ACCESSIBLE_ROLE_SLIDER: A user input where the user selects a value from within a given range. _ACCESSIBLE_ROLE_SPIN_BUTTON: A form of range that expects the user to select from among discrete choices. _ACCESSIBLE_ROLE_STATUS: Unused _ACCESSIBLE_ROLE_STRUCTURE: Abstract role. _ACCESSIBLE_ROLE_SWITCH: A type of checkbox that represents on/off values, as opposed to checked/unchecked values. _ACCESSIBLE_ROLE_TAB: An item in a list of tab used for switching pages. _ACCESSIBLE_ROLE_TABLE: Unused _ACCESSIBLE_ROLE_TAB_LIST: A list of tabs for switching pages. _ACCESSIBLE_ROLE_TAB_PANEL: A page in a notebook or stack. _ACCESSIBLE_ROLE_TEXT_BOX: A type of input that allows free-form text as its value. _ACCESSIBLE_ROLE_TIME: Unused _ACCESSIBLE_ROLE_TIMER: Unused _ACCESSIBLE_ROLE_TOOLBAR: Unused _ACCESSIBLE_ROLE_TOOLTIP: Unused _ACCESSIBLE_ROLE_TREE: Unused _ACCESSIBLE_ROLE_TREE_GRID: A treeview-like, columned list. _ACCESSIBLE_ROLE_TREE_ITEM: Unused _ACCESSIBLE_ROLE_WIDGET: An interactive component of a graphical user interface. This is the role that GTK uses by default for widgets. _ACCESSIBLE_ROLE_WINDOW: An application window.
*/
opaque type GtkAccessibleRole = CUnsignedInt
object GtkAccessibleRole extends CEnumU[GtkAccessibleRole]:
  given _tag: Tag[GtkAccessibleRole] = Tag.UInt
  inline def define(inline a: Long): GtkAccessibleRole = a.toUInt
  val GTK_ACCESSIBLE_ROLE_ALERT = define(0)
  val GTK_ACCESSIBLE_ROLE_ALERT_DIALOG = define(1)
  val GTK_ACCESSIBLE_ROLE_BANNER = define(2)
  val GTK_ACCESSIBLE_ROLE_BUTTON = define(3)
  val GTK_ACCESSIBLE_ROLE_CAPTION = define(4)
  val GTK_ACCESSIBLE_ROLE_CELL = define(5)
  val GTK_ACCESSIBLE_ROLE_CHECKBOX = define(6)
  val GTK_ACCESSIBLE_ROLE_COLUMN_HEADER = define(7)
  val GTK_ACCESSIBLE_ROLE_COMBO_BOX = define(8)
  val GTK_ACCESSIBLE_ROLE_COMMAND = define(9)
  val GTK_ACCESSIBLE_ROLE_COMPOSITE = define(10)
  val GTK_ACCESSIBLE_ROLE_DIALOG = define(11)
  val GTK_ACCESSIBLE_ROLE_DOCUMENT = define(12)
  val GTK_ACCESSIBLE_ROLE_FEED = define(13)
  val GTK_ACCESSIBLE_ROLE_FORM = define(14)
  val GTK_ACCESSIBLE_ROLE_GENERIC = define(15)
  val GTK_ACCESSIBLE_ROLE_GRID = define(16)
  val GTK_ACCESSIBLE_ROLE_GRID_CELL = define(17)
  val GTK_ACCESSIBLE_ROLE_GROUP = define(18)
  val GTK_ACCESSIBLE_ROLE_HEADING = define(19)
  val GTK_ACCESSIBLE_ROLE_IMG = define(20)
  val GTK_ACCESSIBLE_ROLE_INPUT = define(21)
  val GTK_ACCESSIBLE_ROLE_LABEL = define(22)
  val GTK_ACCESSIBLE_ROLE_LANDMARK = define(23)
  val GTK_ACCESSIBLE_ROLE_LEGEND = define(24)
  val GTK_ACCESSIBLE_ROLE_LINK = define(25)
  val GTK_ACCESSIBLE_ROLE_LIST = define(26)
  val GTK_ACCESSIBLE_ROLE_LIST_BOX = define(27)
  val GTK_ACCESSIBLE_ROLE_LIST_ITEM = define(28)
  val GTK_ACCESSIBLE_ROLE_LOG = define(29)
  val GTK_ACCESSIBLE_ROLE_MAIN = define(30)
  val GTK_ACCESSIBLE_ROLE_MARQUEE = define(31)
  val GTK_ACCESSIBLE_ROLE_MATH = define(32)
  val GTK_ACCESSIBLE_ROLE_METER = define(33)
  val GTK_ACCESSIBLE_ROLE_MENU = define(34)
  val GTK_ACCESSIBLE_ROLE_MENU_BAR = define(35)
  val GTK_ACCESSIBLE_ROLE_MENU_ITEM = define(36)
  val GTK_ACCESSIBLE_ROLE_MENU_ITEM_CHECKBOX = define(37)
  val GTK_ACCESSIBLE_ROLE_MENU_ITEM_RADIO = define(38)
  val GTK_ACCESSIBLE_ROLE_NAVIGATION = define(39)
  val GTK_ACCESSIBLE_ROLE_NONE = define(40)
  val GTK_ACCESSIBLE_ROLE_NOTE = define(41)
  val GTK_ACCESSIBLE_ROLE_OPTION = define(42)
  val GTK_ACCESSIBLE_ROLE_PRESENTATION = define(43)
  val GTK_ACCESSIBLE_ROLE_PROGRESS_BAR = define(44)
  val GTK_ACCESSIBLE_ROLE_RADIO = define(45)
  val GTK_ACCESSIBLE_ROLE_RADIO_GROUP = define(46)
  val GTK_ACCESSIBLE_ROLE_RANGE = define(47)
  val GTK_ACCESSIBLE_ROLE_REGION = define(48)
  val GTK_ACCESSIBLE_ROLE_ROW = define(49)
  val GTK_ACCESSIBLE_ROLE_ROW_GROUP = define(50)
  val GTK_ACCESSIBLE_ROLE_ROW_HEADER = define(51)
  val GTK_ACCESSIBLE_ROLE_SCROLLBAR = define(52)
  val GTK_ACCESSIBLE_ROLE_SEARCH = define(53)
  val GTK_ACCESSIBLE_ROLE_SEARCH_BOX = define(54)
  val GTK_ACCESSIBLE_ROLE_SECTION = define(55)
  val GTK_ACCESSIBLE_ROLE_SECTION_HEAD = define(56)
  val GTK_ACCESSIBLE_ROLE_SELECT = define(57)
  val GTK_ACCESSIBLE_ROLE_SEPARATOR = define(58)
  val GTK_ACCESSIBLE_ROLE_SLIDER = define(59)
  val GTK_ACCESSIBLE_ROLE_SPIN_BUTTON = define(60)
  val GTK_ACCESSIBLE_ROLE_STATUS = define(61)
  val GTK_ACCESSIBLE_ROLE_STRUCTURE = define(62)
  val GTK_ACCESSIBLE_ROLE_SWITCH = define(63)
  val GTK_ACCESSIBLE_ROLE_TAB = define(64)
  val GTK_ACCESSIBLE_ROLE_TABLE = define(65)
  val GTK_ACCESSIBLE_ROLE_TAB_LIST = define(66)
  val GTK_ACCESSIBLE_ROLE_TAB_PANEL = define(67)
  val GTK_ACCESSIBLE_ROLE_TEXT_BOX = define(68)
  val GTK_ACCESSIBLE_ROLE_TIME = define(69)
  val GTK_ACCESSIBLE_ROLE_TIMER = define(70)
  val GTK_ACCESSIBLE_ROLE_TOOLBAR = define(71)
  val GTK_ACCESSIBLE_ROLE_TOOLTIP = define(72)
  val GTK_ACCESSIBLE_ROLE_TREE = define(73)
  val GTK_ACCESSIBLE_ROLE_TREE_GRID = define(74)
  val GTK_ACCESSIBLE_ROLE_TREE_ITEM = define(75)
  val GTK_ACCESSIBLE_ROLE_WIDGET = define(76)
  val GTK_ACCESSIBLE_ROLE_WINDOW = define(77)
  inline def getName(inline value: GtkAccessibleRole): Option[String] =
    inline value match
      case GTK_ACCESSIBLE_ROLE_ALERT => Some("GTK_ACCESSIBLE_ROLE_ALERT")
      case GTK_ACCESSIBLE_ROLE_ALERT_DIALOG => Some("GTK_ACCESSIBLE_ROLE_ALERT_DIALOG")
      case GTK_ACCESSIBLE_ROLE_BANNER => Some("GTK_ACCESSIBLE_ROLE_BANNER")
      case GTK_ACCESSIBLE_ROLE_BUTTON => Some("GTK_ACCESSIBLE_ROLE_BUTTON")
      case GTK_ACCESSIBLE_ROLE_CAPTION => Some("GTK_ACCESSIBLE_ROLE_CAPTION")
      case GTK_ACCESSIBLE_ROLE_CELL => Some("GTK_ACCESSIBLE_ROLE_CELL")
      case GTK_ACCESSIBLE_ROLE_CHECKBOX => Some("GTK_ACCESSIBLE_ROLE_CHECKBOX")
      case GTK_ACCESSIBLE_ROLE_COLUMN_HEADER => Some("GTK_ACCESSIBLE_ROLE_COLUMN_HEADER")
      case GTK_ACCESSIBLE_ROLE_COMBO_BOX => Some("GTK_ACCESSIBLE_ROLE_COMBO_BOX")
      case GTK_ACCESSIBLE_ROLE_COMMAND => Some("GTK_ACCESSIBLE_ROLE_COMMAND")
      case GTK_ACCESSIBLE_ROLE_COMPOSITE => Some("GTK_ACCESSIBLE_ROLE_COMPOSITE")
      case GTK_ACCESSIBLE_ROLE_DIALOG => Some("GTK_ACCESSIBLE_ROLE_DIALOG")
      case GTK_ACCESSIBLE_ROLE_DOCUMENT => Some("GTK_ACCESSIBLE_ROLE_DOCUMENT")
      case GTK_ACCESSIBLE_ROLE_FEED => Some("GTK_ACCESSIBLE_ROLE_FEED")
      case GTK_ACCESSIBLE_ROLE_FORM => Some("GTK_ACCESSIBLE_ROLE_FORM")
      case GTK_ACCESSIBLE_ROLE_GENERIC => Some("GTK_ACCESSIBLE_ROLE_GENERIC")
      case GTK_ACCESSIBLE_ROLE_GRID => Some("GTK_ACCESSIBLE_ROLE_GRID")
      case GTK_ACCESSIBLE_ROLE_GRID_CELL => Some("GTK_ACCESSIBLE_ROLE_GRID_CELL")
      case GTK_ACCESSIBLE_ROLE_GROUP => Some("GTK_ACCESSIBLE_ROLE_GROUP")
      case GTK_ACCESSIBLE_ROLE_HEADING => Some("GTK_ACCESSIBLE_ROLE_HEADING")
      case GTK_ACCESSIBLE_ROLE_IMG => Some("GTK_ACCESSIBLE_ROLE_IMG")
      case GTK_ACCESSIBLE_ROLE_INPUT => Some("GTK_ACCESSIBLE_ROLE_INPUT")
      case GTK_ACCESSIBLE_ROLE_LABEL => Some("GTK_ACCESSIBLE_ROLE_LABEL")
      case GTK_ACCESSIBLE_ROLE_LANDMARK => Some("GTK_ACCESSIBLE_ROLE_LANDMARK")
      case GTK_ACCESSIBLE_ROLE_LEGEND => Some("GTK_ACCESSIBLE_ROLE_LEGEND")
      case GTK_ACCESSIBLE_ROLE_LINK => Some("GTK_ACCESSIBLE_ROLE_LINK")
      case GTK_ACCESSIBLE_ROLE_LIST => Some("GTK_ACCESSIBLE_ROLE_LIST")
      case GTK_ACCESSIBLE_ROLE_LIST_BOX => Some("GTK_ACCESSIBLE_ROLE_LIST_BOX")
      case GTK_ACCESSIBLE_ROLE_LIST_ITEM => Some("GTK_ACCESSIBLE_ROLE_LIST_ITEM")
      case GTK_ACCESSIBLE_ROLE_LOG => Some("GTK_ACCESSIBLE_ROLE_LOG")
      case GTK_ACCESSIBLE_ROLE_MAIN => Some("GTK_ACCESSIBLE_ROLE_MAIN")
      case GTK_ACCESSIBLE_ROLE_MARQUEE => Some("GTK_ACCESSIBLE_ROLE_MARQUEE")
      case GTK_ACCESSIBLE_ROLE_MATH => Some("GTK_ACCESSIBLE_ROLE_MATH")
      case GTK_ACCESSIBLE_ROLE_METER => Some("GTK_ACCESSIBLE_ROLE_METER")
      case GTK_ACCESSIBLE_ROLE_MENU => Some("GTK_ACCESSIBLE_ROLE_MENU")
      case GTK_ACCESSIBLE_ROLE_MENU_BAR => Some("GTK_ACCESSIBLE_ROLE_MENU_BAR")
      case GTK_ACCESSIBLE_ROLE_MENU_ITEM => Some("GTK_ACCESSIBLE_ROLE_MENU_ITEM")
      case GTK_ACCESSIBLE_ROLE_MENU_ITEM_CHECKBOX => Some("GTK_ACCESSIBLE_ROLE_MENU_ITEM_CHECKBOX")
      case GTK_ACCESSIBLE_ROLE_MENU_ITEM_RADIO => Some("GTK_ACCESSIBLE_ROLE_MENU_ITEM_RADIO")
      case GTK_ACCESSIBLE_ROLE_NAVIGATION => Some("GTK_ACCESSIBLE_ROLE_NAVIGATION")
      case GTK_ACCESSIBLE_ROLE_NONE => Some("GTK_ACCESSIBLE_ROLE_NONE")
      case GTK_ACCESSIBLE_ROLE_NOTE => Some("GTK_ACCESSIBLE_ROLE_NOTE")
      case GTK_ACCESSIBLE_ROLE_OPTION => Some("GTK_ACCESSIBLE_ROLE_OPTION")
      case GTK_ACCESSIBLE_ROLE_PRESENTATION => Some("GTK_ACCESSIBLE_ROLE_PRESENTATION")
      case GTK_ACCESSIBLE_ROLE_PROGRESS_BAR => Some("GTK_ACCESSIBLE_ROLE_PROGRESS_BAR")
      case GTK_ACCESSIBLE_ROLE_RADIO => Some("GTK_ACCESSIBLE_ROLE_RADIO")
      case GTK_ACCESSIBLE_ROLE_RADIO_GROUP => Some("GTK_ACCESSIBLE_ROLE_RADIO_GROUP")
      case GTK_ACCESSIBLE_ROLE_RANGE => Some("GTK_ACCESSIBLE_ROLE_RANGE")
      case GTK_ACCESSIBLE_ROLE_REGION => Some("GTK_ACCESSIBLE_ROLE_REGION")
      case GTK_ACCESSIBLE_ROLE_ROW => Some("GTK_ACCESSIBLE_ROLE_ROW")
      case GTK_ACCESSIBLE_ROLE_ROW_GROUP => Some("GTK_ACCESSIBLE_ROLE_ROW_GROUP")
      case GTK_ACCESSIBLE_ROLE_ROW_HEADER => Some("GTK_ACCESSIBLE_ROLE_ROW_HEADER")
      case GTK_ACCESSIBLE_ROLE_SCROLLBAR => Some("GTK_ACCESSIBLE_ROLE_SCROLLBAR")
      case GTK_ACCESSIBLE_ROLE_SEARCH => Some("GTK_ACCESSIBLE_ROLE_SEARCH")
      case GTK_ACCESSIBLE_ROLE_SEARCH_BOX => Some("GTK_ACCESSIBLE_ROLE_SEARCH_BOX")
      case GTK_ACCESSIBLE_ROLE_SECTION => Some("GTK_ACCESSIBLE_ROLE_SECTION")
      case GTK_ACCESSIBLE_ROLE_SECTION_HEAD => Some("GTK_ACCESSIBLE_ROLE_SECTION_HEAD")
      case GTK_ACCESSIBLE_ROLE_SELECT => Some("GTK_ACCESSIBLE_ROLE_SELECT")
      case GTK_ACCESSIBLE_ROLE_SEPARATOR => Some("GTK_ACCESSIBLE_ROLE_SEPARATOR")
      case GTK_ACCESSIBLE_ROLE_SLIDER => Some("GTK_ACCESSIBLE_ROLE_SLIDER")
      case GTK_ACCESSIBLE_ROLE_SPIN_BUTTON => Some("GTK_ACCESSIBLE_ROLE_SPIN_BUTTON")
      case GTK_ACCESSIBLE_ROLE_STATUS => Some("GTK_ACCESSIBLE_ROLE_STATUS")
      case GTK_ACCESSIBLE_ROLE_STRUCTURE => Some("GTK_ACCESSIBLE_ROLE_STRUCTURE")
      case GTK_ACCESSIBLE_ROLE_SWITCH => Some("GTK_ACCESSIBLE_ROLE_SWITCH")
      case GTK_ACCESSIBLE_ROLE_TAB => Some("GTK_ACCESSIBLE_ROLE_TAB")
      case GTK_ACCESSIBLE_ROLE_TABLE => Some("GTK_ACCESSIBLE_ROLE_TABLE")
      case GTK_ACCESSIBLE_ROLE_TAB_LIST => Some("GTK_ACCESSIBLE_ROLE_TAB_LIST")
      case GTK_ACCESSIBLE_ROLE_TAB_PANEL => Some("GTK_ACCESSIBLE_ROLE_TAB_PANEL")
      case GTK_ACCESSIBLE_ROLE_TEXT_BOX => Some("GTK_ACCESSIBLE_ROLE_TEXT_BOX")
      case GTK_ACCESSIBLE_ROLE_TIME => Some("GTK_ACCESSIBLE_ROLE_TIME")
      case GTK_ACCESSIBLE_ROLE_TIMER => Some("GTK_ACCESSIBLE_ROLE_TIMER")
      case GTK_ACCESSIBLE_ROLE_TOOLBAR => Some("GTK_ACCESSIBLE_ROLE_TOOLBAR")
      case GTK_ACCESSIBLE_ROLE_TOOLTIP => Some("GTK_ACCESSIBLE_ROLE_TOOLTIP")
      case GTK_ACCESSIBLE_ROLE_TREE => Some("GTK_ACCESSIBLE_ROLE_TREE")
      case GTK_ACCESSIBLE_ROLE_TREE_GRID => Some("GTK_ACCESSIBLE_ROLE_TREE_GRID")
      case GTK_ACCESSIBLE_ROLE_TREE_ITEM => Some("GTK_ACCESSIBLE_ROLE_TREE_ITEM")
      case GTK_ACCESSIBLE_ROLE_WIDGET => Some("GTK_ACCESSIBLE_ROLE_WIDGET")
      case GTK_ACCESSIBLE_ROLE_WINDOW => Some("GTK_ACCESSIBLE_ROLE_WINDOW")
      case _ => None
  extension (a: GtkAccessibleRole)
    inline def &(b: GtkAccessibleRole): GtkAccessibleRole = a & b
    inline def |(b: GtkAccessibleRole): GtkAccessibleRole = a | b
    inline def is(b: GtkAccessibleRole): Boolean = (a & b) == b

/**
 * GtkAccessibleSort: _ACCESSIBLE_SORT_NONE: There is no defined sort applied to the column. _ACCESSIBLE_SORT_ASCENDING: Items are sorted in ascending order by this column. _ACCESSIBLE_SORT_DESCENDING: Items are sorted in descending order by this column. _ACCESSIBLE_SORT_OTHER: A sort algorithm other than ascending or descending has been applied.
*/
opaque type GtkAccessibleSort = CUnsignedInt
object GtkAccessibleSort extends CEnumU[GtkAccessibleSort]:
  given _tag: Tag[GtkAccessibleSort] = Tag.UInt
  inline def define(inline a: Long): GtkAccessibleSort = a.toUInt
  val GTK_ACCESSIBLE_SORT_NONE = define(0)
  val GTK_ACCESSIBLE_SORT_ASCENDING = define(1)
  val GTK_ACCESSIBLE_SORT_DESCENDING = define(2)
  val GTK_ACCESSIBLE_SORT_OTHER = define(3)
  inline def getName(inline value: GtkAccessibleSort): Option[String] =
    inline value match
      case GTK_ACCESSIBLE_SORT_NONE => Some("GTK_ACCESSIBLE_SORT_NONE")
      case GTK_ACCESSIBLE_SORT_ASCENDING => Some("GTK_ACCESSIBLE_SORT_ASCENDING")
      case GTK_ACCESSIBLE_SORT_DESCENDING => Some("GTK_ACCESSIBLE_SORT_DESCENDING")
      case GTK_ACCESSIBLE_SORT_OTHER => Some("GTK_ACCESSIBLE_SORT_OTHER")
      case _ => None
  extension (a: GtkAccessibleSort)
    inline def &(b: GtkAccessibleSort): GtkAccessibleSort = a & b
    inline def |(b: GtkAccessibleSort): GtkAccessibleSort = a | b
    inline def is(b: GtkAccessibleSort): Boolean = (a & b) == b

/**
 * GtkAccessibleState: _ACCESSIBLE_STATE_BUSY: A “busy” state. This state has boolean values _ACCESSIBLE_STATE_CHECKED: A “checked” state; indicates the current state of a [class]. Value type: [enum] _ACCESSIBLE_STATE_DISABLED: A “disabled” state; corresponds to the [property:sensitive] property. It indicates a UI element that is perceivable, but not editable or operable. Value type: boolean _ACCESSIBLE_STATE_EXPANDED: An “expanded” state; corresponds to the [property:expanded] property. Value type: boolean or undefined _ACCESSIBLE_STATE_HIDDEN: A “hidden” state; corresponds to the [property:visible] property. You can use this state explicitly on UI elements that should not be exposed to an assistive technology. Value type: boolean See also: %GTK_ACCESSIBLE_STATE_DISABLED _ACCESSIBLE_STATE_INVALID: An “invalid” state; set when a widget is showing an error. Value type: [enum] _ACCESSIBLE_STATE_PRESSED: A “pressed” state; indicates the current state of a [class]. Value type: [enum] enumeration _ACCESSIBLE_STATE_SELECTED: A “selected” state; set when a widget is selected. Value type: boolean or undefined
*/
opaque type GtkAccessibleState = CUnsignedInt
object GtkAccessibleState extends CEnumU[GtkAccessibleState]:
  given _tag: Tag[GtkAccessibleState] = Tag.UInt
  inline def define(inline a: Long): GtkAccessibleState = a.toUInt
  val GTK_ACCESSIBLE_STATE_BUSY = define(0)
  val GTK_ACCESSIBLE_STATE_CHECKED = define(1)
  val GTK_ACCESSIBLE_STATE_DISABLED = define(2)
  val GTK_ACCESSIBLE_STATE_EXPANDED = define(3)
  val GTK_ACCESSIBLE_STATE_HIDDEN = define(4)
  val GTK_ACCESSIBLE_STATE_INVALID = define(5)
  val GTK_ACCESSIBLE_STATE_PRESSED = define(6)
  val GTK_ACCESSIBLE_STATE_SELECTED = define(7)
  inline def getName(inline value: GtkAccessibleState): Option[String] =
    inline value match
      case GTK_ACCESSIBLE_STATE_BUSY => Some("GTK_ACCESSIBLE_STATE_BUSY")
      case GTK_ACCESSIBLE_STATE_CHECKED => Some("GTK_ACCESSIBLE_STATE_CHECKED")
      case GTK_ACCESSIBLE_STATE_DISABLED => Some("GTK_ACCESSIBLE_STATE_DISABLED")
      case GTK_ACCESSIBLE_STATE_EXPANDED => Some("GTK_ACCESSIBLE_STATE_EXPANDED")
      case GTK_ACCESSIBLE_STATE_HIDDEN => Some("GTK_ACCESSIBLE_STATE_HIDDEN")
      case GTK_ACCESSIBLE_STATE_INVALID => Some("GTK_ACCESSIBLE_STATE_INVALID")
      case GTK_ACCESSIBLE_STATE_PRESSED => Some("GTK_ACCESSIBLE_STATE_PRESSED")
      case GTK_ACCESSIBLE_STATE_SELECTED => Some("GTK_ACCESSIBLE_STATE_SELECTED")
      case _ => None
  extension (a: GtkAccessibleState)
    inline def &(b: GtkAccessibleState): GtkAccessibleState = a & b
    inline def |(b: GtkAccessibleState): GtkAccessibleState = a | b
    inline def is(b: GtkAccessibleState): Boolean = (a & b) == b

/**
 * GtkAccessibleTristate: _ACCESSIBLE_TRISTATE_FALSE: The state is `false` _ACCESSIBLE_TRISTATE_TRUE: The state is `true` _ACCESSIBLE_TRISTATE_MIXED: The state is `mixed`
*/
opaque type GtkAccessibleTristate = CUnsignedInt
object GtkAccessibleTristate extends CEnumU[GtkAccessibleTristate]:
  given _tag: Tag[GtkAccessibleTristate] = Tag.UInt
  inline def define(inline a: Long): GtkAccessibleTristate = a.toUInt
  val GTK_ACCESSIBLE_TRISTATE_FALSE = define(0)
  val GTK_ACCESSIBLE_TRISTATE_TRUE = define(1)
  val GTK_ACCESSIBLE_TRISTATE_MIXED = define(2)
  inline def getName(inline value: GtkAccessibleTristate): Option[String] =
    inline value match
      case GTK_ACCESSIBLE_TRISTATE_FALSE => Some("GTK_ACCESSIBLE_TRISTATE_FALSE")
      case GTK_ACCESSIBLE_TRISTATE_TRUE => Some("GTK_ACCESSIBLE_TRISTATE_TRUE")
      case GTK_ACCESSIBLE_TRISTATE_MIXED => Some("GTK_ACCESSIBLE_TRISTATE_MIXED")
      case _ => None
  extension (a: GtkAccessibleTristate)
    inline def &(b: GtkAccessibleTristate): GtkAccessibleTristate = a & b
    inline def |(b: GtkAccessibleTristate): GtkAccessibleTristate = a | b
    inline def is(b: GtkAccessibleTristate): Boolean = (a & b) == b

/**
 * GtkAlign: _ALIGN_FILL: stretch to fill all space if possible, center if no meaningful way to stretch _ALIGN_START: snap to left or top side, leaving space on right or bottom _ALIGN_END: snap to right or bottom side, leaving space on left or top _ALIGN_CENTER: center natural width of widget inside the allocation _ALIGN_BASELINE: align the widget according to the baseline. See [class.Widget].
*/
opaque type GtkAlign = CUnsignedInt
object GtkAlign extends CEnumU[GtkAlign]:
  given _tag: Tag[GtkAlign] = Tag.UInt
  inline def define(inline a: Long): GtkAlign = a.toUInt
  val GTK_ALIGN_FILL = define(0)
  val GTK_ALIGN_START = define(1)
  val GTK_ALIGN_END = define(2)
  val GTK_ALIGN_CENTER = define(3)
  val GTK_ALIGN_BASELINE = define(4)
  inline def getName(inline value: GtkAlign): Option[String] =
    inline value match
      case GTK_ALIGN_FILL => Some("GTK_ALIGN_FILL")
      case GTK_ALIGN_START => Some("GTK_ALIGN_START")
      case GTK_ALIGN_END => Some("GTK_ALIGN_END")
      case GTK_ALIGN_CENTER => Some("GTK_ALIGN_CENTER")
      case GTK_ALIGN_BASELINE => Some("GTK_ALIGN_BASELINE")
      case _ => None
  extension (a: GtkAlign)
    inline def &(b: GtkAlign): GtkAlign = a & b
    inline def |(b: GtkAlign): GtkAlign = a | b
    inline def is(b: GtkAlign): Boolean = (a & b) == b

/**
*/
opaque type GtkApplicationInhibitFlags = CUnsignedInt
object GtkApplicationInhibitFlags extends CEnumU[GtkApplicationInhibitFlags]:
  given _tag: Tag[GtkApplicationInhibitFlags] = Tag.UInt
  inline def define(inline a: Long): GtkApplicationInhibitFlags = a.toUInt
  val GTK_APPLICATION_INHIBIT_LOGOUT = define(1)
  val GTK_APPLICATION_INHIBIT_SWITCH = define(2)
  val GTK_APPLICATION_INHIBIT_SUSPEND = define(4)
  val GTK_APPLICATION_INHIBIT_IDLE = define(8)
  inline def getName(inline value: GtkApplicationInhibitFlags): Option[String] =
    inline value match
      case GTK_APPLICATION_INHIBIT_LOGOUT => Some("GTK_APPLICATION_INHIBIT_LOGOUT")
      case GTK_APPLICATION_INHIBIT_SWITCH => Some("GTK_APPLICATION_INHIBIT_SWITCH")
      case GTK_APPLICATION_INHIBIT_SUSPEND => Some("GTK_APPLICATION_INHIBIT_SUSPEND")
      case GTK_APPLICATION_INHIBIT_IDLE => Some("GTK_APPLICATION_INHIBIT_IDLE")
      case _ => None
  extension (a: GtkApplicationInhibitFlags)
    inline def &(b: GtkApplicationInhibitFlags): GtkApplicationInhibitFlags = a & b
    inline def |(b: GtkApplicationInhibitFlags): GtkApplicationInhibitFlags = a | b
    inline def is(b: GtkApplicationInhibitFlags): Boolean = (a & b) == b

/**
 * GtkArrowType: _ARROW_UP: Represents an upward pointing arrow. _ARROW_DOWN: Represents a downward pointing arrow. _ARROW_LEFT: Represents a left pointing arrow. _ARROW_RIGHT: Represents a right pointing arrow. _ARROW_NONE: No arrow.
*/
opaque type GtkArrowType = CUnsignedInt
object GtkArrowType extends CEnumU[GtkArrowType]:
  given _tag: Tag[GtkArrowType] = Tag.UInt
  inline def define(inline a: Long): GtkArrowType = a.toUInt
  val GTK_ARROW_UP = define(0)
  val GTK_ARROW_DOWN = define(1)
  val GTK_ARROW_LEFT = define(2)
  val GTK_ARROW_RIGHT = define(3)
  val GTK_ARROW_NONE = define(4)
  inline def getName(inline value: GtkArrowType): Option[String] =
    inline value match
      case GTK_ARROW_UP => Some("GTK_ARROW_UP")
      case GTK_ARROW_DOWN => Some("GTK_ARROW_DOWN")
      case GTK_ARROW_LEFT => Some("GTK_ARROW_LEFT")
      case GTK_ARROW_RIGHT => Some("GTK_ARROW_RIGHT")
      case GTK_ARROW_NONE => Some("GTK_ARROW_NONE")
      case _ => None
  extension (a: GtkArrowType)
    inline def &(b: GtkArrowType): GtkArrowType = a & b
    inline def |(b: GtkArrowType): GtkArrowType = a | b
    inline def is(b: GtkArrowType): Boolean = (a & b) == b

/**
 * GtkAssistantPageType: _ASSISTANT_PAGE_CONTENT: The page has regular contents. Both the Back and forward buttons will be shown. _ASSISTANT_PAGE_INTRO: The page contains an introduction to the assistant task. Only the Forward button will be shown if there is a next page. _ASSISTANT_PAGE_CONFIRM: The page lets the user confirm or deny the changes. The Back and Apply buttons will be shown. _ASSISTANT_PAGE_SUMMARY: The page informs the user of the changes done. Only the Close button will be shown. _ASSISTANT_PAGE_PROGRESS: Used for tasks that take a long time to complete, blocks the assistant until the page is marked as complete. Only the back button will be shown. _ASSISTANT_PAGE_CUSTOM: Used for when other page types are not appropriate. No buttons will be shown, and the application must add its own buttons through gtk_assistant_add_action_widget().
*/
opaque type GtkAssistantPageType = CUnsignedInt
object GtkAssistantPageType extends CEnumU[GtkAssistantPageType]:
  given _tag: Tag[GtkAssistantPageType] = Tag.UInt
  inline def define(inline a: Long): GtkAssistantPageType = a.toUInt
  val GTK_ASSISTANT_PAGE_CONTENT = define(0)
  val GTK_ASSISTANT_PAGE_INTRO = define(1)
  val GTK_ASSISTANT_PAGE_CONFIRM = define(2)
  val GTK_ASSISTANT_PAGE_SUMMARY = define(3)
  val GTK_ASSISTANT_PAGE_PROGRESS = define(4)
  val GTK_ASSISTANT_PAGE_CUSTOM = define(5)
  inline def getName(inline value: GtkAssistantPageType): Option[String] =
    inline value match
      case GTK_ASSISTANT_PAGE_CONTENT => Some("GTK_ASSISTANT_PAGE_CONTENT")
      case GTK_ASSISTANT_PAGE_INTRO => Some("GTK_ASSISTANT_PAGE_INTRO")
      case GTK_ASSISTANT_PAGE_CONFIRM => Some("GTK_ASSISTANT_PAGE_CONFIRM")
      case GTK_ASSISTANT_PAGE_SUMMARY => Some("GTK_ASSISTANT_PAGE_SUMMARY")
      case GTK_ASSISTANT_PAGE_PROGRESS => Some("GTK_ASSISTANT_PAGE_PROGRESS")
      case GTK_ASSISTANT_PAGE_CUSTOM => Some("GTK_ASSISTANT_PAGE_CUSTOM")
      case _ => None
  extension (a: GtkAssistantPageType)
    inline def &(b: GtkAssistantPageType): GtkAssistantPageType = a & b
    inline def |(b: GtkAssistantPageType): GtkAssistantPageType = a | b
    inline def is(b: GtkAssistantPageType): Boolean = (a & b) == b

/**
 * GtkBaselinePosition: _BASELINE_POSITION_TOP: Align the baseline at the top _BASELINE_POSITION_CENTER: Center the baseline _BASELINE_POSITION_BOTTOM: Align the baseline at the bottom
*/
opaque type GtkBaselinePosition = CUnsignedInt
object GtkBaselinePosition extends CEnumU[GtkBaselinePosition]:
  given _tag: Tag[GtkBaselinePosition] = Tag.UInt
  inline def define(inline a: Long): GtkBaselinePosition = a.toUInt
  val GTK_BASELINE_POSITION_TOP = define(0)
  val GTK_BASELINE_POSITION_CENTER = define(1)
  val GTK_BASELINE_POSITION_BOTTOM = define(2)
  inline def getName(inline value: GtkBaselinePosition): Option[String] =
    inline value match
      case GTK_BASELINE_POSITION_TOP => Some("GTK_BASELINE_POSITION_TOP")
      case GTK_BASELINE_POSITION_CENTER => Some("GTK_BASELINE_POSITION_CENTER")
      case GTK_BASELINE_POSITION_BOTTOM => Some("GTK_BASELINE_POSITION_BOTTOM")
      case _ => None
  extension (a: GtkBaselinePosition)
    inline def &(b: GtkBaselinePosition): GtkBaselinePosition = a & b
    inline def |(b: GtkBaselinePosition): GtkBaselinePosition = a | b
    inline def is(b: GtkBaselinePosition): Boolean = (a & b) == b

/**
 * GtkBorderStyle: _BORDER_STYLE_NONE: No visible border _BORDER_STYLE_HIDDEN: Same as %GTK_BORDER_STYLE_NONE _BORDER_STYLE_SOLID: A single line segment _BORDER_STYLE_INSET: Looks as if the content is sunken into the canvas _BORDER_STYLE_OUTSET: Looks as if the content is coming out of the canvas _BORDER_STYLE_DOTTED: A series of round dots _BORDER_STYLE_DASHED: A series of square-ended dashes _BORDER_STYLE_DOUBLE: Two parallel lines with some space between them _BORDER_STYLE_GROOVE: Looks as if it were carved in the canvas _BORDER_STYLE_RIDGE: Looks as if it were coming out of the canvas
*/
opaque type GtkBorderStyle = CUnsignedInt
object GtkBorderStyle extends CEnumU[GtkBorderStyle]:
  given _tag: Tag[GtkBorderStyle] = Tag.UInt
  inline def define(inline a: Long): GtkBorderStyle = a.toUInt
  val GTK_BORDER_STYLE_NONE = define(0)
  val GTK_BORDER_STYLE_HIDDEN = define(1)
  val GTK_BORDER_STYLE_SOLID = define(2)
  val GTK_BORDER_STYLE_INSET = define(3)
  val GTK_BORDER_STYLE_OUTSET = define(4)
  val GTK_BORDER_STYLE_DOTTED = define(5)
  val GTK_BORDER_STYLE_DASHED = define(6)
  val GTK_BORDER_STYLE_DOUBLE = define(7)
  val GTK_BORDER_STYLE_GROOVE = define(8)
  val GTK_BORDER_STYLE_RIDGE = define(9)
  inline def getName(inline value: GtkBorderStyle): Option[String] =
    inline value match
      case GTK_BORDER_STYLE_NONE => Some("GTK_BORDER_STYLE_NONE")
      case GTK_BORDER_STYLE_HIDDEN => Some("GTK_BORDER_STYLE_HIDDEN")
      case GTK_BORDER_STYLE_SOLID => Some("GTK_BORDER_STYLE_SOLID")
      case GTK_BORDER_STYLE_INSET => Some("GTK_BORDER_STYLE_INSET")
      case GTK_BORDER_STYLE_OUTSET => Some("GTK_BORDER_STYLE_OUTSET")
      case GTK_BORDER_STYLE_DOTTED => Some("GTK_BORDER_STYLE_DOTTED")
      case GTK_BORDER_STYLE_DASHED => Some("GTK_BORDER_STYLE_DASHED")
      case GTK_BORDER_STYLE_DOUBLE => Some("GTK_BORDER_STYLE_DOUBLE")
      case GTK_BORDER_STYLE_GROOVE => Some("GTK_BORDER_STYLE_GROOVE")
      case GTK_BORDER_STYLE_RIDGE => Some("GTK_BORDER_STYLE_RIDGE")
      case _ => None
  extension (a: GtkBorderStyle)
    inline def &(b: GtkBorderStyle): GtkBorderStyle = a & b
    inline def |(b: GtkBorderStyle): GtkBorderStyle = a | b
    inline def is(b: GtkBorderStyle): Boolean = (a & b) == b

/**
 * GtkBuilderClosureFlags: _BUILDER_CLOSURE_SWAPPED: The closure should be created swapped. See g_cclosure_new_swap() for details.
*/
opaque type GtkBuilderClosureFlags = CUnsignedInt
object GtkBuilderClosureFlags extends CEnumU[GtkBuilderClosureFlags]:
  given _tag: Tag[GtkBuilderClosureFlags] = Tag.UInt
  inline def define(inline a: Long): GtkBuilderClosureFlags = a.toUInt
  val GTK_BUILDER_CLOSURE_SWAPPED = define(1)
  inline def getName(inline value: GtkBuilderClosureFlags): Option[String] =
    inline value match
      case GTK_BUILDER_CLOSURE_SWAPPED => Some("GTK_BUILDER_CLOSURE_SWAPPED")
      case _ => None
  extension (a: GtkBuilderClosureFlags)
    inline def &(b: GtkBuilderClosureFlags): GtkBuilderClosureFlags = a & b
    inline def |(b: GtkBuilderClosureFlags): GtkBuilderClosureFlags = a | b
    inline def is(b: GtkBuilderClosureFlags): Boolean = (a & b) == b

/**
 * GtkBuilderError: _BUILDER_ERROR_INVALID_TYPE_FUNCTION: A type-func attribute didn’t name a function that returns a `GType`. _BUILDER_ERROR_UNHANDLED_TAG: The input contained a tag that `GtkBuilder` can’t handle. _BUILDER_ERROR_MISSING_ATTRIBUTE: An attribute that is required by `GtkBuilder` was missing. _BUILDER_ERROR_INVALID_ATTRIBUTE: `GtkBuilder` found an attribute that it doesn’t understand. _BUILDER_ERROR_INVALID_TAG: `GtkBuilder` found a tag that it doesn’t understand. _BUILDER_ERROR_MISSING_PROPERTY_VALUE: A required property value was missing. _BUILDER_ERROR_INVALID_VALUE: `GtkBuilder` couldn’t parse some attribute value. _BUILDER_ERROR_VERSION_MISMATCH: The input file requires a newer version of GTK. _BUILDER_ERROR_DUPLICATE_ID: An object id occurred twice. _BUILDER_ERROR_OBJECT_TYPE_REFUSED: A specified object type is of the same type or derived from the type of the composite class being extended with builder XML. _BUILDER_ERROR_TEMPLATE_MISMATCH: The wrong type was specified in a composite class’s template XML _BUILDER_ERROR_INVALID_PROPERTY: The specified property is unknown for the object class. _BUILDER_ERROR_INVALID_SIGNAL: The specified signal is unknown for the object class. _BUILDER_ERROR_INVALID_ID: An object id is unknown. _BUILDER_ERROR_INVALID_FUNCTION: A function could not be found. This often happens when symbols are set to be kept private. Compiling code with -rdynamic or using the `gmodule-export-2.0` pkgconfig module can fix this problem.
*/
opaque type GtkBuilderError = CUnsignedInt
object GtkBuilderError extends CEnumU[GtkBuilderError]:
  given _tag: Tag[GtkBuilderError] = Tag.UInt
  inline def define(inline a: Long): GtkBuilderError = a.toUInt
  val GTK_BUILDER_ERROR_INVALID_TYPE_FUNCTION = define(0)
  val GTK_BUILDER_ERROR_UNHANDLED_TAG = define(1)
  val GTK_BUILDER_ERROR_MISSING_ATTRIBUTE = define(2)
  val GTK_BUILDER_ERROR_INVALID_ATTRIBUTE = define(3)
  val GTK_BUILDER_ERROR_INVALID_TAG = define(4)
  val GTK_BUILDER_ERROR_MISSING_PROPERTY_VALUE = define(5)
  val GTK_BUILDER_ERROR_INVALID_VALUE = define(6)
  val GTK_BUILDER_ERROR_VERSION_MISMATCH = define(7)
  val GTK_BUILDER_ERROR_DUPLICATE_ID = define(8)
  val GTK_BUILDER_ERROR_OBJECT_TYPE_REFUSED = define(9)
  val GTK_BUILDER_ERROR_TEMPLATE_MISMATCH = define(10)
  val GTK_BUILDER_ERROR_INVALID_PROPERTY = define(11)
  val GTK_BUILDER_ERROR_INVALID_SIGNAL = define(12)
  val GTK_BUILDER_ERROR_INVALID_ID = define(13)
  val GTK_BUILDER_ERROR_INVALID_FUNCTION = define(14)
  inline def getName(inline value: GtkBuilderError): Option[String] =
    inline value match
      case GTK_BUILDER_ERROR_INVALID_TYPE_FUNCTION => Some("GTK_BUILDER_ERROR_INVALID_TYPE_FUNCTION")
      case GTK_BUILDER_ERROR_UNHANDLED_TAG => Some("GTK_BUILDER_ERROR_UNHANDLED_TAG")
      case GTK_BUILDER_ERROR_MISSING_ATTRIBUTE => Some("GTK_BUILDER_ERROR_MISSING_ATTRIBUTE")
      case GTK_BUILDER_ERROR_INVALID_ATTRIBUTE => Some("GTK_BUILDER_ERROR_INVALID_ATTRIBUTE")
      case GTK_BUILDER_ERROR_INVALID_TAG => Some("GTK_BUILDER_ERROR_INVALID_TAG")
      case GTK_BUILDER_ERROR_MISSING_PROPERTY_VALUE => Some("GTK_BUILDER_ERROR_MISSING_PROPERTY_VALUE")
      case GTK_BUILDER_ERROR_INVALID_VALUE => Some("GTK_BUILDER_ERROR_INVALID_VALUE")
      case GTK_BUILDER_ERROR_VERSION_MISMATCH => Some("GTK_BUILDER_ERROR_VERSION_MISMATCH")
      case GTK_BUILDER_ERROR_DUPLICATE_ID => Some("GTK_BUILDER_ERROR_DUPLICATE_ID")
      case GTK_BUILDER_ERROR_OBJECT_TYPE_REFUSED => Some("GTK_BUILDER_ERROR_OBJECT_TYPE_REFUSED")
      case GTK_BUILDER_ERROR_TEMPLATE_MISMATCH => Some("GTK_BUILDER_ERROR_TEMPLATE_MISMATCH")
      case GTK_BUILDER_ERROR_INVALID_PROPERTY => Some("GTK_BUILDER_ERROR_INVALID_PROPERTY")
      case GTK_BUILDER_ERROR_INVALID_SIGNAL => Some("GTK_BUILDER_ERROR_INVALID_SIGNAL")
      case GTK_BUILDER_ERROR_INVALID_ID => Some("GTK_BUILDER_ERROR_INVALID_ID")
      case GTK_BUILDER_ERROR_INVALID_FUNCTION => Some("GTK_BUILDER_ERROR_INVALID_FUNCTION")
      case _ => None
  extension (a: GtkBuilderError)
    inline def &(b: GtkBuilderError): GtkBuilderError = a & b
    inline def |(b: GtkBuilderError): GtkBuilderError = a | b
    inline def is(b: GtkBuilderError): Boolean = (a & b) == b

/**
 * GtkButtonsType: _BUTTONS_NONE: no buttons at all _BUTTONS_OK: an OK button _BUTTONS_CLOSE: a Close button _BUTTONS_CANCEL: a Cancel button _BUTTONS_YES_NO: Yes and No buttons _BUTTONS_OK_CANCEL: OK and Cancel buttons
*/
opaque type GtkButtonsType = CUnsignedInt
object GtkButtonsType extends CEnumU[GtkButtonsType]:
  given _tag: Tag[GtkButtonsType] = Tag.UInt
  inline def define(inline a: Long): GtkButtonsType = a.toUInt
  val GTK_BUTTONS_NONE = define(0)
  val GTK_BUTTONS_OK = define(1)
  val GTK_BUTTONS_CLOSE = define(2)
  val GTK_BUTTONS_CANCEL = define(3)
  val GTK_BUTTONS_YES_NO = define(4)
  val GTK_BUTTONS_OK_CANCEL = define(5)
  inline def getName(inline value: GtkButtonsType): Option[String] =
    inline value match
      case GTK_BUTTONS_NONE => Some("GTK_BUTTONS_NONE")
      case GTK_BUTTONS_OK => Some("GTK_BUTTONS_OK")
      case GTK_BUTTONS_CLOSE => Some("GTK_BUTTONS_CLOSE")
      case GTK_BUTTONS_CANCEL => Some("GTK_BUTTONS_CANCEL")
      case GTK_BUTTONS_YES_NO => Some("GTK_BUTTONS_YES_NO")
      case GTK_BUTTONS_OK_CANCEL => Some("GTK_BUTTONS_OK_CANCEL")
      case _ => None
  extension (a: GtkButtonsType)
    inline def &(b: GtkButtonsType): GtkButtonsType = a & b
    inline def |(b: GtkButtonsType): GtkButtonsType = a | b
    inline def is(b: GtkButtonsType): Boolean = (a & b) == b

/**
 * GtkCellRendererAccelMode: _CELL_RENDERER_ACCEL_MODE_GTK: GTK accelerators mode _CELL_RENDERER_ACCEL_MODE_OTHER: Other accelerator mode
*/
opaque type GtkCellRendererAccelMode = CUnsignedInt
object GtkCellRendererAccelMode extends CEnumU[GtkCellRendererAccelMode]:
  given _tag: Tag[GtkCellRendererAccelMode] = Tag.UInt
  inline def define(inline a: Long): GtkCellRendererAccelMode = a.toUInt
  val GTK_CELL_RENDERER_ACCEL_MODE_GTK = define(0)
  val GTK_CELL_RENDERER_ACCEL_MODE_OTHER = define(1)
  inline def getName(inline value: GtkCellRendererAccelMode): Option[String] =
    inline value match
      case GTK_CELL_RENDERER_ACCEL_MODE_GTK => Some("GTK_CELL_RENDERER_ACCEL_MODE_GTK")
      case GTK_CELL_RENDERER_ACCEL_MODE_OTHER => Some("GTK_CELL_RENDERER_ACCEL_MODE_OTHER")
      case _ => None
  extension (a: GtkCellRendererAccelMode)
    inline def &(b: GtkCellRendererAccelMode): GtkCellRendererAccelMode = a & b
    inline def |(b: GtkCellRendererAccelMode): GtkCellRendererAccelMode = a | b
    inline def is(b: GtkCellRendererAccelMode): Boolean = (a & b) == b

/**
 * GtkCellRendererMode: _CELL_RENDERER_MODE_INERT: The cell is just for display and cannot be interacted with. Note that this doesn’t mean that eg. the row being drawn can’t be selected -- just that a particular element of it cannot be individually modified. _CELL_RENDERER_MODE_ACTIVATABLE: The cell can be clicked. _CELL_RENDERER_MODE_EDITABLE: The cell can be edited or otherwise modified.
*/
opaque type GtkCellRendererMode = CUnsignedInt
object GtkCellRendererMode extends CEnumU[GtkCellRendererMode]:
  given _tag: Tag[GtkCellRendererMode] = Tag.UInt
  inline def define(inline a: Long): GtkCellRendererMode = a.toUInt
  val GTK_CELL_RENDERER_MODE_INERT = define(0)
  val GTK_CELL_RENDERER_MODE_ACTIVATABLE = define(1)
  val GTK_CELL_RENDERER_MODE_EDITABLE = define(2)
  inline def getName(inline value: GtkCellRendererMode): Option[String] =
    inline value match
      case GTK_CELL_RENDERER_MODE_INERT => Some("GTK_CELL_RENDERER_MODE_INERT")
      case GTK_CELL_RENDERER_MODE_ACTIVATABLE => Some("GTK_CELL_RENDERER_MODE_ACTIVATABLE")
      case GTK_CELL_RENDERER_MODE_EDITABLE => Some("GTK_CELL_RENDERER_MODE_EDITABLE")
      case _ => None
  extension (a: GtkCellRendererMode)
    inline def &(b: GtkCellRendererMode): GtkCellRendererMode = a & b
    inline def |(b: GtkCellRendererMode): GtkCellRendererMode = a | b
    inline def is(b: GtkCellRendererMode): Boolean = (a & b) == b

/**
 * GtkCellRendererState: _CELL_RENDERER_SELECTED: The cell is currently selected, and probably has a selection colored background to render to. _CELL_RENDERER_PRELIT: The mouse is hovering over the cell. _CELL_RENDERER_INSENSITIVE: The cell is drawn in an insensitive manner _CELL_RENDERER_SORTED: The cell is in a sorted row _CELL_RENDERER_FOCUSED: The cell is in the focus row. _CELL_RENDERER_EXPANDABLE: The cell is in a row that can be expanded _CELL_RENDERER_EXPANDED: The cell is in a row that is expanded
*/
opaque type GtkCellRendererState = CUnsignedInt
object GtkCellRendererState extends CEnumU[GtkCellRendererState]:
  given _tag: Tag[GtkCellRendererState] = Tag.UInt
  inline def define(inline a: Long): GtkCellRendererState = a.toUInt
  val GTK_CELL_RENDERER_SELECTED = define(1)
  val GTK_CELL_RENDERER_PRELIT = define(2)
  val GTK_CELL_RENDERER_INSENSITIVE = define(4)
  val GTK_CELL_RENDERER_SORTED = define(8)
  val GTK_CELL_RENDERER_FOCUSED = define(16)
  val GTK_CELL_RENDERER_EXPANDABLE = define(32)
  val GTK_CELL_RENDERER_EXPANDED = define(64)
  inline def getName(inline value: GtkCellRendererState): Option[String] =
    inline value match
      case GTK_CELL_RENDERER_SELECTED => Some("GTK_CELL_RENDERER_SELECTED")
      case GTK_CELL_RENDERER_PRELIT => Some("GTK_CELL_RENDERER_PRELIT")
      case GTK_CELL_RENDERER_INSENSITIVE => Some("GTK_CELL_RENDERER_INSENSITIVE")
      case GTK_CELL_RENDERER_SORTED => Some("GTK_CELL_RENDERER_SORTED")
      case GTK_CELL_RENDERER_FOCUSED => Some("GTK_CELL_RENDERER_FOCUSED")
      case GTK_CELL_RENDERER_EXPANDABLE => Some("GTK_CELL_RENDERER_EXPANDABLE")
      case GTK_CELL_RENDERER_EXPANDED => Some("GTK_CELL_RENDERER_EXPANDED")
      case _ => None
  extension (a: GtkCellRendererState)
    inline def &(b: GtkCellRendererState): GtkCellRendererState = a & b
    inline def |(b: GtkCellRendererState): GtkCellRendererState = a | b
    inline def is(b: GtkCellRendererState): Boolean = (a & b) == b

/**
 * GtkConstraintAttribute: _CONSTRAINT_ATTRIBUTE_NONE: No attribute, used for constant relations _CONSTRAINT_ATTRIBUTE_LEFT: The left edge of a widget, regardless of text direction _CONSTRAINT_ATTRIBUTE_RIGHT: The right edge of a widget, regardless of text direction _CONSTRAINT_ATTRIBUTE_TOP: The top edge of a widget _CONSTRAINT_ATTRIBUTE_BOTTOM: The bottom edge of a widget _CONSTRAINT_ATTRIBUTE_START: The leading edge of a widget, depending on text direction; equivalent to %GTK_CONSTRAINT_ATTRIBUTE_LEFT for LTR languages, and %GTK_CONSTRAINT_ATTRIBUTE_RIGHT for RTL ones _CONSTRAINT_ATTRIBUTE_END: The trailing edge of a widget, depending on text direction; equivalent to %GTK_CONSTRAINT_ATTRIBUTE_RIGHT for LTR languages, and %GTK_CONSTRAINT_ATTRIBUTE_LEFT for RTL ones _CONSTRAINT_ATTRIBUTE_WIDTH: The width of a widget _CONSTRAINT_ATTRIBUTE_HEIGHT: The height of a widget _CONSTRAINT_ATTRIBUTE_CENTER_X: The center of a widget, on the horizontal axis _CONSTRAINT_ATTRIBUTE_CENTER_Y: The center of a widget, on the vertical axis _CONSTRAINT_ATTRIBUTE_BASELINE: The baseline of a widget
*/
opaque type GtkConstraintAttribute = CUnsignedInt
object GtkConstraintAttribute extends CEnumU[GtkConstraintAttribute]:
  given _tag: Tag[GtkConstraintAttribute] = Tag.UInt
  inline def define(inline a: Long): GtkConstraintAttribute = a.toUInt
  val GTK_CONSTRAINT_ATTRIBUTE_NONE = define(0)
  val GTK_CONSTRAINT_ATTRIBUTE_LEFT = define(1)
  val GTK_CONSTRAINT_ATTRIBUTE_RIGHT = define(2)
  val GTK_CONSTRAINT_ATTRIBUTE_TOP = define(3)
  val GTK_CONSTRAINT_ATTRIBUTE_BOTTOM = define(4)
  val GTK_CONSTRAINT_ATTRIBUTE_START = define(5)
  val GTK_CONSTRAINT_ATTRIBUTE_END = define(6)
  val GTK_CONSTRAINT_ATTRIBUTE_WIDTH = define(7)
  val GTK_CONSTRAINT_ATTRIBUTE_HEIGHT = define(8)
  val GTK_CONSTRAINT_ATTRIBUTE_CENTER_X = define(9)
  val GTK_CONSTRAINT_ATTRIBUTE_CENTER_Y = define(10)
  val GTK_CONSTRAINT_ATTRIBUTE_BASELINE = define(11)
  inline def getName(inline value: GtkConstraintAttribute): Option[String] =
    inline value match
      case GTK_CONSTRAINT_ATTRIBUTE_NONE => Some("GTK_CONSTRAINT_ATTRIBUTE_NONE")
      case GTK_CONSTRAINT_ATTRIBUTE_LEFT => Some("GTK_CONSTRAINT_ATTRIBUTE_LEFT")
      case GTK_CONSTRAINT_ATTRIBUTE_RIGHT => Some("GTK_CONSTRAINT_ATTRIBUTE_RIGHT")
      case GTK_CONSTRAINT_ATTRIBUTE_TOP => Some("GTK_CONSTRAINT_ATTRIBUTE_TOP")
      case GTK_CONSTRAINT_ATTRIBUTE_BOTTOM => Some("GTK_CONSTRAINT_ATTRIBUTE_BOTTOM")
      case GTK_CONSTRAINT_ATTRIBUTE_START => Some("GTK_CONSTRAINT_ATTRIBUTE_START")
      case GTK_CONSTRAINT_ATTRIBUTE_END => Some("GTK_CONSTRAINT_ATTRIBUTE_END")
      case GTK_CONSTRAINT_ATTRIBUTE_WIDTH => Some("GTK_CONSTRAINT_ATTRIBUTE_WIDTH")
      case GTK_CONSTRAINT_ATTRIBUTE_HEIGHT => Some("GTK_CONSTRAINT_ATTRIBUTE_HEIGHT")
      case GTK_CONSTRAINT_ATTRIBUTE_CENTER_X => Some("GTK_CONSTRAINT_ATTRIBUTE_CENTER_X")
      case GTK_CONSTRAINT_ATTRIBUTE_CENTER_Y => Some("GTK_CONSTRAINT_ATTRIBUTE_CENTER_Y")
      case GTK_CONSTRAINT_ATTRIBUTE_BASELINE => Some("GTK_CONSTRAINT_ATTRIBUTE_BASELINE")
      case _ => None
  extension (a: GtkConstraintAttribute)
    inline def &(b: GtkConstraintAttribute): GtkConstraintAttribute = a & b
    inline def |(b: GtkConstraintAttribute): GtkConstraintAttribute = a | b
    inline def is(b: GtkConstraintAttribute): Boolean = (a & b) == b

/**
 * GtkConstraintRelation: _CONSTRAINT_RELATION_EQ: Equal _CONSTRAINT_RELATION_LE: Less than, or equal _CONSTRAINT_RELATION_GE: Greater than, or equal
*/
opaque type GtkConstraintRelation = CInt
object GtkConstraintRelation extends CEnum[GtkConstraintRelation]:
  given _tag: Tag[GtkConstraintRelation] = Tag.Int
  inline def define(inline a: CInt): GtkConstraintRelation = a
  val GTK_CONSTRAINT_RELATION_LE = define(-1)
  val GTK_CONSTRAINT_RELATION_EQ = define(0)
  val GTK_CONSTRAINT_RELATION_GE = define(1)
  inline def getName(inline value: GtkConstraintRelation): Option[String] =
    inline value match
      case GTK_CONSTRAINT_RELATION_LE => Some("GTK_CONSTRAINT_RELATION_LE")
      case GTK_CONSTRAINT_RELATION_EQ => Some("GTK_CONSTRAINT_RELATION_EQ")
      case GTK_CONSTRAINT_RELATION_GE => Some("GTK_CONSTRAINT_RELATION_GE")
      case _ => None
  extension (a: GtkConstraintRelation)
    inline def &(b: GtkConstraintRelation): GtkConstraintRelation = a & b
    inline def |(b: GtkConstraintRelation): GtkConstraintRelation = a | b
    inline def is(b: GtkConstraintRelation): Boolean = (a & b) == b

/**
 * GtkConstraintStrength: _CONSTRAINT_STRENGTH_REQUIRED: The constraint is required towards solving the layout _CONSTRAINT_STRENGTH_STRONG: A strong constraint _CONSTRAINT_STRENGTH_MEDIUM: A medium constraint _CONSTRAINT_STRENGTH_WEAK: A weak constraint
*/
opaque type GtkConstraintStrength = CUnsignedInt
object GtkConstraintStrength extends CEnumU[GtkConstraintStrength]:
  given _tag: Tag[GtkConstraintStrength] = Tag.UInt
  inline def define(inline a: Long): GtkConstraintStrength = a.toUInt
  val GTK_CONSTRAINT_STRENGTH_REQUIRED = define(1001001000)
  val GTK_CONSTRAINT_STRENGTH_STRONG = define(1000000000)
  val GTK_CONSTRAINT_STRENGTH_MEDIUM = define(1000)
  val GTK_CONSTRAINT_STRENGTH_WEAK = define(1)
  inline def getName(inline value: GtkConstraintStrength): Option[String] =
    inline value match
      case GTK_CONSTRAINT_STRENGTH_REQUIRED => Some("GTK_CONSTRAINT_STRENGTH_REQUIRED")
      case GTK_CONSTRAINT_STRENGTH_STRONG => Some("GTK_CONSTRAINT_STRENGTH_STRONG")
      case GTK_CONSTRAINT_STRENGTH_MEDIUM => Some("GTK_CONSTRAINT_STRENGTH_MEDIUM")
      case GTK_CONSTRAINT_STRENGTH_WEAK => Some("GTK_CONSTRAINT_STRENGTH_WEAK")
      case _ => None
  extension (a: GtkConstraintStrength)
    inline def &(b: GtkConstraintStrength): GtkConstraintStrength = a & b
    inline def |(b: GtkConstraintStrength): GtkConstraintStrength = a | b
    inline def is(b: GtkConstraintStrength): Boolean = (a & b) == b

/**
 * GtkConstraintVflParserError: _CONSTRAINT_VFL_PARSER_ERROR_INVALID_SYMBOL: Invalid or unknown symbol _CONSTRAINT_VFL_PARSER_ERROR_INVALID_ATTRIBUTE: Invalid or unknown attribute _CONSTRAINT_VFL_PARSER_ERROR_INVALID_VIEW: Invalid or unknown view _CONSTRAINT_VFL_PARSER_ERROR_INVALID_METRIC: Invalid or unknown metric _CONSTRAINT_VFL_PARSER_ERROR_INVALID_PRIORITY: Invalid or unknown priority _CONSTRAINT_VFL_PARSER_ERROR_INVALID_RELATION: Invalid or unknown relation
*/
opaque type GtkConstraintVflParserError = CUnsignedInt
object GtkConstraintVflParserError extends CEnumU[GtkConstraintVflParserError]:
  given _tag: Tag[GtkConstraintVflParserError] = Tag.UInt
  inline def define(inline a: Long): GtkConstraintVflParserError = a.toUInt
  val GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_SYMBOL = define(0)
  val GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_ATTRIBUTE = define(1)
  val GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_VIEW = define(2)
  val GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_METRIC = define(3)
  val GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_PRIORITY = define(4)
  val GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_RELATION = define(5)
  inline def getName(inline value: GtkConstraintVflParserError): Option[String] =
    inline value match
      case GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_SYMBOL => Some("GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_SYMBOL")
      case GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_ATTRIBUTE => Some("GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_ATTRIBUTE")
      case GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_VIEW => Some("GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_VIEW")
      case GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_METRIC => Some("GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_METRIC")
      case GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_PRIORITY => Some("GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_PRIORITY")
      case GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_RELATION => Some("GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_RELATION")
      case _ => None
  extension (a: GtkConstraintVflParserError)
    inline def &(b: GtkConstraintVflParserError): GtkConstraintVflParserError = a & b
    inline def |(b: GtkConstraintVflParserError): GtkConstraintVflParserError = a | b
    inline def is(b: GtkConstraintVflParserError): Boolean = (a & b) == b

/**
 * GtkCornerType: _CORNER_TOP_LEFT: Place the scrollbars on the right and bottom of the widget (default behaviour). _CORNER_BOTTOM_LEFT: Place the scrollbars on the top and right of the widget. _CORNER_TOP_RIGHT: Place the scrollbars on the left and bottom of the widget. _CORNER_BOTTOM_RIGHT: Place the scrollbars on the top and left of the widget.
*/
opaque type GtkCornerType = CUnsignedInt
object GtkCornerType extends CEnumU[GtkCornerType]:
  given _tag: Tag[GtkCornerType] = Tag.UInt
  inline def define(inline a: Long): GtkCornerType = a.toUInt
  val GTK_CORNER_TOP_LEFT = define(0)
  val GTK_CORNER_BOTTOM_LEFT = define(1)
  val GTK_CORNER_TOP_RIGHT = define(2)
  val GTK_CORNER_BOTTOM_RIGHT = define(3)
  inline def getName(inline value: GtkCornerType): Option[String] =
    inline value match
      case GTK_CORNER_TOP_LEFT => Some("GTK_CORNER_TOP_LEFT")
      case GTK_CORNER_BOTTOM_LEFT => Some("GTK_CORNER_BOTTOM_LEFT")
      case GTK_CORNER_TOP_RIGHT => Some("GTK_CORNER_TOP_RIGHT")
      case GTK_CORNER_BOTTOM_RIGHT => Some("GTK_CORNER_BOTTOM_RIGHT")
      case _ => None
  extension (a: GtkCornerType)
    inline def &(b: GtkCornerType): GtkCornerType = a & b
    inline def |(b: GtkCornerType): GtkCornerType = a | b
    inline def is(b: GtkCornerType): Boolean = (a & b) == b

/**
 * GtkCssParserError: _CSS_PARSER_ERROR_FAILED: Unknown failure. _CSS_PARSER_ERROR_SYNTAX: The given text does not form valid syntax _CSS_PARSER_ERROR_IMPORT: Failed to import a resource _CSS_PARSER_ERROR_NAME: The given name has not been defined _CSS_PARSER_ERROR_UNKNOWN_VALUE: The given value is not correct
*/
opaque type GtkCssParserError = CUnsignedInt
object GtkCssParserError extends CEnumU[GtkCssParserError]:
  given _tag: Tag[GtkCssParserError] = Tag.UInt
  inline def define(inline a: Long): GtkCssParserError = a.toUInt
  val GTK_CSS_PARSER_ERROR_FAILED = define(0)
  val GTK_CSS_PARSER_ERROR_SYNTAX = define(1)
  val GTK_CSS_PARSER_ERROR_IMPORT = define(2)
  val GTK_CSS_PARSER_ERROR_NAME = define(3)
  val GTK_CSS_PARSER_ERROR_UNKNOWN_VALUE = define(4)
  inline def getName(inline value: GtkCssParserError): Option[String] =
    inline value match
      case GTK_CSS_PARSER_ERROR_FAILED => Some("GTK_CSS_PARSER_ERROR_FAILED")
      case GTK_CSS_PARSER_ERROR_SYNTAX => Some("GTK_CSS_PARSER_ERROR_SYNTAX")
      case GTK_CSS_PARSER_ERROR_IMPORT => Some("GTK_CSS_PARSER_ERROR_IMPORT")
      case GTK_CSS_PARSER_ERROR_NAME => Some("GTK_CSS_PARSER_ERROR_NAME")
      case GTK_CSS_PARSER_ERROR_UNKNOWN_VALUE => Some("GTK_CSS_PARSER_ERROR_UNKNOWN_VALUE")
      case _ => None
  extension (a: GtkCssParserError)
    inline def &(b: GtkCssParserError): GtkCssParserError = a & b
    inline def |(b: GtkCssParserError): GtkCssParserError = a | b
    inline def is(b: GtkCssParserError): Boolean = (a & b) == b

/**
 * GtkCssParserWarning: _CSS_PARSER_WARNING_DEPRECATED: The given construct is deprecated and will be removed in a future version _CSS_PARSER_WARNING_SYNTAX: A syntax construct was used that should be avoided _CSS_PARSER_WARNING_UNIMPLEMENTED: A feature is not implemented
*/
opaque type GtkCssParserWarning = CUnsignedInt
object GtkCssParserWarning extends CEnumU[GtkCssParserWarning]:
  given _tag: Tag[GtkCssParserWarning] = Tag.UInt
  inline def define(inline a: Long): GtkCssParserWarning = a.toUInt
  val GTK_CSS_PARSER_WARNING_DEPRECATED = define(0)
  val GTK_CSS_PARSER_WARNING_SYNTAX = define(1)
  val GTK_CSS_PARSER_WARNING_UNIMPLEMENTED = define(2)
  inline def getName(inline value: GtkCssParserWarning): Option[String] =
    inline value match
      case GTK_CSS_PARSER_WARNING_DEPRECATED => Some("GTK_CSS_PARSER_WARNING_DEPRECATED")
      case GTK_CSS_PARSER_WARNING_SYNTAX => Some("GTK_CSS_PARSER_WARNING_SYNTAX")
      case GTK_CSS_PARSER_WARNING_UNIMPLEMENTED => Some("GTK_CSS_PARSER_WARNING_UNIMPLEMENTED")
      case _ => None
  extension (a: GtkCssParserWarning)
    inline def &(b: GtkCssParserWarning): GtkCssParserWarning = a & b
    inline def |(b: GtkCssParserWarning): GtkCssParserWarning = a | b
    inline def is(b: GtkCssParserWarning): Boolean = (a & b) == b

/**
 * GtkDebugFlags: _DEBUG_TEXT: Information about GtkTextView _DEBUG_TREE: Information about GtkTreeView _DEBUG_KEYBINDINGS: Information about keyboard shortcuts _DEBUG_MODULES: Information about modules and extensions _DEBUG_GEOMETRY: Information about size allocation _DEBUG_ICONTHEME: Information about icon themes _DEBUG_PRINTING: Information about printing _DEBUG_BUILDER: Trace GtkBuilder operation _DEBUG_SIZE_REQUEST: Information about size requests _DEBUG_NO_CSS_CACHE: Disable the style property cache _DEBUG_INTERACTIVE: Open the GTK inspector _DEBUG_TOUCHSCREEN: Pretend the pointer is a touchscreen _DEBUG_ACTIONS: Information about actions and menu models _DEBUG_LAYOUT: Information from layout managers _DEBUG_SNAPSHOT: Include debug render nodes in the generated snapshots _DEBUG_CONSTRAINTS: Information from the constraints solver _DEBUG_BUILDER_OBJECTS: Log unused GtkBuilder objects _DEBUG_A11Y: Information about accessibility state changes _DEBUG_ICONFALLBACK: Information about icon fallback. Since: 4.2
*/
opaque type GtkDebugFlags = CUnsignedInt
object GtkDebugFlags extends CEnumU[GtkDebugFlags]:
  given _tag: Tag[GtkDebugFlags] = Tag.UInt
  inline def define(inline a: Long): GtkDebugFlags = a.toUInt
  val GTK_DEBUG_TEXT = define(1)
  val GTK_DEBUG_TREE = define(2)
  val GTK_DEBUG_KEYBINDINGS = define(4)
  val GTK_DEBUG_MODULES = define(8)
  val GTK_DEBUG_GEOMETRY = define(16)
  val GTK_DEBUG_ICONTHEME = define(32)
  val GTK_DEBUG_PRINTING = define(64)
  val GTK_DEBUG_BUILDER = define(128)
  val GTK_DEBUG_SIZE_REQUEST = define(256)
  val GTK_DEBUG_NO_CSS_CACHE = define(512)
  val GTK_DEBUG_INTERACTIVE = define(1024)
  val GTK_DEBUG_TOUCHSCREEN = define(2048)
  val GTK_DEBUG_ACTIONS = define(4096)
  val GTK_DEBUG_LAYOUT = define(8192)
  val GTK_DEBUG_SNAPSHOT = define(16384)
  val GTK_DEBUG_CONSTRAINTS = define(32768)
  val GTK_DEBUG_BUILDER_OBJECTS = define(65536)
  val GTK_DEBUG_A11Y = define(131072)
  val GTK_DEBUG_ICONFALLBACK = define(262144)
  inline def getName(inline value: GtkDebugFlags): Option[String] =
    inline value match
      case GTK_DEBUG_TEXT => Some("GTK_DEBUG_TEXT")
      case GTK_DEBUG_TREE => Some("GTK_DEBUG_TREE")
      case GTK_DEBUG_KEYBINDINGS => Some("GTK_DEBUG_KEYBINDINGS")
      case GTK_DEBUG_MODULES => Some("GTK_DEBUG_MODULES")
      case GTK_DEBUG_GEOMETRY => Some("GTK_DEBUG_GEOMETRY")
      case GTK_DEBUG_ICONTHEME => Some("GTK_DEBUG_ICONTHEME")
      case GTK_DEBUG_PRINTING => Some("GTK_DEBUG_PRINTING")
      case GTK_DEBUG_BUILDER => Some("GTK_DEBUG_BUILDER")
      case GTK_DEBUG_SIZE_REQUEST => Some("GTK_DEBUG_SIZE_REQUEST")
      case GTK_DEBUG_NO_CSS_CACHE => Some("GTK_DEBUG_NO_CSS_CACHE")
      case GTK_DEBUG_INTERACTIVE => Some("GTK_DEBUG_INTERACTIVE")
      case GTK_DEBUG_TOUCHSCREEN => Some("GTK_DEBUG_TOUCHSCREEN")
      case GTK_DEBUG_ACTIONS => Some("GTK_DEBUG_ACTIONS")
      case GTK_DEBUG_LAYOUT => Some("GTK_DEBUG_LAYOUT")
      case GTK_DEBUG_SNAPSHOT => Some("GTK_DEBUG_SNAPSHOT")
      case GTK_DEBUG_CONSTRAINTS => Some("GTK_DEBUG_CONSTRAINTS")
      case GTK_DEBUG_BUILDER_OBJECTS => Some("GTK_DEBUG_BUILDER_OBJECTS")
      case GTK_DEBUG_A11Y => Some("GTK_DEBUG_A11Y")
      case GTK_DEBUG_ICONFALLBACK => Some("GTK_DEBUG_ICONFALLBACK")
      case _ => None
  extension (a: GtkDebugFlags)
    inline def &(b: GtkDebugFlags): GtkDebugFlags = a & b
    inline def |(b: GtkDebugFlags): GtkDebugFlags = a | b
    inline def is(b: GtkDebugFlags): Boolean = (a & b) == b

/**
 * GtkDeleteType: _DELETE_CHARS: Delete characters. _DELETE_WORD_ENDS: Delete only the portion of the word to the left/right of cursor if we’re in the middle of a word. _DELETE_WORDS: Delete words. _DELETE_DISPLAY_LINES: Delete display-lines. Display-lines refers to the visible lines, with respect to the current line breaks. As opposed to paragraphs, which are defined by line breaks in the input. _DELETE_DISPLAY_LINE_ENDS: Delete only the portion of the display-line to the left/right of cursor. _DELETE_PARAGRAPH_ENDS: Delete to the end of the paragraph. Like C-k in Emacs (or its reverse). _DELETE_PARAGRAPHS: Delete entire line. Like C-k in pico. _DELETE_WHITESPACE: Delete only whitespace. Like M-\ in Emacs.
*/
opaque type GtkDeleteType = CUnsignedInt
object GtkDeleteType extends CEnumU[GtkDeleteType]:
  given _tag: Tag[GtkDeleteType] = Tag.UInt
  inline def define(inline a: Long): GtkDeleteType = a.toUInt
  val GTK_DELETE_CHARS = define(0)
  val GTK_DELETE_WORD_ENDS = define(1)
  val GTK_DELETE_WORDS = define(2)
  val GTK_DELETE_DISPLAY_LINES = define(3)
  val GTK_DELETE_DISPLAY_LINE_ENDS = define(4)
  val GTK_DELETE_PARAGRAPH_ENDS = define(5)
  val GTK_DELETE_PARAGRAPHS = define(6)
  val GTK_DELETE_WHITESPACE = define(7)
  inline def getName(inline value: GtkDeleteType): Option[String] =
    inline value match
      case GTK_DELETE_CHARS => Some("GTK_DELETE_CHARS")
      case GTK_DELETE_WORD_ENDS => Some("GTK_DELETE_WORD_ENDS")
      case GTK_DELETE_WORDS => Some("GTK_DELETE_WORDS")
      case GTK_DELETE_DISPLAY_LINES => Some("GTK_DELETE_DISPLAY_LINES")
      case GTK_DELETE_DISPLAY_LINE_ENDS => Some("GTK_DELETE_DISPLAY_LINE_ENDS")
      case GTK_DELETE_PARAGRAPH_ENDS => Some("GTK_DELETE_PARAGRAPH_ENDS")
      case GTK_DELETE_PARAGRAPHS => Some("GTK_DELETE_PARAGRAPHS")
      case GTK_DELETE_WHITESPACE => Some("GTK_DELETE_WHITESPACE")
      case _ => None
  extension (a: GtkDeleteType)
    inline def &(b: GtkDeleteType): GtkDeleteType = a & b
    inline def |(b: GtkDeleteType): GtkDeleteType = a | b
    inline def is(b: GtkDeleteType): Boolean = (a & b) == b

/**
 * GtkDialogFlags: _DIALOG_MODAL: Make the constructed dialog modal _DIALOG_DESTROY_WITH_PARENT: Destroy the dialog when its parent is destroyed _DIALOG_USE_HEADER_BAR: Create dialog with actions in header bar instead of action area
*/
opaque type GtkDialogFlags = CUnsignedInt
object GtkDialogFlags extends CEnumU[GtkDialogFlags]:
  given _tag: Tag[GtkDialogFlags] = Tag.UInt
  inline def define(inline a: Long): GtkDialogFlags = a.toUInt
  val GTK_DIALOG_MODAL = define(1)
  val GTK_DIALOG_DESTROY_WITH_PARENT = define(2)
  val GTK_DIALOG_USE_HEADER_BAR = define(4)
  inline def getName(inline value: GtkDialogFlags): Option[String] =
    inline value match
      case GTK_DIALOG_MODAL => Some("GTK_DIALOG_MODAL")
      case GTK_DIALOG_DESTROY_WITH_PARENT => Some("GTK_DIALOG_DESTROY_WITH_PARENT")
      case GTK_DIALOG_USE_HEADER_BAR => Some("GTK_DIALOG_USE_HEADER_BAR")
      case _ => None
  extension (a: GtkDialogFlags)
    inline def &(b: GtkDialogFlags): GtkDialogFlags = a & b
    inline def |(b: GtkDialogFlags): GtkDialogFlags = a | b
    inline def is(b: GtkDialogFlags): Boolean = (a & b) == b

/**
 * GtkDirectionType: _DIR_TAB_FORWARD: Move forward. _DIR_TAB_BACKWARD: Move backward. _DIR_UP: Move up. _DIR_DOWN: Move down. _DIR_LEFT: Move left. _DIR_RIGHT: Move right.
*/
opaque type GtkDirectionType = CUnsignedInt
object GtkDirectionType extends CEnumU[GtkDirectionType]:
  given _tag: Tag[GtkDirectionType] = Tag.UInt
  inline def define(inline a: Long): GtkDirectionType = a.toUInt
  val GTK_DIR_TAB_FORWARD = define(0)
  val GTK_DIR_TAB_BACKWARD = define(1)
  val GTK_DIR_UP = define(2)
  val GTK_DIR_DOWN = define(3)
  val GTK_DIR_LEFT = define(4)
  val GTK_DIR_RIGHT = define(5)
  inline def getName(inline value: GtkDirectionType): Option[String] =
    inline value match
      case GTK_DIR_TAB_FORWARD => Some("GTK_DIR_TAB_FORWARD")
      case GTK_DIR_TAB_BACKWARD => Some("GTK_DIR_TAB_BACKWARD")
      case GTK_DIR_UP => Some("GTK_DIR_UP")
      case GTK_DIR_DOWN => Some("GTK_DIR_DOWN")
      case GTK_DIR_LEFT => Some("GTK_DIR_LEFT")
      case GTK_DIR_RIGHT => Some("GTK_DIR_RIGHT")
      case _ => None
  extension (a: GtkDirectionType)
    inline def &(b: GtkDirectionType): GtkDirectionType = a & b
    inline def |(b: GtkDirectionType): GtkDirectionType = a | b
    inline def is(b: GtkDirectionType): Boolean = (a & b) == b

/**
 * GtkEditableProperties: _EDITABLE_PROP_TEXT: the property id for [property.Editable:text] _EDITABLE_PROP_CURSOR_POSITION: the property id for [property.Editable:cursor-position] _EDITABLE_PROP_SELECTION_BOUND: the property id for [property.Editable:selection-bound] _EDITABLE_PROP_EDITABLE: the property id for [property.Editable:editable] _EDITABLE_PROP_WIDTH_CHARS: the property id for [property.Editable:width-chars] _EDITABLE_PROP_MAX_WIDTH_CHARS: the property id for [property.Editable:max-width-chars] _EDITABLE_PROP_XALIGN: the property id for [property.Editable:xalign] _EDITABLE_PROP_ENABLE_UNDO: the property id for [property.Editable:enable-undo] _EDITABLE_NUM_PROPERTIES: the number of properties
*/
opaque type GtkEditableProperties = CUnsignedInt
object GtkEditableProperties extends CEnumU[GtkEditableProperties]:
  given _tag: Tag[GtkEditableProperties] = Tag.UInt
  inline def define(inline a: Long): GtkEditableProperties = a.toUInt
  val GTK_EDITABLE_PROP_TEXT = define(0)
  val GTK_EDITABLE_PROP_CURSOR_POSITION = define(1)
  val GTK_EDITABLE_PROP_SELECTION_BOUND = define(2)
  val GTK_EDITABLE_PROP_EDITABLE = define(3)
  val GTK_EDITABLE_PROP_WIDTH_CHARS = define(4)
  val GTK_EDITABLE_PROP_MAX_WIDTH_CHARS = define(5)
  val GTK_EDITABLE_PROP_XALIGN = define(6)
  val GTK_EDITABLE_PROP_ENABLE_UNDO = define(7)
  val GTK_EDITABLE_NUM_PROPERTIES = define(8)
  inline def getName(inline value: GtkEditableProperties): Option[String] =
    inline value match
      case GTK_EDITABLE_PROP_TEXT => Some("GTK_EDITABLE_PROP_TEXT")
      case GTK_EDITABLE_PROP_CURSOR_POSITION => Some("GTK_EDITABLE_PROP_CURSOR_POSITION")
      case GTK_EDITABLE_PROP_SELECTION_BOUND => Some("GTK_EDITABLE_PROP_SELECTION_BOUND")
      case GTK_EDITABLE_PROP_EDITABLE => Some("GTK_EDITABLE_PROP_EDITABLE")
      case GTK_EDITABLE_PROP_WIDTH_CHARS => Some("GTK_EDITABLE_PROP_WIDTH_CHARS")
      case GTK_EDITABLE_PROP_MAX_WIDTH_CHARS => Some("GTK_EDITABLE_PROP_MAX_WIDTH_CHARS")
      case GTK_EDITABLE_PROP_XALIGN => Some("GTK_EDITABLE_PROP_XALIGN")
      case GTK_EDITABLE_PROP_ENABLE_UNDO => Some("GTK_EDITABLE_PROP_ENABLE_UNDO")
      case GTK_EDITABLE_NUM_PROPERTIES => Some("GTK_EDITABLE_NUM_PROPERTIES")
      case _ => None
  extension (a: GtkEditableProperties)
    inline def &(b: GtkEditableProperties): GtkEditableProperties = a & b
    inline def |(b: GtkEditableProperties): GtkEditableProperties = a | b
    inline def is(b: GtkEditableProperties): Boolean = (a & b) == b

/**
 * GtkEntryIconPosition: _ENTRY_ICON_PRIMARY: At the beginning of the entry (depending on the text direction). _ENTRY_ICON_SECONDARY: At the end of the entry (depending on the text direction).
*/
opaque type GtkEntryIconPosition = CUnsignedInt
object GtkEntryIconPosition extends CEnumU[GtkEntryIconPosition]:
  given _tag: Tag[GtkEntryIconPosition] = Tag.UInt
  inline def define(inline a: Long): GtkEntryIconPosition = a.toUInt
  val GTK_ENTRY_ICON_PRIMARY = define(0)
  val GTK_ENTRY_ICON_SECONDARY = define(1)
  inline def getName(inline value: GtkEntryIconPosition): Option[String] =
    inline value match
      case GTK_ENTRY_ICON_PRIMARY => Some("GTK_ENTRY_ICON_PRIMARY")
      case GTK_ENTRY_ICON_SECONDARY => Some("GTK_ENTRY_ICON_SECONDARY")
      case _ => None
  extension (a: GtkEntryIconPosition)
    inline def &(b: GtkEntryIconPosition): GtkEntryIconPosition = a & b
    inline def |(b: GtkEntryIconPosition): GtkEntryIconPosition = a | b
    inline def is(b: GtkEntryIconPosition): Boolean = (a & b) == b

/**
 * GtkEventControllerScrollFlags: _EVENT_CONTROLLER_SCROLL_NONE: Don't emit scroll. _EVENT_CONTROLLER_SCROLL_VERTICAL: Emit scroll with vertical deltas. _EVENT_CONTROLLER_SCROLL_HORIZONTAL: Emit scroll with horizontal deltas. _EVENT_CONTROLLER_SCROLL_DISCRETE: Only emit deltas that are multiples of 1. _EVENT_CONTROLLER_SCROLL_KINETIC: Emit ::decelerate after continuous scroll finishes. _EVENT_CONTROLLER_SCROLL_BOTH_AXES: Emit scroll on both axes.
*/
opaque type GtkEventControllerScrollFlags = CUnsignedInt
object GtkEventControllerScrollFlags extends CEnumU[GtkEventControllerScrollFlags]:
  given _tag: Tag[GtkEventControllerScrollFlags] = Tag.UInt
  inline def define(inline a: Long): GtkEventControllerScrollFlags = a.toUInt
  val GTK_EVENT_CONTROLLER_SCROLL_NONE = define(0)
  val GTK_EVENT_CONTROLLER_SCROLL_VERTICAL = define(1)
  val GTK_EVENT_CONTROLLER_SCROLL_HORIZONTAL = define(2)
  val GTK_EVENT_CONTROLLER_SCROLL_DISCRETE = define(4)
  val GTK_EVENT_CONTROLLER_SCROLL_KINETIC = define(8)
  val GTK_EVENT_CONTROLLER_SCROLL_BOTH_AXES = define(3)
  inline def getName(inline value: GtkEventControllerScrollFlags): Option[String] =
    inline value match
      case GTK_EVENT_CONTROLLER_SCROLL_NONE => Some("GTK_EVENT_CONTROLLER_SCROLL_NONE")
      case GTK_EVENT_CONTROLLER_SCROLL_VERTICAL => Some("GTK_EVENT_CONTROLLER_SCROLL_VERTICAL")
      case GTK_EVENT_CONTROLLER_SCROLL_HORIZONTAL => Some("GTK_EVENT_CONTROLLER_SCROLL_HORIZONTAL")
      case GTK_EVENT_CONTROLLER_SCROLL_DISCRETE => Some("GTK_EVENT_CONTROLLER_SCROLL_DISCRETE")
      case GTK_EVENT_CONTROLLER_SCROLL_KINETIC => Some("GTK_EVENT_CONTROLLER_SCROLL_KINETIC")
      case GTK_EVENT_CONTROLLER_SCROLL_BOTH_AXES => Some("GTK_EVENT_CONTROLLER_SCROLL_BOTH_AXES")
      case _ => None
  extension (a: GtkEventControllerScrollFlags)
    inline def &(b: GtkEventControllerScrollFlags): GtkEventControllerScrollFlags = a & b
    inline def |(b: GtkEventControllerScrollFlags): GtkEventControllerScrollFlags = a | b
    inline def is(b: GtkEventControllerScrollFlags): Boolean = (a & b) == b

/**
 * GtkEventSequenceState: _EVENT_SEQUENCE_NONE: The sequence is handled, but not grabbed. _EVENT_SEQUENCE_CLAIMED: The sequence is handled and grabbed. _EVENT_SEQUENCE_DENIED: The sequence is denied.
*/
opaque type GtkEventSequenceState = CUnsignedInt
object GtkEventSequenceState extends CEnumU[GtkEventSequenceState]:
  given _tag: Tag[GtkEventSequenceState] = Tag.UInt
  inline def define(inline a: Long): GtkEventSequenceState = a.toUInt
  val GTK_EVENT_SEQUENCE_NONE = define(0)
  val GTK_EVENT_SEQUENCE_CLAIMED = define(1)
  val GTK_EVENT_SEQUENCE_DENIED = define(2)
  inline def getName(inline value: GtkEventSequenceState): Option[String] =
    inline value match
      case GTK_EVENT_SEQUENCE_NONE => Some("GTK_EVENT_SEQUENCE_NONE")
      case GTK_EVENT_SEQUENCE_CLAIMED => Some("GTK_EVENT_SEQUENCE_CLAIMED")
      case GTK_EVENT_SEQUENCE_DENIED => Some("GTK_EVENT_SEQUENCE_DENIED")
      case _ => None
  extension (a: GtkEventSequenceState)
    inline def &(b: GtkEventSequenceState): GtkEventSequenceState = a & b
    inline def |(b: GtkEventSequenceState): GtkEventSequenceState = a | b
    inline def is(b: GtkEventSequenceState): Boolean = (a & b) == b

/**
 * GtkFileChooserAction: _FILE_CHOOSER_ACTION_OPEN: Indicates open mode. The file chooser will only let the user pick an existing file. _FILE_CHOOSER_ACTION_SAVE: Indicates save mode. The file chooser will let the user pick an existing file, or type in a new filename. _FILE_CHOOSER_ACTION_SELECT_FOLDER: Indicates an Open mode for selecting folders. The file chooser will let the user pick an existing folder.
*/
opaque type GtkFileChooserAction = CUnsignedInt
object GtkFileChooserAction extends CEnumU[GtkFileChooserAction]:
  given _tag: Tag[GtkFileChooserAction] = Tag.UInt
  inline def define(inline a: Long): GtkFileChooserAction = a.toUInt
  val GTK_FILE_CHOOSER_ACTION_OPEN = define(0)
  val GTK_FILE_CHOOSER_ACTION_SAVE = define(1)
  val GTK_FILE_CHOOSER_ACTION_SELECT_FOLDER = define(2)
  inline def getName(inline value: GtkFileChooserAction): Option[String] =
    inline value match
      case GTK_FILE_CHOOSER_ACTION_OPEN => Some("GTK_FILE_CHOOSER_ACTION_OPEN")
      case GTK_FILE_CHOOSER_ACTION_SAVE => Some("GTK_FILE_CHOOSER_ACTION_SAVE")
      case GTK_FILE_CHOOSER_ACTION_SELECT_FOLDER => Some("GTK_FILE_CHOOSER_ACTION_SELECT_FOLDER")
      case _ => None
  extension (a: GtkFileChooserAction)
    inline def &(b: GtkFileChooserAction): GtkFileChooserAction = a & b
    inline def |(b: GtkFileChooserAction): GtkFileChooserAction = a | b
    inline def is(b: GtkFileChooserAction): Boolean = (a & b) == b

/**
 * GtkFileChooserError: _FILE_CHOOSER_ERROR_NONEXISTENT: Indicates that a file does not exist. _FILE_CHOOSER_ERROR_BAD_FILENAME: Indicates a malformed filename. _FILE_CHOOSER_ERROR_ALREADY_EXISTS: Indicates a duplicate path (e.g. when adding a bookmark). _FILE_CHOOSER_ERROR_INCOMPLETE_HOSTNAME: Indicates an incomplete hostname (e.g. "http://foo" without a slash after that).
*/
opaque type GtkFileChooserError = CUnsignedInt
object GtkFileChooserError extends CEnumU[GtkFileChooserError]:
  given _tag: Tag[GtkFileChooserError] = Tag.UInt
  inline def define(inline a: Long): GtkFileChooserError = a.toUInt
  val GTK_FILE_CHOOSER_ERROR_NONEXISTENT = define(0)
  val GTK_FILE_CHOOSER_ERROR_BAD_FILENAME = define(1)
  val GTK_FILE_CHOOSER_ERROR_ALREADY_EXISTS = define(2)
  val GTK_FILE_CHOOSER_ERROR_INCOMPLETE_HOSTNAME = define(3)
  inline def getName(inline value: GtkFileChooserError): Option[String] =
    inline value match
      case GTK_FILE_CHOOSER_ERROR_NONEXISTENT => Some("GTK_FILE_CHOOSER_ERROR_NONEXISTENT")
      case GTK_FILE_CHOOSER_ERROR_BAD_FILENAME => Some("GTK_FILE_CHOOSER_ERROR_BAD_FILENAME")
      case GTK_FILE_CHOOSER_ERROR_ALREADY_EXISTS => Some("GTK_FILE_CHOOSER_ERROR_ALREADY_EXISTS")
      case GTK_FILE_CHOOSER_ERROR_INCOMPLETE_HOSTNAME => Some("GTK_FILE_CHOOSER_ERROR_INCOMPLETE_HOSTNAME")
      case _ => None
  extension (a: GtkFileChooserError)
    inline def &(b: GtkFileChooserError): GtkFileChooserError = a & b
    inline def |(b: GtkFileChooserError): GtkFileChooserError = a | b
    inline def is(b: GtkFileChooserError): Boolean = (a & b) == b

/**
 * GtkFilterChange: _FILTER_CHANGE_DIFFERENT: The filter change cannot be described with any of the other enumeration values. _FILTER_CHANGE_LESS_STRICT: The filter is less strict than it was before: All items that it used to return %TRUE for still return %TRUE, others now may, too. _FILTER_CHANGE_MORE_STRICT: The filter is more strict than it was before: All items that it used to return %FALSE for still return %FALSE, others now may, too.
*/
opaque type GtkFilterChange = CUnsignedInt
object GtkFilterChange extends CEnumU[GtkFilterChange]:
  given _tag: Tag[GtkFilterChange] = Tag.UInt
  inline def define(inline a: Long): GtkFilterChange = a.toUInt
  val GTK_FILTER_CHANGE_DIFFERENT = define(0)
  val GTK_FILTER_CHANGE_LESS_STRICT = define(1)
  val GTK_FILTER_CHANGE_MORE_STRICT = define(2)
  inline def getName(inline value: GtkFilterChange): Option[String] =
    inline value match
      case GTK_FILTER_CHANGE_DIFFERENT => Some("GTK_FILTER_CHANGE_DIFFERENT")
      case GTK_FILTER_CHANGE_LESS_STRICT => Some("GTK_FILTER_CHANGE_LESS_STRICT")
      case GTK_FILTER_CHANGE_MORE_STRICT => Some("GTK_FILTER_CHANGE_MORE_STRICT")
      case _ => None
  extension (a: GtkFilterChange)
    inline def &(b: GtkFilterChange): GtkFilterChange = a & b
    inline def |(b: GtkFilterChange): GtkFilterChange = a | b
    inline def is(b: GtkFilterChange): Boolean = (a & b) == b

/**
 * GtkFilterMatch: _FILTER_MATCH_SOME: The filter matches some items, gtk_filter_match() may return %TRUE or %FALSE _FILTER_MATCH_NONE: The filter does not match any item, gtk_filter_match() will always return %FALSE. _FILTER_MATCH_ALL: The filter matches all items, gtk_filter_match() will alays return %TRUE.
*/
opaque type GtkFilterMatch = CUnsignedInt
object GtkFilterMatch extends CEnumU[GtkFilterMatch]:
  given _tag: Tag[GtkFilterMatch] = Tag.UInt
  inline def define(inline a: Long): GtkFilterMatch = a.toUInt
  val GTK_FILTER_MATCH_SOME = define(0)
  val GTK_FILTER_MATCH_NONE = define(1)
  val GTK_FILTER_MATCH_ALL = define(2)
  inline def getName(inline value: GtkFilterMatch): Option[String] =
    inline value match
      case GTK_FILTER_MATCH_SOME => Some("GTK_FILTER_MATCH_SOME")
      case GTK_FILTER_MATCH_NONE => Some("GTK_FILTER_MATCH_NONE")
      case GTK_FILTER_MATCH_ALL => Some("GTK_FILTER_MATCH_ALL")
      case _ => None
  extension (a: GtkFilterMatch)
    inline def &(b: GtkFilterMatch): GtkFilterMatch = a & b
    inline def |(b: GtkFilterMatch): GtkFilterMatch = a | b
    inline def is(b: GtkFilterMatch): Boolean = (a & b) == b

/**
 * GtkFontChooserLevel: _FONT_CHOOSER_LEVEL_FAMILY: Allow selecting a font family _FONT_CHOOSER_LEVEL_STYLE: Allow selecting a specific font face _FONT_CHOOSER_LEVEL_SIZE: Allow selecting a specific font size _FONT_CHOOSER_LEVEL_VARIATIONS: Allow changing OpenType font variation axes _FONT_CHOOSER_LEVEL_FEATURES: Allow selecting specific OpenType font features
*/
opaque type GtkFontChooserLevel = CUnsignedInt
object GtkFontChooserLevel extends CEnumU[GtkFontChooserLevel]:
  given _tag: Tag[GtkFontChooserLevel] = Tag.UInt
  inline def define(inline a: Long): GtkFontChooserLevel = a.toUInt
  val GTK_FONT_CHOOSER_LEVEL_FAMILY = define(0)
  val GTK_FONT_CHOOSER_LEVEL_STYLE = define(1)
  val GTK_FONT_CHOOSER_LEVEL_SIZE = define(2)
  val GTK_FONT_CHOOSER_LEVEL_VARIATIONS = define(4)
  val GTK_FONT_CHOOSER_LEVEL_FEATURES = define(8)
  inline def getName(inline value: GtkFontChooserLevel): Option[String] =
    inline value match
      case GTK_FONT_CHOOSER_LEVEL_FAMILY => Some("GTK_FONT_CHOOSER_LEVEL_FAMILY")
      case GTK_FONT_CHOOSER_LEVEL_STYLE => Some("GTK_FONT_CHOOSER_LEVEL_STYLE")
      case GTK_FONT_CHOOSER_LEVEL_SIZE => Some("GTK_FONT_CHOOSER_LEVEL_SIZE")
      case GTK_FONT_CHOOSER_LEVEL_VARIATIONS => Some("GTK_FONT_CHOOSER_LEVEL_VARIATIONS")
      case GTK_FONT_CHOOSER_LEVEL_FEATURES => Some("GTK_FONT_CHOOSER_LEVEL_FEATURES")
      case _ => None
  extension (a: GtkFontChooserLevel)
    inline def &(b: GtkFontChooserLevel): GtkFontChooserLevel = a & b
    inline def |(b: GtkFontChooserLevel): GtkFontChooserLevel = a | b
    inline def is(b: GtkFontChooserLevel): Boolean = (a & b) == b

/**
 * GtkIconLookupFlags: _ICON_LOOKUP_FORCE_REGULAR: Try to always load regular icons, even when symbolic icon names are given _ICON_LOOKUP_FORCE_SYMBOLIC: Try to always load symbolic icons, even when regular icon names are given _ICON_LOOKUP_PRELOAD: Starts loading the texture in the background so it is ready when later needed.
*/
opaque type GtkIconLookupFlags = CUnsignedInt
object GtkIconLookupFlags extends CEnumU[GtkIconLookupFlags]:
  given _tag: Tag[GtkIconLookupFlags] = Tag.UInt
  inline def define(inline a: Long): GtkIconLookupFlags = a.toUInt
  val GTK_ICON_LOOKUP_FORCE_REGULAR = define(1)
  val GTK_ICON_LOOKUP_FORCE_SYMBOLIC = define(2)
  val GTK_ICON_LOOKUP_PRELOAD = define(4)
  inline def getName(inline value: GtkIconLookupFlags): Option[String] =
    inline value match
      case GTK_ICON_LOOKUP_FORCE_REGULAR => Some("GTK_ICON_LOOKUP_FORCE_REGULAR")
      case GTK_ICON_LOOKUP_FORCE_SYMBOLIC => Some("GTK_ICON_LOOKUP_FORCE_SYMBOLIC")
      case GTK_ICON_LOOKUP_PRELOAD => Some("GTK_ICON_LOOKUP_PRELOAD")
      case _ => None
  extension (a: GtkIconLookupFlags)
    inline def &(b: GtkIconLookupFlags): GtkIconLookupFlags = a & b
    inline def |(b: GtkIconLookupFlags): GtkIconLookupFlags = a | b
    inline def is(b: GtkIconLookupFlags): Boolean = (a & b) == b

/**
 * GtkIconSize: _ICON_SIZE_INHERIT: Keep the size of the parent element _ICON_SIZE_NORMAL: Size similar to text size _ICON_SIZE_LARGE: Large size, for example in an icon view
*/
opaque type GtkIconSize = CUnsignedInt
object GtkIconSize extends CEnumU[GtkIconSize]:
  given _tag: Tag[GtkIconSize] = Tag.UInt
  inline def define(inline a: Long): GtkIconSize = a.toUInt
  val GTK_ICON_SIZE_INHERIT = define(0)
  val GTK_ICON_SIZE_NORMAL = define(1)
  val GTK_ICON_SIZE_LARGE = define(2)
  inline def getName(inline value: GtkIconSize): Option[String] =
    inline value match
      case GTK_ICON_SIZE_INHERIT => Some("GTK_ICON_SIZE_INHERIT")
      case GTK_ICON_SIZE_NORMAL => Some("GTK_ICON_SIZE_NORMAL")
      case GTK_ICON_SIZE_LARGE => Some("GTK_ICON_SIZE_LARGE")
      case _ => None
  extension (a: GtkIconSize)
    inline def &(b: GtkIconSize): GtkIconSize = a & b
    inline def |(b: GtkIconSize): GtkIconSize = a | b
    inline def is(b: GtkIconSize): Boolean = (a & b) == b

/**
 * GtkIconThemeError: _ICON_THEME_NOT_FOUND: The icon specified does not exist in the theme _ICON_THEME_FAILED: An unspecified error occurred.
*/
opaque type GtkIconThemeError = CUnsignedInt
object GtkIconThemeError extends CEnumU[GtkIconThemeError]:
  given _tag: Tag[GtkIconThemeError] = Tag.UInt
  inline def define(inline a: Long): GtkIconThemeError = a.toUInt
  val GTK_ICON_THEME_NOT_FOUND = define(0)
  val GTK_ICON_THEME_FAILED = define(1)
  inline def getName(inline value: GtkIconThemeError): Option[String] =
    inline value match
      case GTK_ICON_THEME_NOT_FOUND => Some("GTK_ICON_THEME_NOT_FOUND")
      case GTK_ICON_THEME_FAILED => Some("GTK_ICON_THEME_FAILED")
      case _ => None
  extension (a: GtkIconThemeError)
    inline def &(b: GtkIconThemeError): GtkIconThemeError = a & b
    inline def |(b: GtkIconThemeError): GtkIconThemeError = a | b
    inline def is(b: GtkIconThemeError): Boolean = (a & b) == b

/**
 * GtkIconViewDropPosition: _ICON_VIEW_NO_DROP: no drop possible _ICON_VIEW_DROP_INTO: dropped item replaces the item _ICON_VIEW_DROP_LEFT: dropped item is inserted to the left _ICON_VIEW_DROP_RIGHT: dropped item is inserted to the right _ICON_VIEW_DROP_ABOVE: dropped item is inserted above _ICON_VIEW_DROP_BELOW: dropped item is inserted below
*/
opaque type GtkIconViewDropPosition = CUnsignedInt
object GtkIconViewDropPosition extends CEnumU[GtkIconViewDropPosition]:
  given _tag: Tag[GtkIconViewDropPosition] = Tag.UInt
  inline def define(inline a: Long): GtkIconViewDropPosition = a.toUInt
  val GTK_ICON_VIEW_NO_DROP = define(0)
  val GTK_ICON_VIEW_DROP_INTO = define(1)
  val GTK_ICON_VIEW_DROP_LEFT = define(2)
  val GTK_ICON_VIEW_DROP_RIGHT = define(3)
  val GTK_ICON_VIEW_DROP_ABOVE = define(4)
  val GTK_ICON_VIEW_DROP_BELOW = define(5)
  inline def getName(inline value: GtkIconViewDropPosition): Option[String] =
    inline value match
      case GTK_ICON_VIEW_NO_DROP => Some("GTK_ICON_VIEW_NO_DROP")
      case GTK_ICON_VIEW_DROP_INTO => Some("GTK_ICON_VIEW_DROP_INTO")
      case GTK_ICON_VIEW_DROP_LEFT => Some("GTK_ICON_VIEW_DROP_LEFT")
      case GTK_ICON_VIEW_DROP_RIGHT => Some("GTK_ICON_VIEW_DROP_RIGHT")
      case GTK_ICON_VIEW_DROP_ABOVE => Some("GTK_ICON_VIEW_DROP_ABOVE")
      case GTK_ICON_VIEW_DROP_BELOW => Some("GTK_ICON_VIEW_DROP_BELOW")
      case _ => None
  extension (a: GtkIconViewDropPosition)
    inline def &(b: GtkIconViewDropPosition): GtkIconViewDropPosition = a & b
    inline def |(b: GtkIconViewDropPosition): GtkIconViewDropPosition = a | b
    inline def is(b: GtkIconViewDropPosition): Boolean = (a & b) == b

/**
 * GtkImageType: _IMAGE_EMPTY: there is no image displayed by the widget _IMAGE_ICON_NAME: the widget contains a named icon _IMAGE_GICON: the widget contains a `GIcon` _IMAGE_PAINTABLE: the widget contains a `GdkPaintable`
*/
opaque type GtkImageType = CUnsignedInt
object GtkImageType extends CEnumU[GtkImageType]:
  given _tag: Tag[GtkImageType] = Tag.UInt
  inline def define(inline a: Long): GtkImageType = a.toUInt
  val GTK_IMAGE_EMPTY = define(0)
  val GTK_IMAGE_ICON_NAME = define(1)
  val GTK_IMAGE_GICON = define(2)
  val GTK_IMAGE_PAINTABLE = define(3)
  inline def getName(inline value: GtkImageType): Option[String] =
    inline value match
      case GTK_IMAGE_EMPTY => Some("GTK_IMAGE_EMPTY")
      case GTK_IMAGE_ICON_NAME => Some("GTK_IMAGE_ICON_NAME")
      case GTK_IMAGE_GICON => Some("GTK_IMAGE_GICON")
      case GTK_IMAGE_PAINTABLE => Some("GTK_IMAGE_PAINTABLE")
      case _ => None
  extension (a: GtkImageType)
    inline def &(b: GtkImageType): GtkImageType = a & b
    inline def |(b: GtkImageType): GtkImageType = a | b
    inline def is(b: GtkImageType): Boolean = (a & b) == b

/**
 * GtkInputHints: _INPUT_HINT_NONE: No special behaviour suggested _INPUT_HINT_SPELLCHECK: Suggest checking for typos _INPUT_HINT_NO_SPELLCHECK: Suggest not checking for typos _INPUT_HINT_WORD_COMPLETION: Suggest word completion _INPUT_HINT_LOWERCASE: Suggest to convert all text to lowercase _INPUT_HINT_UPPERCASE_CHARS: Suggest to capitalize all text _INPUT_HINT_UPPERCASE_WORDS: Suggest to capitalize the first character of each word _INPUT_HINT_UPPERCASE_SENTENCES: Suggest to capitalize the first word of each sentence _INPUT_HINT_INHIBIT_OSK: Suggest to not show an onscreen keyboard (e.g for a calculator that already has all the keys). _INPUT_HINT_VERTICAL_WRITING: The text is vertical _INPUT_HINT_EMOJI: Suggest offering Emoji support _INPUT_HINT_NO_EMOJI: Suggest not offering Emoji support _INPUT_HINT_PRIVATE: Request that the input method should not update personalized data (like typing history)
*/
opaque type GtkInputHints = CUnsignedInt
object GtkInputHints extends CEnumU[GtkInputHints]:
  given _tag: Tag[GtkInputHints] = Tag.UInt
  inline def define(inline a: Long): GtkInputHints = a.toUInt
  val GTK_INPUT_HINT_NONE = define(0)
  val GTK_INPUT_HINT_SPELLCHECK = define(1)
  val GTK_INPUT_HINT_NO_SPELLCHECK = define(2)
  val GTK_INPUT_HINT_WORD_COMPLETION = define(4)
  val GTK_INPUT_HINT_LOWERCASE = define(8)
  val GTK_INPUT_HINT_UPPERCASE_CHARS = define(16)
  val GTK_INPUT_HINT_UPPERCASE_WORDS = define(32)
  val GTK_INPUT_HINT_UPPERCASE_SENTENCES = define(64)
  val GTK_INPUT_HINT_INHIBIT_OSK = define(128)
  val GTK_INPUT_HINT_VERTICAL_WRITING = define(256)
  val GTK_INPUT_HINT_EMOJI = define(512)
  val GTK_INPUT_HINT_NO_EMOJI = define(1024)
  val GTK_INPUT_HINT_PRIVATE = define(2048)
  inline def getName(inline value: GtkInputHints): Option[String] =
    inline value match
      case GTK_INPUT_HINT_NONE => Some("GTK_INPUT_HINT_NONE")
      case GTK_INPUT_HINT_SPELLCHECK => Some("GTK_INPUT_HINT_SPELLCHECK")
      case GTK_INPUT_HINT_NO_SPELLCHECK => Some("GTK_INPUT_HINT_NO_SPELLCHECK")
      case GTK_INPUT_HINT_WORD_COMPLETION => Some("GTK_INPUT_HINT_WORD_COMPLETION")
      case GTK_INPUT_HINT_LOWERCASE => Some("GTK_INPUT_HINT_LOWERCASE")
      case GTK_INPUT_HINT_UPPERCASE_CHARS => Some("GTK_INPUT_HINT_UPPERCASE_CHARS")
      case GTK_INPUT_HINT_UPPERCASE_WORDS => Some("GTK_INPUT_HINT_UPPERCASE_WORDS")
      case GTK_INPUT_HINT_UPPERCASE_SENTENCES => Some("GTK_INPUT_HINT_UPPERCASE_SENTENCES")
      case GTK_INPUT_HINT_INHIBIT_OSK => Some("GTK_INPUT_HINT_INHIBIT_OSK")
      case GTK_INPUT_HINT_VERTICAL_WRITING => Some("GTK_INPUT_HINT_VERTICAL_WRITING")
      case GTK_INPUT_HINT_EMOJI => Some("GTK_INPUT_HINT_EMOJI")
      case GTK_INPUT_HINT_NO_EMOJI => Some("GTK_INPUT_HINT_NO_EMOJI")
      case GTK_INPUT_HINT_PRIVATE => Some("GTK_INPUT_HINT_PRIVATE")
      case _ => None
  extension (a: GtkInputHints)
    inline def &(b: GtkInputHints): GtkInputHints = a & b
    inline def |(b: GtkInputHints): GtkInputHints = a | b
    inline def is(b: GtkInputHints): Boolean = (a & b) == b

/**
 * GtkInputPurpose: _INPUT_PURPOSE_FREE_FORM: Allow any character _INPUT_PURPOSE_ALPHA: Allow only alphabetic characters _INPUT_PURPOSE_DIGITS: Allow only digits _INPUT_PURPOSE_NUMBER: Edited field expects numbers _INPUT_PURPOSE_PHONE: Edited field expects phone number _INPUT_PURPOSE_URL: Edited field expects URL _INPUT_PURPOSE_EMAIL: Edited field expects email address _INPUT_PURPOSE_NAME: Edited field expects the name of a person _INPUT_PURPOSE_PASSWORD: Like %GTK_INPUT_PURPOSE_FREE_FORM, but characters are hidden _INPUT_PURPOSE_PIN: Like %GTK_INPUT_PURPOSE_DIGITS, but characters are hidden _INPUT_PURPOSE_TERMINAL: Allow any character, in addition to control codes
*/
opaque type GtkInputPurpose = CUnsignedInt
object GtkInputPurpose extends CEnumU[GtkInputPurpose]:
  given _tag: Tag[GtkInputPurpose] = Tag.UInt
  inline def define(inline a: Long): GtkInputPurpose = a.toUInt
  val GTK_INPUT_PURPOSE_FREE_FORM = define(0)
  val GTK_INPUT_PURPOSE_ALPHA = define(1)
  val GTK_INPUT_PURPOSE_DIGITS = define(2)
  val GTK_INPUT_PURPOSE_NUMBER = define(3)
  val GTK_INPUT_PURPOSE_PHONE = define(4)
  val GTK_INPUT_PURPOSE_URL = define(5)
  val GTK_INPUT_PURPOSE_EMAIL = define(6)
  val GTK_INPUT_PURPOSE_NAME = define(7)
  val GTK_INPUT_PURPOSE_PASSWORD = define(8)
  val GTK_INPUT_PURPOSE_PIN = define(9)
  val GTK_INPUT_PURPOSE_TERMINAL = define(10)
  inline def getName(inline value: GtkInputPurpose): Option[String] =
    inline value match
      case GTK_INPUT_PURPOSE_FREE_FORM => Some("GTK_INPUT_PURPOSE_FREE_FORM")
      case GTK_INPUT_PURPOSE_ALPHA => Some("GTK_INPUT_PURPOSE_ALPHA")
      case GTK_INPUT_PURPOSE_DIGITS => Some("GTK_INPUT_PURPOSE_DIGITS")
      case GTK_INPUT_PURPOSE_NUMBER => Some("GTK_INPUT_PURPOSE_NUMBER")
      case GTK_INPUT_PURPOSE_PHONE => Some("GTK_INPUT_PURPOSE_PHONE")
      case GTK_INPUT_PURPOSE_URL => Some("GTK_INPUT_PURPOSE_URL")
      case GTK_INPUT_PURPOSE_EMAIL => Some("GTK_INPUT_PURPOSE_EMAIL")
      case GTK_INPUT_PURPOSE_NAME => Some("GTK_INPUT_PURPOSE_NAME")
      case GTK_INPUT_PURPOSE_PASSWORD => Some("GTK_INPUT_PURPOSE_PASSWORD")
      case GTK_INPUT_PURPOSE_PIN => Some("GTK_INPUT_PURPOSE_PIN")
      case GTK_INPUT_PURPOSE_TERMINAL => Some("GTK_INPUT_PURPOSE_TERMINAL")
      case _ => None
  extension (a: GtkInputPurpose)
    inline def &(b: GtkInputPurpose): GtkInputPurpose = a & b
    inline def |(b: GtkInputPurpose): GtkInputPurpose = a | b
    inline def is(b: GtkInputPurpose): Boolean = (a & b) == b

/**
 * GtkJustification: _JUSTIFY_LEFT: The text is placed at the left edge of the label. _JUSTIFY_RIGHT: The text is placed at the right edge of the label. _JUSTIFY_CENTER: The text is placed in the center of the label. _JUSTIFY_FILL: The text is placed is distributed across the label.
*/
opaque type GtkJustification = CUnsignedInt
object GtkJustification extends CEnumU[GtkJustification]:
  given _tag: Tag[GtkJustification] = Tag.UInt
  inline def define(inline a: Long): GtkJustification = a.toUInt
  val GTK_JUSTIFY_LEFT = define(0)
  val GTK_JUSTIFY_RIGHT = define(1)
  val GTK_JUSTIFY_CENTER = define(2)
  val GTK_JUSTIFY_FILL = define(3)
  inline def getName(inline value: GtkJustification): Option[String] =
    inline value match
      case GTK_JUSTIFY_LEFT => Some("GTK_JUSTIFY_LEFT")
      case GTK_JUSTIFY_RIGHT => Some("GTK_JUSTIFY_RIGHT")
      case GTK_JUSTIFY_CENTER => Some("GTK_JUSTIFY_CENTER")
      case GTK_JUSTIFY_FILL => Some("GTK_JUSTIFY_FILL")
      case _ => None
  extension (a: GtkJustification)
    inline def &(b: GtkJustification): GtkJustification = a & b
    inline def |(b: GtkJustification): GtkJustification = a | b
    inline def is(b: GtkJustification): Boolean = (a & b) == b

/**
 * GtkLevelBarMode: _LEVEL_BAR_MODE_CONTINUOUS: the bar has a continuous mode _LEVEL_BAR_MODE_DISCRETE: the bar has a discrete mode
*/
opaque type GtkLevelBarMode = CUnsignedInt
object GtkLevelBarMode extends CEnumU[GtkLevelBarMode]:
  given _tag: Tag[GtkLevelBarMode] = Tag.UInt
  inline def define(inline a: Long): GtkLevelBarMode = a.toUInt
  val GTK_LEVEL_BAR_MODE_CONTINUOUS = define(0)
  val GTK_LEVEL_BAR_MODE_DISCRETE = define(1)
  inline def getName(inline value: GtkLevelBarMode): Option[String] =
    inline value match
      case GTK_LEVEL_BAR_MODE_CONTINUOUS => Some("GTK_LEVEL_BAR_MODE_CONTINUOUS")
      case GTK_LEVEL_BAR_MODE_DISCRETE => Some("GTK_LEVEL_BAR_MODE_DISCRETE")
      case _ => None
  extension (a: GtkLevelBarMode)
    inline def &(b: GtkLevelBarMode): GtkLevelBarMode = a & b
    inline def |(b: GtkLevelBarMode): GtkLevelBarMode = a | b
    inline def is(b: GtkLevelBarMode): Boolean = (a & b) == b

/**
 * GtkLicense: _LICENSE_UNKNOWN: No license specified _LICENSE_CUSTOM: A license text is going to be specified by the developer _LICENSE_GPL_2_0: The GNU General Public License, version 2.0 or later _LICENSE_GPL_3_0: The GNU General Public License, version 3.0 or later _LICENSE_LGPL_2_1: The GNU Lesser General Public License, version 2.1 or later _LICENSE_LGPL_3_0: The GNU Lesser General Public License, version 3.0 or later _LICENSE_BSD: The BSD standard license _LICENSE_MIT_X11: The MIT/X11 standard license _LICENSE_ARTISTIC: The Artistic License, version 2.0 _LICENSE_GPL_2_0_ONLY: The GNU General Public License, version 2.0 only _LICENSE_GPL_3_0_ONLY: The GNU General Public License, version 3.0 only _LICENSE_LGPL_2_1_ONLY: The GNU Lesser General Public License, version 2.1 only _LICENSE_LGPL_3_0_ONLY: The GNU Lesser General Public License, version 3.0 only _LICENSE_AGPL_3_0: The GNU Affero General Public License, version 3.0 or later _LICENSE_AGPL_3_0_ONLY: The GNU Affero General Public License, version 3.0 only _LICENSE_BSD_3: The 3-clause BSD licence _LICENSE_APACHE_2_0: The Apache License, version 2.0 _LICENSE_MPL_2_0: The Mozilla Public License, version 2.0
*/
opaque type GtkLicense = CUnsignedInt
object GtkLicense extends CEnumU[GtkLicense]:
  given _tag: Tag[GtkLicense] = Tag.UInt
  inline def define(inline a: Long): GtkLicense = a.toUInt
  val GTK_LICENSE_UNKNOWN = define(0)
  val GTK_LICENSE_CUSTOM = define(1)
  val GTK_LICENSE_GPL_2_0 = define(2)
  val GTK_LICENSE_GPL_3_0 = define(3)
  val GTK_LICENSE_LGPL_2_1 = define(4)
  val GTK_LICENSE_LGPL_3_0 = define(5)
  val GTK_LICENSE_BSD = define(6)
  val GTK_LICENSE_MIT_X11 = define(7)
  val GTK_LICENSE_ARTISTIC = define(8)
  val GTK_LICENSE_GPL_2_0_ONLY = define(9)
  val GTK_LICENSE_GPL_3_0_ONLY = define(10)
  val GTK_LICENSE_LGPL_2_1_ONLY = define(11)
  val GTK_LICENSE_LGPL_3_0_ONLY = define(12)
  val GTK_LICENSE_AGPL_3_0 = define(13)
  val GTK_LICENSE_AGPL_3_0_ONLY = define(14)
  val GTK_LICENSE_BSD_3 = define(15)
  val GTK_LICENSE_APACHE_2_0 = define(16)
  val GTK_LICENSE_MPL_2_0 = define(17)
  inline def getName(inline value: GtkLicense): Option[String] =
    inline value match
      case GTK_LICENSE_UNKNOWN => Some("GTK_LICENSE_UNKNOWN")
      case GTK_LICENSE_CUSTOM => Some("GTK_LICENSE_CUSTOM")
      case GTK_LICENSE_GPL_2_0 => Some("GTK_LICENSE_GPL_2_0")
      case GTK_LICENSE_GPL_3_0 => Some("GTK_LICENSE_GPL_3_0")
      case GTK_LICENSE_LGPL_2_1 => Some("GTK_LICENSE_LGPL_2_1")
      case GTK_LICENSE_LGPL_3_0 => Some("GTK_LICENSE_LGPL_3_0")
      case GTK_LICENSE_BSD => Some("GTK_LICENSE_BSD")
      case GTK_LICENSE_MIT_X11 => Some("GTK_LICENSE_MIT_X11")
      case GTK_LICENSE_ARTISTIC => Some("GTK_LICENSE_ARTISTIC")
      case GTK_LICENSE_GPL_2_0_ONLY => Some("GTK_LICENSE_GPL_2_0_ONLY")
      case GTK_LICENSE_GPL_3_0_ONLY => Some("GTK_LICENSE_GPL_3_0_ONLY")
      case GTK_LICENSE_LGPL_2_1_ONLY => Some("GTK_LICENSE_LGPL_2_1_ONLY")
      case GTK_LICENSE_LGPL_3_0_ONLY => Some("GTK_LICENSE_LGPL_3_0_ONLY")
      case GTK_LICENSE_AGPL_3_0 => Some("GTK_LICENSE_AGPL_3_0")
      case GTK_LICENSE_AGPL_3_0_ONLY => Some("GTK_LICENSE_AGPL_3_0_ONLY")
      case GTK_LICENSE_BSD_3 => Some("GTK_LICENSE_BSD_3")
      case GTK_LICENSE_APACHE_2_0 => Some("GTK_LICENSE_APACHE_2_0")
      case GTK_LICENSE_MPL_2_0 => Some("GTK_LICENSE_MPL_2_0")
      case _ => None
  extension (a: GtkLicense)
    inline def &(b: GtkLicense): GtkLicense = a & b
    inline def |(b: GtkLicense): GtkLicense = a | b
    inline def is(b: GtkLicense): Boolean = (a & b) == b

/**
 * GtkMessageType: _MESSAGE_INFO: Informational message _MESSAGE_WARNING: Non-fatal warning message _MESSAGE_QUESTION: Question requiring a choice _MESSAGE_ERROR: Fatal error message _MESSAGE_OTHER: None of the above
*/
opaque type GtkMessageType = CUnsignedInt
object GtkMessageType extends CEnumU[GtkMessageType]:
  given _tag: Tag[GtkMessageType] = Tag.UInt
  inline def define(inline a: Long): GtkMessageType = a.toUInt
  val GTK_MESSAGE_INFO = define(0)
  val GTK_MESSAGE_WARNING = define(1)
  val GTK_MESSAGE_QUESTION = define(2)
  val GTK_MESSAGE_ERROR = define(3)
  val GTK_MESSAGE_OTHER = define(4)
  inline def getName(inline value: GtkMessageType): Option[String] =
    inline value match
      case GTK_MESSAGE_INFO => Some("GTK_MESSAGE_INFO")
      case GTK_MESSAGE_WARNING => Some("GTK_MESSAGE_WARNING")
      case GTK_MESSAGE_QUESTION => Some("GTK_MESSAGE_QUESTION")
      case GTK_MESSAGE_ERROR => Some("GTK_MESSAGE_ERROR")
      case GTK_MESSAGE_OTHER => Some("GTK_MESSAGE_OTHER")
      case _ => None
  extension (a: GtkMessageType)
    inline def &(b: GtkMessageType): GtkMessageType = a & b
    inline def |(b: GtkMessageType): GtkMessageType = a | b
    inline def is(b: GtkMessageType): Boolean = (a & b) == b

/**
 * GtkMovementStep: _MOVEMENT_LOGICAL_POSITIONS: Move forward or back by graphemes _MOVEMENT_VISUAL_POSITIONS: Move left or right by graphemes _MOVEMENT_WORDS: Move forward or back by words _MOVEMENT_DISPLAY_LINES: Move up or down lines (wrapped lines) _MOVEMENT_DISPLAY_LINE_ENDS: Move to either end of a line _MOVEMENT_PARAGRAPHS: Move up or down paragraphs (newline-ended lines) _MOVEMENT_PARAGRAPH_ENDS: Move to either end of a paragraph _MOVEMENT_PAGES: Move by pages _MOVEMENT_BUFFER_ENDS: Move to ends of the buffer _MOVEMENT_HORIZONTAL_PAGES: Move horizontally by pages
*/
opaque type GtkMovementStep = CUnsignedInt
object GtkMovementStep extends CEnumU[GtkMovementStep]:
  given _tag: Tag[GtkMovementStep] = Tag.UInt
  inline def define(inline a: Long): GtkMovementStep = a.toUInt
  val GTK_MOVEMENT_LOGICAL_POSITIONS = define(0)
  val GTK_MOVEMENT_VISUAL_POSITIONS = define(1)
  val GTK_MOVEMENT_WORDS = define(2)
  val GTK_MOVEMENT_DISPLAY_LINES = define(3)
  val GTK_MOVEMENT_DISPLAY_LINE_ENDS = define(4)
  val GTK_MOVEMENT_PARAGRAPHS = define(5)
  val GTK_MOVEMENT_PARAGRAPH_ENDS = define(6)
  val GTK_MOVEMENT_PAGES = define(7)
  val GTK_MOVEMENT_BUFFER_ENDS = define(8)
  val GTK_MOVEMENT_HORIZONTAL_PAGES = define(9)
  inline def getName(inline value: GtkMovementStep): Option[String] =
    inline value match
      case GTK_MOVEMENT_LOGICAL_POSITIONS => Some("GTK_MOVEMENT_LOGICAL_POSITIONS")
      case GTK_MOVEMENT_VISUAL_POSITIONS => Some("GTK_MOVEMENT_VISUAL_POSITIONS")
      case GTK_MOVEMENT_WORDS => Some("GTK_MOVEMENT_WORDS")
      case GTK_MOVEMENT_DISPLAY_LINES => Some("GTK_MOVEMENT_DISPLAY_LINES")
      case GTK_MOVEMENT_DISPLAY_LINE_ENDS => Some("GTK_MOVEMENT_DISPLAY_LINE_ENDS")
      case GTK_MOVEMENT_PARAGRAPHS => Some("GTK_MOVEMENT_PARAGRAPHS")
      case GTK_MOVEMENT_PARAGRAPH_ENDS => Some("GTK_MOVEMENT_PARAGRAPH_ENDS")
      case GTK_MOVEMENT_PAGES => Some("GTK_MOVEMENT_PAGES")
      case GTK_MOVEMENT_BUFFER_ENDS => Some("GTK_MOVEMENT_BUFFER_ENDS")
      case GTK_MOVEMENT_HORIZONTAL_PAGES => Some("GTK_MOVEMENT_HORIZONTAL_PAGES")
      case _ => None
  extension (a: GtkMovementStep)
    inline def &(b: GtkMovementStep): GtkMovementStep = a & b
    inline def |(b: GtkMovementStep): GtkMovementStep = a | b
    inline def is(b: GtkMovementStep): Boolean = (a & b) == b

/**
 * GtkNaturalWrapMode: _NATURAL_WRAP_INHERIT: Inherit the minimum size request. In particular, this should be used with %PANGO_WRAP_CHAR. _NATURAL_WRAP_NONE: Try not to wrap the text. This mode is the closest to GTK3's behavior but can lead to a wide label leaving lots of empty space below the text. _NATURAL_WRAP_WORD: Attempt to wrap at word boundaries. This is useful in particular when using %PANGO_WRAP_WORD_CHAR as the wrap mode.
*/
opaque type GtkNaturalWrapMode = CUnsignedInt
object GtkNaturalWrapMode extends CEnumU[GtkNaturalWrapMode]:
  given _tag: Tag[GtkNaturalWrapMode] = Tag.UInt
  inline def define(inline a: Long): GtkNaturalWrapMode = a.toUInt
  val GTK_NATURAL_WRAP_INHERIT = define(0)
  val GTK_NATURAL_WRAP_NONE = define(1)
  val GTK_NATURAL_WRAP_WORD = define(2)
  inline def getName(inline value: GtkNaturalWrapMode): Option[String] =
    inline value match
      case GTK_NATURAL_WRAP_INHERIT => Some("GTK_NATURAL_WRAP_INHERIT")
      case GTK_NATURAL_WRAP_NONE => Some("GTK_NATURAL_WRAP_NONE")
      case GTK_NATURAL_WRAP_WORD => Some("GTK_NATURAL_WRAP_WORD")
      case _ => None
  extension (a: GtkNaturalWrapMode)
    inline def &(b: GtkNaturalWrapMode): GtkNaturalWrapMode = a & b
    inline def |(b: GtkNaturalWrapMode): GtkNaturalWrapMode = a | b
    inline def is(b: GtkNaturalWrapMode): Boolean = (a & b) == b

/**
 * GtkNotebookTab: _NOTEBOOK_TAB_FIRST: the first tab in the notebook _NOTEBOOK_TAB_LAST: the last tab in the notebook
*/
opaque type GtkNotebookTab = CUnsignedInt
object GtkNotebookTab extends CEnumU[GtkNotebookTab]:
  given _tag: Tag[GtkNotebookTab] = Tag.UInt
  inline def define(inline a: Long): GtkNotebookTab = a.toUInt
  val GTK_NOTEBOOK_TAB_FIRST = define(0)
  val GTK_NOTEBOOK_TAB_LAST = define(1)
  inline def getName(inline value: GtkNotebookTab): Option[String] =
    inline value match
      case GTK_NOTEBOOK_TAB_FIRST => Some("GTK_NOTEBOOK_TAB_FIRST")
      case GTK_NOTEBOOK_TAB_LAST => Some("GTK_NOTEBOOK_TAB_LAST")
      case _ => None
  extension (a: GtkNotebookTab)
    inline def &(b: GtkNotebookTab): GtkNotebookTab = a & b
    inline def |(b: GtkNotebookTab): GtkNotebookTab = a | b
    inline def is(b: GtkNotebookTab): Boolean = (a & b) == b

/**
 * GtkNumberUpLayout: _NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_TOP_TO_BOTTOM: ![](layout-lrtb.png) _NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_BOTTOM_TO_TOP: ![](layout-lrbt.png) _NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_TOP_TO_BOTTOM: ![](layout-rltb.png) _NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_BOTTOM_TO_TOP: ![](layout-rlbt.png) _NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_LEFT_TO_RIGHT: ![](layout-tblr.png) _NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_RIGHT_TO_LEFT: ![](layout-tbrl.png) _NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_LEFT_TO_RIGHT: ![](layout-btlr.png) _NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_RIGHT_TO_LEFT: ![](layout-btrl.png)
*/
opaque type GtkNumberUpLayout = CUnsignedInt
object GtkNumberUpLayout extends CEnumU[GtkNumberUpLayout]:
  given _tag: Tag[GtkNumberUpLayout] = Tag.UInt
  inline def define(inline a: Long): GtkNumberUpLayout = a.toUInt
  val GTK_NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_TOP_TO_BOTTOM = define(0)
  val GTK_NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_BOTTOM_TO_TOP = define(1)
  val GTK_NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_TOP_TO_BOTTOM = define(2)
  val GTK_NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_BOTTOM_TO_TOP = define(3)
  val GTK_NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_LEFT_TO_RIGHT = define(4)
  val GTK_NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_RIGHT_TO_LEFT = define(5)
  val GTK_NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_LEFT_TO_RIGHT = define(6)
  val GTK_NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_RIGHT_TO_LEFT = define(7)
  inline def getName(inline value: GtkNumberUpLayout): Option[String] =
    inline value match
      case GTK_NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_TOP_TO_BOTTOM => Some("GTK_NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_TOP_TO_BOTTOM")
      case GTK_NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_BOTTOM_TO_TOP => Some("GTK_NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_BOTTOM_TO_TOP")
      case GTK_NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_TOP_TO_BOTTOM => Some("GTK_NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_TOP_TO_BOTTOM")
      case GTK_NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_BOTTOM_TO_TOP => Some("GTK_NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_BOTTOM_TO_TOP")
      case GTK_NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_LEFT_TO_RIGHT => Some("GTK_NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_LEFT_TO_RIGHT")
      case GTK_NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_RIGHT_TO_LEFT => Some("GTK_NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_RIGHT_TO_LEFT")
      case GTK_NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_LEFT_TO_RIGHT => Some("GTK_NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_LEFT_TO_RIGHT")
      case GTK_NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_RIGHT_TO_LEFT => Some("GTK_NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_RIGHT_TO_LEFT")
      case _ => None
  extension (a: GtkNumberUpLayout)
    inline def &(b: GtkNumberUpLayout): GtkNumberUpLayout = a & b
    inline def |(b: GtkNumberUpLayout): GtkNumberUpLayout = a | b
    inline def is(b: GtkNumberUpLayout): Boolean = (a & b) == b

/**
 * GtkOrdering: _ORDERING_SMALLER: the first value is smaller than the second _ORDERING_EQUAL: the two values are equal _ORDERING_LARGER: the first value is larger than the second
*/
opaque type GtkOrdering = CInt
object GtkOrdering extends CEnum[GtkOrdering]:
  given _tag: Tag[GtkOrdering] = Tag.Int
  inline def define(inline a: CInt): GtkOrdering = a
  val GTK_ORDERING_SMALLER = define(-1)
  val GTK_ORDERING_EQUAL = define(0)
  val GTK_ORDERING_LARGER = define(1)
  inline def getName(inline value: GtkOrdering): Option[String] =
    inline value match
      case GTK_ORDERING_SMALLER => Some("GTK_ORDERING_SMALLER")
      case GTK_ORDERING_EQUAL => Some("GTK_ORDERING_EQUAL")
      case GTK_ORDERING_LARGER => Some("GTK_ORDERING_LARGER")
      case _ => None
  extension (a: GtkOrdering)
    inline def &(b: GtkOrdering): GtkOrdering = a & b
    inline def |(b: GtkOrdering): GtkOrdering = a | b
    inline def is(b: GtkOrdering): Boolean = (a & b) == b

/**
 * GtkOrientation: _ORIENTATION_HORIZONTAL: The element is in horizontal orientation. _ORIENTATION_VERTICAL: The element is in vertical orientation.
*/
opaque type GtkOrientation = CUnsignedInt
object GtkOrientation extends CEnumU[GtkOrientation]:
  given _tag: Tag[GtkOrientation] = Tag.UInt
  inline def define(inline a: Long): GtkOrientation = a.toUInt
  val GTK_ORIENTATION_HORIZONTAL = define(0)
  val GTK_ORIENTATION_VERTICAL = define(1)
  inline def getName(inline value: GtkOrientation): Option[String] =
    inline value match
      case GTK_ORIENTATION_HORIZONTAL => Some("GTK_ORIENTATION_HORIZONTAL")
      case GTK_ORIENTATION_VERTICAL => Some("GTK_ORIENTATION_VERTICAL")
      case _ => None
  extension (a: GtkOrientation)
    inline def &(b: GtkOrientation): GtkOrientation = a & b
    inline def |(b: GtkOrientation): GtkOrientation = a | b
    inline def is(b: GtkOrientation): Boolean = (a & b) == b

/**
 * GtkOverflow: _OVERFLOW_VISIBLE: No change is applied. Content is drawn at the specified position. _OVERFLOW_HIDDEN: Content is clipped to the bounds of the area. Content outside the area is not drawn and cannot be interacted with.
*/
opaque type GtkOverflow = CUnsignedInt
object GtkOverflow extends CEnumU[GtkOverflow]:
  given _tag: Tag[GtkOverflow] = Tag.UInt
  inline def define(inline a: Long): GtkOverflow = a.toUInt
  val GTK_OVERFLOW_VISIBLE = define(0)
  val GTK_OVERFLOW_HIDDEN = define(1)
  inline def getName(inline value: GtkOverflow): Option[String] =
    inline value match
      case GTK_OVERFLOW_VISIBLE => Some("GTK_OVERFLOW_VISIBLE")
      case GTK_OVERFLOW_HIDDEN => Some("GTK_OVERFLOW_HIDDEN")
      case _ => None
  extension (a: GtkOverflow)
    inline def &(b: GtkOverflow): GtkOverflow = a & b
    inline def |(b: GtkOverflow): GtkOverflow = a | b
    inline def is(b: GtkOverflow): Boolean = (a & b) == b

/**
 * GtkPackType: _PACK_START: The child is packed into the start of the widget _PACK_END: The child is packed into the end of the widget
*/
opaque type GtkPackType = CUnsignedInt
object GtkPackType extends CEnumU[GtkPackType]:
  given _tag: Tag[GtkPackType] = Tag.UInt
  inline def define(inline a: Long): GtkPackType = a.toUInt
  val GTK_PACK_START = define(0)
  val GTK_PACK_END = define(1)
  inline def getName(inline value: GtkPackType): Option[String] =
    inline value match
      case GTK_PACK_START => Some("GTK_PACK_START")
      case GTK_PACK_END => Some("GTK_PACK_END")
      case _ => None
  extension (a: GtkPackType)
    inline def &(b: GtkPackType): GtkPackType = a & b
    inline def |(b: GtkPackType): GtkPackType = a | b
    inline def is(b: GtkPackType): Boolean = (a & b) == b

/**
 * GtkPadActionType: _PAD_ACTION_BUTTON: Action is triggered by a pad button _PAD_ACTION_RING: Action is triggered by a pad ring _PAD_ACTION_STRIP: Action is triggered by a pad strip
*/
opaque type GtkPadActionType = CUnsignedInt
object GtkPadActionType extends CEnumU[GtkPadActionType]:
  given _tag: Tag[GtkPadActionType] = Tag.UInt
  inline def define(inline a: Long): GtkPadActionType = a.toUInt
  val GTK_PAD_ACTION_BUTTON = define(0)
  val GTK_PAD_ACTION_RING = define(1)
  val GTK_PAD_ACTION_STRIP = define(2)
  inline def getName(inline value: GtkPadActionType): Option[String] =
    inline value match
      case GTK_PAD_ACTION_BUTTON => Some("GTK_PAD_ACTION_BUTTON")
      case GTK_PAD_ACTION_RING => Some("GTK_PAD_ACTION_RING")
      case GTK_PAD_ACTION_STRIP => Some("GTK_PAD_ACTION_STRIP")
      case _ => None
  extension (a: GtkPadActionType)
    inline def &(b: GtkPadActionType): GtkPadActionType = a & b
    inline def |(b: GtkPadActionType): GtkPadActionType = a | b
    inline def is(b: GtkPadActionType): Boolean = (a & b) == b

/**
 * GtkPageOrientation: _PAGE_ORIENTATION_PORTRAIT: Portrait mode. _PAGE_ORIENTATION_LANDSCAPE: Landscape mode. _PAGE_ORIENTATION_REVERSE_PORTRAIT: Reverse portrait mode. _PAGE_ORIENTATION_REVERSE_LANDSCAPE: Reverse landscape mode.
*/
opaque type GtkPageOrientation = CUnsignedInt
object GtkPageOrientation extends CEnumU[GtkPageOrientation]:
  given _tag: Tag[GtkPageOrientation] = Tag.UInt
  inline def define(inline a: Long): GtkPageOrientation = a.toUInt
  val GTK_PAGE_ORIENTATION_PORTRAIT = define(0)
  val GTK_PAGE_ORIENTATION_LANDSCAPE = define(1)
  val GTK_PAGE_ORIENTATION_REVERSE_PORTRAIT = define(2)
  val GTK_PAGE_ORIENTATION_REVERSE_LANDSCAPE = define(3)
  inline def getName(inline value: GtkPageOrientation): Option[String] =
    inline value match
      case GTK_PAGE_ORIENTATION_PORTRAIT => Some("GTK_PAGE_ORIENTATION_PORTRAIT")
      case GTK_PAGE_ORIENTATION_LANDSCAPE => Some("GTK_PAGE_ORIENTATION_LANDSCAPE")
      case GTK_PAGE_ORIENTATION_REVERSE_PORTRAIT => Some("GTK_PAGE_ORIENTATION_REVERSE_PORTRAIT")
      case GTK_PAGE_ORIENTATION_REVERSE_LANDSCAPE => Some("GTK_PAGE_ORIENTATION_REVERSE_LANDSCAPE")
      case _ => None
  extension (a: GtkPageOrientation)
    inline def &(b: GtkPageOrientation): GtkPageOrientation = a & b
    inline def |(b: GtkPageOrientation): GtkPageOrientation = a | b
    inline def is(b: GtkPageOrientation): Boolean = (a & b) == b

/**
 * GtkPageSet: _PAGE_SET_ALL: All pages. _PAGE_SET_EVEN: Even pages. _PAGE_SET_ODD: Odd pages.
*/
opaque type GtkPageSet = CUnsignedInt
object GtkPageSet extends CEnumU[GtkPageSet]:
  given _tag: Tag[GtkPageSet] = Tag.UInt
  inline def define(inline a: Long): GtkPageSet = a.toUInt
  val GTK_PAGE_SET_ALL = define(0)
  val GTK_PAGE_SET_EVEN = define(1)
  val GTK_PAGE_SET_ODD = define(2)
  inline def getName(inline value: GtkPageSet): Option[String] =
    inline value match
      case GTK_PAGE_SET_ALL => Some("GTK_PAGE_SET_ALL")
      case GTK_PAGE_SET_EVEN => Some("GTK_PAGE_SET_EVEN")
      case GTK_PAGE_SET_ODD => Some("GTK_PAGE_SET_ODD")
      case _ => None
  extension (a: GtkPageSet)
    inline def &(b: GtkPageSet): GtkPageSet = a & b
    inline def |(b: GtkPageSet): GtkPageSet = a | b
    inline def is(b: GtkPageSet): Boolean = (a & b) == b

/**
 * GtkPanDirection: _PAN_DIRECTION_LEFT: panned towards the left _PAN_DIRECTION_RIGHT: panned towards the right _PAN_DIRECTION_UP: panned upwards _PAN_DIRECTION_DOWN: panned downwards
*/
opaque type GtkPanDirection = CUnsignedInt
object GtkPanDirection extends CEnumU[GtkPanDirection]:
  given _tag: Tag[GtkPanDirection] = Tag.UInt
  inline def define(inline a: Long): GtkPanDirection = a.toUInt
  val GTK_PAN_DIRECTION_LEFT = define(0)
  val GTK_PAN_DIRECTION_RIGHT = define(1)
  val GTK_PAN_DIRECTION_UP = define(2)
  val GTK_PAN_DIRECTION_DOWN = define(3)
  inline def getName(inline value: GtkPanDirection): Option[String] =
    inline value match
      case GTK_PAN_DIRECTION_LEFT => Some("GTK_PAN_DIRECTION_LEFT")
      case GTK_PAN_DIRECTION_RIGHT => Some("GTK_PAN_DIRECTION_RIGHT")
      case GTK_PAN_DIRECTION_UP => Some("GTK_PAN_DIRECTION_UP")
      case GTK_PAN_DIRECTION_DOWN => Some("GTK_PAN_DIRECTION_DOWN")
      case _ => None
  extension (a: GtkPanDirection)
    inline def &(b: GtkPanDirection): GtkPanDirection = a & b
    inline def |(b: GtkPanDirection): GtkPanDirection = a | b
    inline def is(b: GtkPanDirection): Boolean = (a & b) == b

/**
 * GtkPickFlags: _PICK_DEFAULT: The default behavior, include widgets that are receiving events _PICK_INSENSITIVE: Include widgets that are insensitive _PICK_NON_TARGETABLE: Include widgets that are marked as non-targetable. See [property:can-target]
*/
opaque type GtkPickFlags = CUnsignedInt
object GtkPickFlags extends CEnumU[GtkPickFlags]:
  given _tag: Tag[GtkPickFlags] = Tag.UInt
  inline def define(inline a: Long): GtkPickFlags = a.toUInt
  val GTK_PICK_DEFAULT = define(0)
  val GTK_PICK_INSENSITIVE = define(1)
  val GTK_PICK_NON_TARGETABLE = define(2)
  inline def getName(inline value: GtkPickFlags): Option[String] =
    inline value match
      case GTK_PICK_DEFAULT => Some("GTK_PICK_DEFAULT")
      case GTK_PICK_INSENSITIVE => Some("GTK_PICK_INSENSITIVE")
      case GTK_PICK_NON_TARGETABLE => Some("GTK_PICK_NON_TARGETABLE")
      case _ => None
  extension (a: GtkPickFlags)
    inline def &(b: GtkPickFlags): GtkPickFlags = a & b
    inline def |(b: GtkPickFlags): GtkPickFlags = a | b
    inline def is(b: GtkPickFlags): Boolean = (a & b) == b

/**
 * GtkPolicyType: _POLICY_ALWAYS: The scrollbar is always visible. The view size is independent of the content. _POLICY_AUTOMATIC: The scrollbar will appear and disappear as necessary. For example, when all of a `GtkTreeView` can not be seen. _POLICY_NEVER: The scrollbar should never appear. In this mode the content determines the size. _POLICY_EXTERNAL: Don't show a scrollbar, but don't force the size to follow the content. This can be used e.g. to make multiple scrolled windows share a scrollbar.
*/
opaque type GtkPolicyType = CUnsignedInt
object GtkPolicyType extends CEnumU[GtkPolicyType]:
  given _tag: Tag[GtkPolicyType] = Tag.UInt
  inline def define(inline a: Long): GtkPolicyType = a.toUInt
  val GTK_POLICY_ALWAYS = define(0)
  val GTK_POLICY_AUTOMATIC = define(1)
  val GTK_POLICY_NEVER = define(2)
  val GTK_POLICY_EXTERNAL = define(3)
  inline def getName(inline value: GtkPolicyType): Option[String] =
    inline value match
      case GTK_POLICY_ALWAYS => Some("GTK_POLICY_ALWAYS")
      case GTK_POLICY_AUTOMATIC => Some("GTK_POLICY_AUTOMATIC")
      case GTK_POLICY_NEVER => Some("GTK_POLICY_NEVER")
      case GTK_POLICY_EXTERNAL => Some("GTK_POLICY_EXTERNAL")
      case _ => None
  extension (a: GtkPolicyType)
    inline def &(b: GtkPolicyType): GtkPolicyType = a & b
    inline def |(b: GtkPolicyType): GtkPolicyType = a | b
    inline def is(b: GtkPolicyType): Boolean = (a & b) == b

/**
 * GtkPopoverMenuFlags: _POPOVER_MENU_NESTED: Create submenus as nested popovers. Without this flag, submenus are created as sliding pages that replace the main menu.
*/
opaque type GtkPopoverMenuFlags = CUnsignedInt
object GtkPopoverMenuFlags extends CEnumU[GtkPopoverMenuFlags]:
  given _tag: Tag[GtkPopoverMenuFlags] = Tag.UInt
  inline def define(inline a: Long): GtkPopoverMenuFlags = a.toUInt
  val GTK_POPOVER_MENU_NESTED = define(1)
  inline def getName(inline value: GtkPopoverMenuFlags): Option[String] =
    inline value match
      case GTK_POPOVER_MENU_NESTED => Some("GTK_POPOVER_MENU_NESTED")
      case _ => None
  extension (a: GtkPopoverMenuFlags)
    inline def &(b: GtkPopoverMenuFlags): GtkPopoverMenuFlags = a & b
    inline def |(b: GtkPopoverMenuFlags): GtkPopoverMenuFlags = a | b
    inline def is(b: GtkPopoverMenuFlags): Boolean = (a & b) == b

/**
 * GtkPositionType: _POS_LEFT: The feature is at the left edge. _POS_RIGHT: The feature is at the right edge. _POS_TOP: The feature is at the top edge. _POS_BOTTOM: The feature is at the bottom edge.
*/
opaque type GtkPositionType = CUnsignedInt
object GtkPositionType extends CEnumU[GtkPositionType]:
  given _tag: Tag[GtkPositionType] = Tag.UInt
  inline def define(inline a: Long): GtkPositionType = a.toUInt
  val GTK_POS_LEFT = define(0)
  val GTK_POS_RIGHT = define(1)
  val GTK_POS_TOP = define(2)
  val GTK_POS_BOTTOM = define(3)
  inline def getName(inline value: GtkPositionType): Option[String] =
    inline value match
      case GTK_POS_LEFT => Some("GTK_POS_LEFT")
      case GTK_POS_RIGHT => Some("GTK_POS_RIGHT")
      case GTK_POS_TOP => Some("GTK_POS_TOP")
      case GTK_POS_BOTTOM => Some("GTK_POS_BOTTOM")
      case _ => None
  extension (a: GtkPositionType)
    inline def &(b: GtkPositionType): GtkPositionType = a & b
    inline def |(b: GtkPositionType): GtkPositionType = a | b
    inline def is(b: GtkPositionType): Boolean = (a & b) == b

/**
 * GtkPrintDuplex: _PRINT_DUPLEX_SIMPLEX: No duplex. _PRINT_DUPLEX_HORIZONTAL: Horizontal duplex. _PRINT_DUPLEX_VERTICAL: Vertical duplex.
*/
opaque type GtkPrintDuplex = CUnsignedInt
object GtkPrintDuplex extends CEnumU[GtkPrintDuplex]:
  given _tag: Tag[GtkPrintDuplex] = Tag.UInt
  inline def define(inline a: Long): GtkPrintDuplex = a.toUInt
  val GTK_PRINT_DUPLEX_SIMPLEX = define(0)
  val GTK_PRINT_DUPLEX_HORIZONTAL = define(1)
  val GTK_PRINT_DUPLEX_VERTICAL = define(2)
  inline def getName(inline value: GtkPrintDuplex): Option[String] =
    inline value match
      case GTK_PRINT_DUPLEX_SIMPLEX => Some("GTK_PRINT_DUPLEX_SIMPLEX")
      case GTK_PRINT_DUPLEX_HORIZONTAL => Some("GTK_PRINT_DUPLEX_HORIZONTAL")
      case GTK_PRINT_DUPLEX_VERTICAL => Some("GTK_PRINT_DUPLEX_VERTICAL")
      case _ => None
  extension (a: GtkPrintDuplex)
    inline def &(b: GtkPrintDuplex): GtkPrintDuplex = a & b
    inline def |(b: GtkPrintDuplex): GtkPrintDuplex = a | b
    inline def is(b: GtkPrintDuplex): Boolean = (a & b) == b

/**
 * GtkPrintError: _PRINT_ERROR_GENERAL: An unspecified error occurred. _PRINT_ERROR_INTERNAL_ERROR: An internal error occurred. _PRINT_ERROR_NOMEM: A memory allocation failed. _PRINT_ERROR_INVALID_FILE: An error occurred while loading a page setup or paper size from a key file.
*/
opaque type GtkPrintError = CUnsignedInt
object GtkPrintError extends CEnumU[GtkPrintError]:
  given _tag: Tag[GtkPrintError] = Tag.UInt
  inline def define(inline a: Long): GtkPrintError = a.toUInt
  val GTK_PRINT_ERROR_GENERAL = define(0)
  val GTK_PRINT_ERROR_INTERNAL_ERROR = define(1)
  val GTK_PRINT_ERROR_NOMEM = define(2)
  val GTK_PRINT_ERROR_INVALID_FILE = define(3)
  inline def getName(inline value: GtkPrintError): Option[String] =
    inline value match
      case GTK_PRINT_ERROR_GENERAL => Some("GTK_PRINT_ERROR_GENERAL")
      case GTK_PRINT_ERROR_INTERNAL_ERROR => Some("GTK_PRINT_ERROR_INTERNAL_ERROR")
      case GTK_PRINT_ERROR_NOMEM => Some("GTK_PRINT_ERROR_NOMEM")
      case GTK_PRINT_ERROR_INVALID_FILE => Some("GTK_PRINT_ERROR_INVALID_FILE")
      case _ => None
  extension (a: GtkPrintError)
    inline def &(b: GtkPrintError): GtkPrintError = a & b
    inline def |(b: GtkPrintError): GtkPrintError = a | b
    inline def is(b: GtkPrintError): Boolean = (a & b) == b

/**
 * GtkPrintOperationAction: _PRINT_OPERATION_ACTION_PRINT_DIALOG: Show the print dialog. _PRINT_OPERATION_ACTION_PRINT: Start to print without showing the print dialog, based on the current print settings. _PRINT_OPERATION_ACTION_PREVIEW: Show the print preview. _PRINT_OPERATION_ACTION_EXPORT: Export to a file. This requires the export-filename property to be set.
*/
opaque type GtkPrintOperationAction = CUnsignedInt
object GtkPrintOperationAction extends CEnumU[GtkPrintOperationAction]:
  given _tag: Tag[GtkPrintOperationAction] = Tag.UInt
  inline def define(inline a: Long): GtkPrintOperationAction = a.toUInt
  val GTK_PRINT_OPERATION_ACTION_PRINT_DIALOG = define(0)
  val GTK_PRINT_OPERATION_ACTION_PRINT = define(1)
  val GTK_PRINT_OPERATION_ACTION_PREVIEW = define(2)
  val GTK_PRINT_OPERATION_ACTION_EXPORT = define(3)
  inline def getName(inline value: GtkPrintOperationAction): Option[String] =
    inline value match
      case GTK_PRINT_OPERATION_ACTION_PRINT_DIALOG => Some("GTK_PRINT_OPERATION_ACTION_PRINT_DIALOG")
      case GTK_PRINT_OPERATION_ACTION_PRINT => Some("GTK_PRINT_OPERATION_ACTION_PRINT")
      case GTK_PRINT_OPERATION_ACTION_PREVIEW => Some("GTK_PRINT_OPERATION_ACTION_PREVIEW")
      case GTK_PRINT_OPERATION_ACTION_EXPORT => Some("GTK_PRINT_OPERATION_ACTION_EXPORT")
      case _ => None
  extension (a: GtkPrintOperationAction)
    inline def &(b: GtkPrintOperationAction): GtkPrintOperationAction = a & b
    inline def |(b: GtkPrintOperationAction): GtkPrintOperationAction = a | b
    inline def is(b: GtkPrintOperationAction): Boolean = (a & b) == b

/**
 * GtkPrintOperationResult: _PRINT_OPERATION_RESULT_ERROR: An error has occurred. _PRINT_OPERATION_RESULT_APPLY: The print settings should be stored. _PRINT_OPERATION_RESULT_CANCEL: The print operation has been canceled, the print settings should not be stored. _PRINT_OPERATION_RESULT_IN_PROGRESS: The print operation is not complete yet. This value will only be returned when running asynchronously.
*/
opaque type GtkPrintOperationResult = CUnsignedInt
object GtkPrintOperationResult extends CEnumU[GtkPrintOperationResult]:
  given _tag: Tag[GtkPrintOperationResult] = Tag.UInt
  inline def define(inline a: Long): GtkPrintOperationResult = a.toUInt
  val GTK_PRINT_OPERATION_RESULT_ERROR = define(0)
  val GTK_PRINT_OPERATION_RESULT_APPLY = define(1)
  val GTK_PRINT_OPERATION_RESULT_CANCEL = define(2)
  val GTK_PRINT_OPERATION_RESULT_IN_PROGRESS = define(3)
  inline def getName(inline value: GtkPrintOperationResult): Option[String] =
    inline value match
      case GTK_PRINT_OPERATION_RESULT_ERROR => Some("GTK_PRINT_OPERATION_RESULT_ERROR")
      case GTK_PRINT_OPERATION_RESULT_APPLY => Some("GTK_PRINT_OPERATION_RESULT_APPLY")
      case GTK_PRINT_OPERATION_RESULT_CANCEL => Some("GTK_PRINT_OPERATION_RESULT_CANCEL")
      case GTK_PRINT_OPERATION_RESULT_IN_PROGRESS => Some("GTK_PRINT_OPERATION_RESULT_IN_PROGRESS")
      case _ => None
  extension (a: GtkPrintOperationResult)
    inline def &(b: GtkPrintOperationResult): GtkPrintOperationResult = a & b
    inline def |(b: GtkPrintOperationResult): GtkPrintOperationResult = a | b
    inline def is(b: GtkPrintOperationResult): Boolean = (a & b) == b

/**
 * GtkPrintPages: _PRINT_PAGES_ALL: All pages. _PRINT_PAGES_CURRENT: Current page. _PRINT_PAGES_RANGES: Range of pages. _PRINT_PAGES_SELECTION: Selected pages.
*/
opaque type GtkPrintPages = CUnsignedInt
object GtkPrintPages extends CEnumU[GtkPrintPages]:
  given _tag: Tag[GtkPrintPages] = Tag.UInt
  inline def define(inline a: Long): GtkPrintPages = a.toUInt
  val GTK_PRINT_PAGES_ALL = define(0)
  val GTK_PRINT_PAGES_CURRENT = define(1)
  val GTK_PRINT_PAGES_RANGES = define(2)
  val GTK_PRINT_PAGES_SELECTION = define(3)
  inline def getName(inline value: GtkPrintPages): Option[String] =
    inline value match
      case GTK_PRINT_PAGES_ALL => Some("GTK_PRINT_PAGES_ALL")
      case GTK_PRINT_PAGES_CURRENT => Some("GTK_PRINT_PAGES_CURRENT")
      case GTK_PRINT_PAGES_RANGES => Some("GTK_PRINT_PAGES_RANGES")
      case GTK_PRINT_PAGES_SELECTION => Some("GTK_PRINT_PAGES_SELECTION")
      case _ => None
  extension (a: GtkPrintPages)
    inline def &(b: GtkPrintPages): GtkPrintPages = a & b
    inline def |(b: GtkPrintPages): GtkPrintPages = a | b
    inline def is(b: GtkPrintPages): Boolean = (a & b) == b

/**
 * GtkPrintQuality: _PRINT_QUALITY_LOW: Low quality. _PRINT_QUALITY_NORMAL: Normal quality. _PRINT_QUALITY_HIGH: High quality. _PRINT_QUALITY_DRAFT: Draft quality.
*/
opaque type GtkPrintQuality = CUnsignedInt
object GtkPrintQuality extends CEnumU[GtkPrintQuality]:
  given _tag: Tag[GtkPrintQuality] = Tag.UInt
  inline def define(inline a: Long): GtkPrintQuality = a.toUInt
  val GTK_PRINT_QUALITY_LOW = define(0)
  val GTK_PRINT_QUALITY_NORMAL = define(1)
  val GTK_PRINT_QUALITY_HIGH = define(2)
  val GTK_PRINT_QUALITY_DRAFT = define(3)
  inline def getName(inline value: GtkPrintQuality): Option[String] =
    inline value match
      case GTK_PRINT_QUALITY_LOW => Some("GTK_PRINT_QUALITY_LOW")
      case GTK_PRINT_QUALITY_NORMAL => Some("GTK_PRINT_QUALITY_NORMAL")
      case GTK_PRINT_QUALITY_HIGH => Some("GTK_PRINT_QUALITY_HIGH")
      case GTK_PRINT_QUALITY_DRAFT => Some("GTK_PRINT_QUALITY_DRAFT")
      case _ => None
  extension (a: GtkPrintQuality)
    inline def &(b: GtkPrintQuality): GtkPrintQuality = a & b
    inline def |(b: GtkPrintQuality): GtkPrintQuality = a | b
    inline def is(b: GtkPrintQuality): Boolean = (a & b) == b

/**
 * GtkPrintStatus: _PRINT_STATUS_INITIAL: The printing has not started yet; this status is set initially, and while the print dialog is shown. _PRINT_STATUS_PREPARING: This status is set while the begin-print signal is emitted and during pagination. _PRINT_STATUS_GENERATING_DATA: This status is set while the pages are being rendered. _PRINT_STATUS_SENDING_DATA: The print job is being sent off to the printer. _PRINT_STATUS_PENDING: The print job has been sent to the printer, but is not printed for some reason, e.g. the printer may be stopped. _PRINT_STATUS_PENDING_ISSUE: Some problem has occurred during printing, e.g. a paper jam. _PRINT_STATUS_PRINTING: The printer is processing the print job. _PRINT_STATUS_FINISHED: The printing has been completed successfully. _PRINT_STATUS_FINISHED_ABORTED: The printing has been aborted.
*/
opaque type GtkPrintStatus = CUnsignedInt
object GtkPrintStatus extends CEnumU[GtkPrintStatus]:
  given _tag: Tag[GtkPrintStatus] = Tag.UInt
  inline def define(inline a: Long): GtkPrintStatus = a.toUInt
  val GTK_PRINT_STATUS_INITIAL = define(0)
  val GTK_PRINT_STATUS_PREPARING = define(1)
  val GTK_PRINT_STATUS_GENERATING_DATA = define(2)
  val GTK_PRINT_STATUS_SENDING_DATA = define(3)
  val GTK_PRINT_STATUS_PENDING = define(4)
  val GTK_PRINT_STATUS_PENDING_ISSUE = define(5)
  val GTK_PRINT_STATUS_PRINTING = define(6)
  val GTK_PRINT_STATUS_FINISHED = define(7)
  val GTK_PRINT_STATUS_FINISHED_ABORTED = define(8)
  inline def getName(inline value: GtkPrintStatus): Option[String] =
    inline value match
      case GTK_PRINT_STATUS_INITIAL => Some("GTK_PRINT_STATUS_INITIAL")
      case GTK_PRINT_STATUS_PREPARING => Some("GTK_PRINT_STATUS_PREPARING")
      case GTK_PRINT_STATUS_GENERATING_DATA => Some("GTK_PRINT_STATUS_GENERATING_DATA")
      case GTK_PRINT_STATUS_SENDING_DATA => Some("GTK_PRINT_STATUS_SENDING_DATA")
      case GTK_PRINT_STATUS_PENDING => Some("GTK_PRINT_STATUS_PENDING")
      case GTK_PRINT_STATUS_PENDING_ISSUE => Some("GTK_PRINT_STATUS_PENDING_ISSUE")
      case GTK_PRINT_STATUS_PRINTING => Some("GTK_PRINT_STATUS_PRINTING")
      case GTK_PRINT_STATUS_FINISHED => Some("GTK_PRINT_STATUS_FINISHED")
      case GTK_PRINT_STATUS_FINISHED_ABORTED => Some("GTK_PRINT_STATUS_FINISHED_ABORTED")
      case _ => None
  extension (a: GtkPrintStatus)
    inline def &(b: GtkPrintStatus): GtkPrintStatus = a & b
    inline def |(b: GtkPrintStatus): GtkPrintStatus = a | b
    inline def is(b: GtkPrintStatus): Boolean = (a & b) == b

/**
 * GtkPropagationLimit: _LIMIT_NONE: Events are handled regardless of what their target is. _LIMIT_SAME_NATIVE: Events are only handled if their target is in the same [iface] as the event controllers widget. Note that some event types have two targets (origin and destination).
*/
opaque type GtkPropagationLimit = CUnsignedInt
object GtkPropagationLimit extends CEnumU[GtkPropagationLimit]:
  given _tag: Tag[GtkPropagationLimit] = Tag.UInt
  inline def define(inline a: Long): GtkPropagationLimit = a.toUInt
  val GTK_LIMIT_NONE = define(0)
  val GTK_LIMIT_SAME_NATIVE = define(1)
  inline def getName(inline value: GtkPropagationLimit): Option[String] =
    inline value match
      case GTK_LIMIT_NONE => Some("GTK_LIMIT_NONE")
      case GTK_LIMIT_SAME_NATIVE => Some("GTK_LIMIT_SAME_NATIVE")
      case _ => None
  extension (a: GtkPropagationLimit)
    inline def &(b: GtkPropagationLimit): GtkPropagationLimit = a & b
    inline def |(b: GtkPropagationLimit): GtkPropagationLimit = a | b
    inline def is(b: GtkPropagationLimit): Boolean = (a & b) == b

/**
 * GtkPropagationPhase: _PHASE_NONE: Events are not delivered. _PHASE_CAPTURE: Events are delivered in the capture phase. The capture phase happens before the bubble phase, runs from the toplevel down to the event widget. This option should only be used on containers that might possibly handle events before their children do. _PHASE_BUBBLE: Events are delivered in the bubble phase. The bubble phase happens after the capture phase, and before the default handlers are run. This phase runs from the event widget, up to the toplevel. _PHASE_TARGET: Events are delivered in the default widget event handlers, note that widget implementations must chain up on button, motion, touch and grab broken handlers for controllers in this phase to be run.
*/
opaque type GtkPropagationPhase = CUnsignedInt
object GtkPropagationPhase extends CEnumU[GtkPropagationPhase]:
  given _tag: Tag[GtkPropagationPhase] = Tag.UInt
  inline def define(inline a: Long): GtkPropagationPhase = a.toUInt
  val GTK_PHASE_NONE = define(0)
  val GTK_PHASE_CAPTURE = define(1)
  val GTK_PHASE_BUBBLE = define(2)
  val GTK_PHASE_TARGET = define(3)
  inline def getName(inline value: GtkPropagationPhase): Option[String] =
    inline value match
      case GTK_PHASE_NONE => Some("GTK_PHASE_NONE")
      case GTK_PHASE_CAPTURE => Some("GTK_PHASE_CAPTURE")
      case GTK_PHASE_BUBBLE => Some("GTK_PHASE_BUBBLE")
      case GTK_PHASE_TARGET => Some("GTK_PHASE_TARGET")
      case _ => None
  extension (a: GtkPropagationPhase)
    inline def &(b: GtkPropagationPhase): GtkPropagationPhase = a & b
    inline def |(b: GtkPropagationPhase): GtkPropagationPhase = a | b
    inline def is(b: GtkPropagationPhase): Boolean = (a & b) == b

/**
 * GtkRecentManagerError: _RECENT_MANAGER_ERROR_NOT_FOUND: the URI specified does not exists in the recently used resources list. _RECENT_MANAGER_ERROR_INVALID_URI: the URI specified is not valid. _RECENT_MANAGER_ERROR_INVALID_ENCODING: the supplied string is not UTF-8 encoded. _RECENT_MANAGER_ERROR_NOT_REGISTERED: no application has registered the specified item. _RECENT_MANAGER_ERROR_READ: failure while reading the recently used resources file. _RECENT_MANAGER_ERROR_WRITE: failure while writing the recently used resources file. _RECENT_MANAGER_ERROR_UNKNOWN: unspecified error.
*/
opaque type GtkRecentManagerError = CUnsignedInt
object GtkRecentManagerError extends CEnumU[GtkRecentManagerError]:
  given _tag: Tag[GtkRecentManagerError] = Tag.UInt
  inline def define(inline a: Long): GtkRecentManagerError = a.toUInt
  val GTK_RECENT_MANAGER_ERROR_NOT_FOUND = define(0)
  val GTK_RECENT_MANAGER_ERROR_INVALID_URI = define(1)
  val GTK_RECENT_MANAGER_ERROR_INVALID_ENCODING = define(2)
  val GTK_RECENT_MANAGER_ERROR_NOT_REGISTERED = define(3)
  val GTK_RECENT_MANAGER_ERROR_READ = define(4)
  val GTK_RECENT_MANAGER_ERROR_WRITE = define(5)
  val GTK_RECENT_MANAGER_ERROR_UNKNOWN = define(6)
  inline def getName(inline value: GtkRecentManagerError): Option[String] =
    inline value match
      case GTK_RECENT_MANAGER_ERROR_NOT_FOUND => Some("GTK_RECENT_MANAGER_ERROR_NOT_FOUND")
      case GTK_RECENT_MANAGER_ERROR_INVALID_URI => Some("GTK_RECENT_MANAGER_ERROR_INVALID_URI")
      case GTK_RECENT_MANAGER_ERROR_INVALID_ENCODING => Some("GTK_RECENT_MANAGER_ERROR_INVALID_ENCODING")
      case GTK_RECENT_MANAGER_ERROR_NOT_REGISTERED => Some("GTK_RECENT_MANAGER_ERROR_NOT_REGISTERED")
      case GTK_RECENT_MANAGER_ERROR_READ => Some("GTK_RECENT_MANAGER_ERROR_READ")
      case GTK_RECENT_MANAGER_ERROR_WRITE => Some("GTK_RECENT_MANAGER_ERROR_WRITE")
      case GTK_RECENT_MANAGER_ERROR_UNKNOWN => Some("GTK_RECENT_MANAGER_ERROR_UNKNOWN")
      case _ => None
  extension (a: GtkRecentManagerError)
    inline def &(b: GtkRecentManagerError): GtkRecentManagerError = a & b
    inline def |(b: GtkRecentManagerError): GtkRecentManagerError = a | b
    inline def is(b: GtkRecentManagerError): Boolean = (a & b) == b

/**
 * GtkResponseType: _RESPONSE_NONE: Returned if an action widget has no response id, or if the dialog gets programmatically hidden or destroyed _RESPONSE_REJECT: Generic response id, not used by GTK dialogs _RESPONSE_ACCEPT: Generic response id, not used by GTK dialogs _RESPONSE_DELETE_EVENT: Returned if the dialog is deleted _RESPONSE_OK: Returned by OK buttons in GTK dialogs _RESPONSE_CANCEL: Returned by Cancel buttons in GTK dialogs _RESPONSE_CLOSE: Returned by Close buttons in GTK dialogs _RESPONSE_YES: Returned by Yes buttons in GTK dialogs _RESPONSE_NO: Returned by No buttons in GTK dialogs _RESPONSE_APPLY: Returned by Apply buttons in GTK dialogs _RESPONSE_HELP: Returned by Help buttons in GTK dialogs
*/
opaque type GtkResponseType = CInt
object GtkResponseType extends CEnum[GtkResponseType]:
  given _tag: Tag[GtkResponseType] = Tag.Int
  inline def define(inline a: CInt): GtkResponseType = a
  val GTK_RESPONSE_NONE = define(-1)
  val GTK_RESPONSE_REJECT = define(-2)
  val GTK_RESPONSE_ACCEPT = define(-3)
  val GTK_RESPONSE_DELETE_EVENT = define(-4)
  val GTK_RESPONSE_OK = define(-5)
  val GTK_RESPONSE_CANCEL = define(-6)
  val GTK_RESPONSE_CLOSE = define(-7)
  val GTK_RESPONSE_YES = define(-8)
  val GTK_RESPONSE_NO = define(-9)
  val GTK_RESPONSE_APPLY = define(-10)
  val GTK_RESPONSE_HELP = define(-11)
  inline def getName(inline value: GtkResponseType): Option[String] =
    inline value match
      case GTK_RESPONSE_NONE => Some("GTK_RESPONSE_NONE")
      case GTK_RESPONSE_REJECT => Some("GTK_RESPONSE_REJECT")
      case GTK_RESPONSE_ACCEPT => Some("GTK_RESPONSE_ACCEPT")
      case GTK_RESPONSE_DELETE_EVENT => Some("GTK_RESPONSE_DELETE_EVENT")
      case GTK_RESPONSE_OK => Some("GTK_RESPONSE_OK")
      case GTK_RESPONSE_CANCEL => Some("GTK_RESPONSE_CANCEL")
      case GTK_RESPONSE_CLOSE => Some("GTK_RESPONSE_CLOSE")
      case GTK_RESPONSE_YES => Some("GTK_RESPONSE_YES")
      case GTK_RESPONSE_NO => Some("GTK_RESPONSE_NO")
      case GTK_RESPONSE_APPLY => Some("GTK_RESPONSE_APPLY")
      case GTK_RESPONSE_HELP => Some("GTK_RESPONSE_HELP")
      case _ => None
  extension (a: GtkResponseType)
    inline def &(b: GtkResponseType): GtkResponseType = a & b
    inline def |(b: GtkResponseType): GtkResponseType = a | b
    inline def is(b: GtkResponseType): Boolean = (a & b) == b

/**
*/
opaque type GtkRevealerTransitionType = CUnsignedInt
object GtkRevealerTransitionType extends CEnumU[GtkRevealerTransitionType]:
  given _tag: Tag[GtkRevealerTransitionType] = Tag.UInt
  inline def define(inline a: Long): GtkRevealerTransitionType = a.toUInt
  val GTK_REVEALER_TRANSITION_TYPE_NONE = define(0)
  val GTK_REVEALER_TRANSITION_TYPE_CROSSFADE = define(1)
  val GTK_REVEALER_TRANSITION_TYPE_SLIDE_RIGHT = define(2)
  val GTK_REVEALER_TRANSITION_TYPE_SLIDE_LEFT = define(3)
  val GTK_REVEALER_TRANSITION_TYPE_SLIDE_UP = define(4)
  val GTK_REVEALER_TRANSITION_TYPE_SLIDE_DOWN = define(5)
  val GTK_REVEALER_TRANSITION_TYPE_SWING_RIGHT = define(6)
  val GTK_REVEALER_TRANSITION_TYPE_SWING_LEFT = define(7)
  val GTK_REVEALER_TRANSITION_TYPE_SWING_UP = define(8)
  val GTK_REVEALER_TRANSITION_TYPE_SWING_DOWN = define(9)
  inline def getName(inline value: GtkRevealerTransitionType): Option[String] =
    inline value match
      case GTK_REVEALER_TRANSITION_TYPE_NONE => Some("GTK_REVEALER_TRANSITION_TYPE_NONE")
      case GTK_REVEALER_TRANSITION_TYPE_CROSSFADE => Some("GTK_REVEALER_TRANSITION_TYPE_CROSSFADE")
      case GTK_REVEALER_TRANSITION_TYPE_SLIDE_RIGHT => Some("GTK_REVEALER_TRANSITION_TYPE_SLIDE_RIGHT")
      case GTK_REVEALER_TRANSITION_TYPE_SLIDE_LEFT => Some("GTK_REVEALER_TRANSITION_TYPE_SLIDE_LEFT")
      case GTK_REVEALER_TRANSITION_TYPE_SLIDE_UP => Some("GTK_REVEALER_TRANSITION_TYPE_SLIDE_UP")
      case GTK_REVEALER_TRANSITION_TYPE_SLIDE_DOWN => Some("GTK_REVEALER_TRANSITION_TYPE_SLIDE_DOWN")
      case GTK_REVEALER_TRANSITION_TYPE_SWING_RIGHT => Some("GTK_REVEALER_TRANSITION_TYPE_SWING_RIGHT")
      case GTK_REVEALER_TRANSITION_TYPE_SWING_LEFT => Some("GTK_REVEALER_TRANSITION_TYPE_SWING_LEFT")
      case GTK_REVEALER_TRANSITION_TYPE_SWING_UP => Some("GTK_REVEALER_TRANSITION_TYPE_SWING_UP")
      case GTK_REVEALER_TRANSITION_TYPE_SWING_DOWN => Some("GTK_REVEALER_TRANSITION_TYPE_SWING_DOWN")
      case _ => None
  extension (a: GtkRevealerTransitionType)
    inline def &(b: GtkRevealerTransitionType): GtkRevealerTransitionType = a & b
    inline def |(b: GtkRevealerTransitionType): GtkRevealerTransitionType = a | b
    inline def is(b: GtkRevealerTransitionType): Boolean = (a & b) == b

/**
 * GtkScrollStep: _SCROLL_STEPS: Scroll in steps. _SCROLL_PAGES: Scroll by pages. _SCROLL_ENDS: Scroll to ends. _SCROLL_HORIZONTAL_STEPS: Scroll in horizontal steps. _SCROLL_HORIZONTAL_PAGES: Scroll by horizontal pages. _SCROLL_HORIZONTAL_ENDS: Scroll to the horizontal ends.
*/
opaque type GtkScrollStep = CUnsignedInt
object GtkScrollStep extends CEnumU[GtkScrollStep]:
  given _tag: Tag[GtkScrollStep] = Tag.UInt
  inline def define(inline a: Long): GtkScrollStep = a.toUInt
  val GTK_SCROLL_STEPS = define(0)
  val GTK_SCROLL_PAGES = define(1)
  val GTK_SCROLL_ENDS = define(2)
  val GTK_SCROLL_HORIZONTAL_STEPS = define(3)
  val GTK_SCROLL_HORIZONTAL_PAGES = define(4)
  val GTK_SCROLL_HORIZONTAL_ENDS = define(5)
  inline def getName(inline value: GtkScrollStep): Option[String] =
    inline value match
      case GTK_SCROLL_STEPS => Some("GTK_SCROLL_STEPS")
      case GTK_SCROLL_PAGES => Some("GTK_SCROLL_PAGES")
      case GTK_SCROLL_ENDS => Some("GTK_SCROLL_ENDS")
      case GTK_SCROLL_HORIZONTAL_STEPS => Some("GTK_SCROLL_HORIZONTAL_STEPS")
      case GTK_SCROLL_HORIZONTAL_PAGES => Some("GTK_SCROLL_HORIZONTAL_PAGES")
      case GTK_SCROLL_HORIZONTAL_ENDS => Some("GTK_SCROLL_HORIZONTAL_ENDS")
      case _ => None
  extension (a: GtkScrollStep)
    inline def &(b: GtkScrollStep): GtkScrollStep = a & b
    inline def |(b: GtkScrollStep): GtkScrollStep = a | b
    inline def is(b: GtkScrollStep): Boolean = (a & b) == b

/**
 * GtkScrollType: _SCROLL_NONE: No scrolling. _SCROLL_JUMP: Jump to new location. _SCROLL_STEP_BACKWARD: Step backward. _SCROLL_STEP_FORWARD: Step forward. _SCROLL_PAGE_BACKWARD: Page backward. _SCROLL_PAGE_FORWARD: Page forward. _SCROLL_STEP_UP: Step up. _SCROLL_STEP_DOWN: Step down. _SCROLL_PAGE_UP: Page up. _SCROLL_PAGE_DOWN: Page down. _SCROLL_STEP_LEFT: Step to the left. _SCROLL_STEP_RIGHT: Step to the right. _SCROLL_PAGE_LEFT: Page to the left. _SCROLL_PAGE_RIGHT: Page to the right. _SCROLL_START: Scroll to start. _SCROLL_END: Scroll to end.
*/
opaque type GtkScrollType = CUnsignedInt
object GtkScrollType extends CEnumU[GtkScrollType]:
  given _tag: Tag[GtkScrollType] = Tag.UInt
  inline def define(inline a: Long): GtkScrollType = a.toUInt
  val GTK_SCROLL_NONE = define(0)
  val GTK_SCROLL_JUMP = define(1)
  val GTK_SCROLL_STEP_BACKWARD = define(2)
  val GTK_SCROLL_STEP_FORWARD = define(3)
  val GTK_SCROLL_PAGE_BACKWARD = define(4)
  val GTK_SCROLL_PAGE_FORWARD = define(5)
  val GTK_SCROLL_STEP_UP = define(6)
  val GTK_SCROLL_STEP_DOWN = define(7)
  val GTK_SCROLL_PAGE_UP = define(8)
  val GTK_SCROLL_PAGE_DOWN = define(9)
  val GTK_SCROLL_STEP_LEFT = define(10)
  val GTK_SCROLL_STEP_RIGHT = define(11)
  val GTK_SCROLL_PAGE_LEFT = define(12)
  val GTK_SCROLL_PAGE_RIGHT = define(13)
  val GTK_SCROLL_START = define(14)
  val GTK_SCROLL_END = define(15)
  inline def getName(inline value: GtkScrollType): Option[String] =
    inline value match
      case GTK_SCROLL_NONE => Some("GTK_SCROLL_NONE")
      case GTK_SCROLL_JUMP => Some("GTK_SCROLL_JUMP")
      case GTK_SCROLL_STEP_BACKWARD => Some("GTK_SCROLL_STEP_BACKWARD")
      case GTK_SCROLL_STEP_FORWARD => Some("GTK_SCROLL_STEP_FORWARD")
      case GTK_SCROLL_PAGE_BACKWARD => Some("GTK_SCROLL_PAGE_BACKWARD")
      case GTK_SCROLL_PAGE_FORWARD => Some("GTK_SCROLL_PAGE_FORWARD")
      case GTK_SCROLL_STEP_UP => Some("GTK_SCROLL_STEP_UP")
      case GTK_SCROLL_STEP_DOWN => Some("GTK_SCROLL_STEP_DOWN")
      case GTK_SCROLL_PAGE_UP => Some("GTK_SCROLL_PAGE_UP")
      case GTK_SCROLL_PAGE_DOWN => Some("GTK_SCROLL_PAGE_DOWN")
      case GTK_SCROLL_STEP_LEFT => Some("GTK_SCROLL_STEP_LEFT")
      case GTK_SCROLL_STEP_RIGHT => Some("GTK_SCROLL_STEP_RIGHT")
      case GTK_SCROLL_PAGE_LEFT => Some("GTK_SCROLL_PAGE_LEFT")
      case GTK_SCROLL_PAGE_RIGHT => Some("GTK_SCROLL_PAGE_RIGHT")
      case GTK_SCROLL_START => Some("GTK_SCROLL_START")
      case GTK_SCROLL_END => Some("GTK_SCROLL_END")
      case _ => None
  extension (a: GtkScrollType)
    inline def &(b: GtkScrollType): GtkScrollType = a & b
    inline def |(b: GtkScrollType): GtkScrollType = a | b
    inline def is(b: GtkScrollType): Boolean = (a & b) == b

/**
 * GtkScrollablePolicy: _SCROLL_MINIMUM: Scrollable adjustments are based on the minimum size _SCROLL_NATURAL: Scrollable adjustments are based on the natural size
*/
opaque type GtkScrollablePolicy = CUnsignedInt
object GtkScrollablePolicy extends CEnumU[GtkScrollablePolicy]:
  given _tag: Tag[GtkScrollablePolicy] = Tag.UInt
  inline def define(inline a: Long): GtkScrollablePolicy = a.toUInt
  val GTK_SCROLL_MINIMUM = define(0)
  val GTK_SCROLL_NATURAL = define(1)
  inline def getName(inline value: GtkScrollablePolicy): Option[String] =
    inline value match
      case GTK_SCROLL_MINIMUM => Some("GTK_SCROLL_MINIMUM")
      case GTK_SCROLL_NATURAL => Some("GTK_SCROLL_NATURAL")
      case _ => None
  extension (a: GtkScrollablePolicy)
    inline def &(b: GtkScrollablePolicy): GtkScrollablePolicy = a & b
    inline def |(b: GtkScrollablePolicy): GtkScrollablePolicy = a | b
    inline def is(b: GtkScrollablePolicy): Boolean = (a & b) == b

/**
 * GtkSelectionMode: _SELECTION_NONE: No selection is possible. _SELECTION_SINGLE: Zero or one element may be selected. _SELECTION_BROWSE: Exactly one element is selected. In some circumstances, such as initially or during a search operation, it’s possible for no element to be selected with %GTK_SELECTION_BROWSE. What is really enforced is that the user can’t deselect a currently selected element except by selecting another element. _SELECTION_MULTIPLE: Any number of elements may be selected. The Ctrl key may be used to enlarge the selection, and Shift key to select between the focus and the child pointed to. Some widgets may also allow Click-drag to select a range of elements.
*/
opaque type GtkSelectionMode = CUnsignedInt
object GtkSelectionMode extends CEnumU[GtkSelectionMode]:
  given _tag: Tag[GtkSelectionMode] = Tag.UInt
  inline def define(inline a: Long): GtkSelectionMode = a.toUInt
  val GTK_SELECTION_NONE = define(0)
  val GTK_SELECTION_SINGLE = define(1)
  val GTK_SELECTION_BROWSE = define(2)
  val GTK_SELECTION_MULTIPLE = define(3)
  inline def getName(inline value: GtkSelectionMode): Option[String] =
    inline value match
      case GTK_SELECTION_NONE => Some("GTK_SELECTION_NONE")
      case GTK_SELECTION_SINGLE => Some("GTK_SELECTION_SINGLE")
      case GTK_SELECTION_BROWSE => Some("GTK_SELECTION_BROWSE")
      case GTK_SELECTION_MULTIPLE => Some("GTK_SELECTION_MULTIPLE")
      case _ => None
  extension (a: GtkSelectionMode)
    inline def &(b: GtkSelectionMode): GtkSelectionMode = a & b
    inline def |(b: GtkSelectionMode): GtkSelectionMode = a | b
    inline def is(b: GtkSelectionMode): Boolean = (a & b) == b

/**
 * GtkSensitivityType: _SENSITIVITY_AUTO: The control is made insensitive if no action can be triggered _SENSITIVITY_ON: The control is always sensitive _SENSITIVITY_OFF: The control is always insensitive
*/
opaque type GtkSensitivityType = CUnsignedInt
object GtkSensitivityType extends CEnumU[GtkSensitivityType]:
  given _tag: Tag[GtkSensitivityType] = Tag.UInt
  inline def define(inline a: Long): GtkSensitivityType = a.toUInt
  val GTK_SENSITIVITY_AUTO = define(0)
  val GTK_SENSITIVITY_ON = define(1)
  val GTK_SENSITIVITY_OFF = define(2)
  inline def getName(inline value: GtkSensitivityType): Option[String] =
    inline value match
      case GTK_SENSITIVITY_AUTO => Some("GTK_SENSITIVITY_AUTO")
      case GTK_SENSITIVITY_ON => Some("GTK_SENSITIVITY_ON")
      case GTK_SENSITIVITY_OFF => Some("GTK_SENSITIVITY_OFF")
      case _ => None
  extension (a: GtkSensitivityType)
    inline def &(b: GtkSensitivityType): GtkSensitivityType = a & b
    inline def |(b: GtkSensitivityType): GtkSensitivityType = a | b
    inline def is(b: GtkSensitivityType): Boolean = (a & b) == b

/**
 * GtkShortcutActionFlags: _SHORTCUT_ACTION_EXCLUSIVE: The action is the only action that can be activated. If this flag is not set, a future activation may select a different action.
*/
opaque type GtkShortcutActionFlags = CUnsignedInt
object GtkShortcutActionFlags extends CEnumU[GtkShortcutActionFlags]:
  given _tag: Tag[GtkShortcutActionFlags] = Tag.UInt
  inline def define(inline a: Long): GtkShortcutActionFlags = a.toUInt
  val GTK_SHORTCUT_ACTION_EXCLUSIVE = define(1)
  inline def getName(inline value: GtkShortcutActionFlags): Option[String] =
    inline value match
      case GTK_SHORTCUT_ACTION_EXCLUSIVE => Some("GTK_SHORTCUT_ACTION_EXCLUSIVE")
      case _ => None
  extension (a: GtkShortcutActionFlags)
    inline def &(b: GtkShortcutActionFlags): GtkShortcutActionFlags = a & b
    inline def |(b: GtkShortcutActionFlags): GtkShortcutActionFlags = a | b
    inline def is(b: GtkShortcutActionFlags): Boolean = (a & b) == b

/**
 * GtkShortcutScope: _SHORTCUT_SCOPE_LOCAL: Shortcuts are handled inside the widget the controller belongs to. _SHORTCUT_SCOPE_MANAGED: Shortcuts are handled by the first ancestor that is a [iface] _SHORTCUT_SCOPE_GLOBAL: Shortcuts are handled by the root widget.
*/
opaque type GtkShortcutScope = CUnsignedInt
object GtkShortcutScope extends CEnumU[GtkShortcutScope]:
  given _tag: Tag[GtkShortcutScope] = Tag.UInt
  inline def define(inline a: Long): GtkShortcutScope = a.toUInt
  val GTK_SHORTCUT_SCOPE_LOCAL = define(0)
  val GTK_SHORTCUT_SCOPE_MANAGED = define(1)
  val GTK_SHORTCUT_SCOPE_GLOBAL = define(2)
  inline def getName(inline value: GtkShortcutScope): Option[String] =
    inline value match
      case GTK_SHORTCUT_SCOPE_LOCAL => Some("GTK_SHORTCUT_SCOPE_LOCAL")
      case GTK_SHORTCUT_SCOPE_MANAGED => Some("GTK_SHORTCUT_SCOPE_MANAGED")
      case GTK_SHORTCUT_SCOPE_GLOBAL => Some("GTK_SHORTCUT_SCOPE_GLOBAL")
      case _ => None
  extension (a: GtkShortcutScope)
    inline def &(b: GtkShortcutScope): GtkShortcutScope = a & b
    inline def |(b: GtkShortcutScope): GtkShortcutScope = a | b
    inline def is(b: GtkShortcutScope): Boolean = (a & b) == b

/**
 * GtkShortcutType: _SHORTCUT_ACCELERATOR: The shortcut is a keyboard accelerator. The GtkShortcutsShortcut:accelerator property will be used. _SHORTCUT_GESTURE_PINCH: The shortcut is a pinch gesture. GTK provides an icon and subtitle. _SHORTCUT_GESTURE_STRETCH: The shortcut is a stretch gesture. GTK provides an icon and subtitle. _SHORTCUT_GESTURE_ROTATE_CLOCKWISE: The shortcut is a clockwise rotation gesture. GTK provides an icon and subtitle. _SHORTCUT_GESTURE_ROTATE_COUNTERCLOCKWISE: The shortcut is a counterclockwise rotation gesture. GTK provides an icon and subtitle. _SHORTCUT_GESTURE_TWO_FINGER_SWIPE_LEFT: The shortcut is a two-finger swipe gesture. GTK provides an icon and subtitle. _SHORTCUT_GESTURE_TWO_FINGER_SWIPE_RIGHT: The shortcut is a two-finger swipe gesture. GTK provides an icon and subtitle. _SHORTCUT_GESTURE: The shortcut is a gesture. The GtkShortcutsShortcut:icon property will be used. _SHORTCUT_GESTURE_SWIPE_LEFT: The shortcut is a swipe gesture. GTK provides an icon and subtitle. _SHORTCUT_GESTURE_SWIPE_RIGHT: The shortcut is a swipe gesture. GTK provides an icon and subtitle.
*/
opaque type GtkShortcutType = CUnsignedInt
object GtkShortcutType extends CEnumU[GtkShortcutType]:
  given _tag: Tag[GtkShortcutType] = Tag.UInt
  inline def define(inline a: Long): GtkShortcutType = a.toUInt
  val GTK_SHORTCUT_ACCELERATOR = define(0)
  val GTK_SHORTCUT_GESTURE_PINCH = define(1)
  val GTK_SHORTCUT_GESTURE_STRETCH = define(2)
  val GTK_SHORTCUT_GESTURE_ROTATE_CLOCKWISE = define(3)
  val GTK_SHORTCUT_GESTURE_ROTATE_COUNTERCLOCKWISE = define(4)
  val GTK_SHORTCUT_GESTURE_TWO_FINGER_SWIPE_LEFT = define(5)
  val GTK_SHORTCUT_GESTURE_TWO_FINGER_SWIPE_RIGHT = define(6)
  val GTK_SHORTCUT_GESTURE = define(7)
  val GTK_SHORTCUT_GESTURE_SWIPE_LEFT = define(8)
  val GTK_SHORTCUT_GESTURE_SWIPE_RIGHT = define(9)
  inline def getName(inline value: GtkShortcutType): Option[String] =
    inline value match
      case GTK_SHORTCUT_ACCELERATOR => Some("GTK_SHORTCUT_ACCELERATOR")
      case GTK_SHORTCUT_GESTURE_PINCH => Some("GTK_SHORTCUT_GESTURE_PINCH")
      case GTK_SHORTCUT_GESTURE_STRETCH => Some("GTK_SHORTCUT_GESTURE_STRETCH")
      case GTK_SHORTCUT_GESTURE_ROTATE_CLOCKWISE => Some("GTK_SHORTCUT_GESTURE_ROTATE_CLOCKWISE")
      case GTK_SHORTCUT_GESTURE_ROTATE_COUNTERCLOCKWISE => Some("GTK_SHORTCUT_GESTURE_ROTATE_COUNTERCLOCKWISE")
      case GTK_SHORTCUT_GESTURE_TWO_FINGER_SWIPE_LEFT => Some("GTK_SHORTCUT_GESTURE_TWO_FINGER_SWIPE_LEFT")
      case GTK_SHORTCUT_GESTURE_TWO_FINGER_SWIPE_RIGHT => Some("GTK_SHORTCUT_GESTURE_TWO_FINGER_SWIPE_RIGHT")
      case GTK_SHORTCUT_GESTURE => Some("GTK_SHORTCUT_GESTURE")
      case GTK_SHORTCUT_GESTURE_SWIPE_LEFT => Some("GTK_SHORTCUT_GESTURE_SWIPE_LEFT")
      case GTK_SHORTCUT_GESTURE_SWIPE_RIGHT => Some("GTK_SHORTCUT_GESTURE_SWIPE_RIGHT")
      case _ => None
  extension (a: GtkShortcutType)
    inline def &(b: GtkShortcutType): GtkShortcutType = a & b
    inline def |(b: GtkShortcutType): GtkShortcutType = a | b
    inline def is(b: GtkShortcutType): Boolean = (a & b) == b

/**
 * GtkSizeGroupMode: _SIZE_GROUP_NONE: group has no effect _SIZE_GROUP_HORIZONTAL: group affects horizontal requisition _SIZE_GROUP_VERTICAL: group affects vertical requisition _SIZE_GROUP_BOTH: group affects both horizontal and vertical requisition
*/
opaque type GtkSizeGroupMode = CUnsignedInt
object GtkSizeGroupMode extends CEnumU[GtkSizeGroupMode]:
  given _tag: Tag[GtkSizeGroupMode] = Tag.UInt
  inline def define(inline a: Long): GtkSizeGroupMode = a.toUInt
  val GTK_SIZE_GROUP_NONE = define(0)
  val GTK_SIZE_GROUP_HORIZONTAL = define(1)
  val GTK_SIZE_GROUP_VERTICAL = define(2)
  val GTK_SIZE_GROUP_BOTH = define(3)
  inline def getName(inline value: GtkSizeGroupMode): Option[String] =
    inline value match
      case GTK_SIZE_GROUP_NONE => Some("GTK_SIZE_GROUP_NONE")
      case GTK_SIZE_GROUP_HORIZONTAL => Some("GTK_SIZE_GROUP_HORIZONTAL")
      case GTK_SIZE_GROUP_VERTICAL => Some("GTK_SIZE_GROUP_VERTICAL")
      case GTK_SIZE_GROUP_BOTH => Some("GTK_SIZE_GROUP_BOTH")
      case _ => None
  extension (a: GtkSizeGroupMode)
    inline def &(b: GtkSizeGroupMode): GtkSizeGroupMode = a & b
    inline def |(b: GtkSizeGroupMode): GtkSizeGroupMode = a | b
    inline def is(b: GtkSizeGroupMode): Boolean = (a & b) == b

/**
 * GtkSizeRequestMode: _SIZE_REQUEST_HEIGHT_FOR_WIDTH: Prefer height-for-width geometry management _SIZE_REQUEST_WIDTH_FOR_HEIGHT: Prefer width-for-height geometry management _SIZE_REQUEST_CONSTANT_SIZE: Don’t trade height-for-width or width-for-height
*/
opaque type GtkSizeRequestMode = CUnsignedInt
object GtkSizeRequestMode extends CEnumU[GtkSizeRequestMode]:
  given _tag: Tag[GtkSizeRequestMode] = Tag.UInt
  inline def define(inline a: Long): GtkSizeRequestMode = a.toUInt
  val GTK_SIZE_REQUEST_HEIGHT_FOR_WIDTH = define(0)
  val GTK_SIZE_REQUEST_WIDTH_FOR_HEIGHT = define(1)
  val GTK_SIZE_REQUEST_CONSTANT_SIZE = define(2)
  inline def getName(inline value: GtkSizeRequestMode): Option[String] =
    inline value match
      case GTK_SIZE_REQUEST_HEIGHT_FOR_WIDTH => Some("GTK_SIZE_REQUEST_HEIGHT_FOR_WIDTH")
      case GTK_SIZE_REQUEST_WIDTH_FOR_HEIGHT => Some("GTK_SIZE_REQUEST_WIDTH_FOR_HEIGHT")
      case GTK_SIZE_REQUEST_CONSTANT_SIZE => Some("GTK_SIZE_REQUEST_CONSTANT_SIZE")
      case _ => None
  extension (a: GtkSizeRequestMode)
    inline def &(b: GtkSizeRequestMode): GtkSizeRequestMode = a & b
    inline def |(b: GtkSizeRequestMode): GtkSizeRequestMode = a | b
    inline def is(b: GtkSizeRequestMode): Boolean = (a & b) == b

/**
 * GtkSortType: _SORT_ASCENDING: Sorting is in ascending order. _SORT_DESCENDING: Sorting is in descending order.
*/
opaque type GtkSortType = CUnsignedInt
object GtkSortType extends CEnumU[GtkSortType]:
  given _tag: Tag[GtkSortType] = Tag.UInt
  inline def define(inline a: Long): GtkSortType = a.toUInt
  val GTK_SORT_ASCENDING = define(0)
  val GTK_SORT_DESCENDING = define(1)
  inline def getName(inline value: GtkSortType): Option[String] =
    inline value match
      case GTK_SORT_ASCENDING => Some("GTK_SORT_ASCENDING")
      case GTK_SORT_DESCENDING => Some("GTK_SORT_DESCENDING")
      case _ => None
  extension (a: GtkSortType)
    inline def &(b: GtkSortType): GtkSortType = a & b
    inline def |(b: GtkSortType): GtkSortType = a | b
    inline def is(b: GtkSortType): Boolean = (a & b) == b

/**
 * GtkSorterChange: _SORTER_CHANGE_DIFFERENT: The sorter change cannot be described by any of the other enumeration values _SORTER_CHANGE_INVERTED: The sort order was inverted. Comparisons that returned %GTK_ORDERING_SMALLER now return %GTK_ORDERING_LARGER and vice versa. Other comparisons return the same values as before. _SORTER_CHANGE_LESS_STRICT: The sorter is less strict: Comparisons may now return %GTK_ORDERING_EQUAL that did not do so before. _SORTER_CHANGE_MORE_STRICT: The sorter is more strict: Comparisons that did return %GTK_ORDERING_EQUAL may not do so anymore.
*/
opaque type GtkSorterChange = CUnsignedInt
object GtkSorterChange extends CEnumU[GtkSorterChange]:
  given _tag: Tag[GtkSorterChange] = Tag.UInt
  inline def define(inline a: Long): GtkSorterChange = a.toUInt
  val GTK_SORTER_CHANGE_DIFFERENT = define(0)
  val GTK_SORTER_CHANGE_INVERTED = define(1)
  val GTK_SORTER_CHANGE_LESS_STRICT = define(2)
  val GTK_SORTER_CHANGE_MORE_STRICT = define(3)
  inline def getName(inline value: GtkSorterChange): Option[String] =
    inline value match
      case GTK_SORTER_CHANGE_DIFFERENT => Some("GTK_SORTER_CHANGE_DIFFERENT")
      case GTK_SORTER_CHANGE_INVERTED => Some("GTK_SORTER_CHANGE_INVERTED")
      case GTK_SORTER_CHANGE_LESS_STRICT => Some("GTK_SORTER_CHANGE_LESS_STRICT")
      case GTK_SORTER_CHANGE_MORE_STRICT => Some("GTK_SORTER_CHANGE_MORE_STRICT")
      case _ => None
  extension (a: GtkSorterChange)
    inline def &(b: GtkSorterChange): GtkSorterChange = a & b
    inline def |(b: GtkSorterChange): GtkSorterChange = a | b
    inline def is(b: GtkSorterChange): Boolean = (a & b) == b

/**
 * GtkSorterOrder: _SORTER_ORDER_PARTIAL: A partial order. Any `GtkOrdering` is possible. _SORTER_ORDER_NONE: No order, all elements are considered equal. gtk_sorter_compare() will only return %GTK_ORDERING_EQUAL. _SORTER_ORDER_TOTAL: A total order. gtk_sorter_compare() will only return %GTK_ORDERING_EQUAL if an item is compared with itself. Two different items will never cause this value to be returned.
*/
opaque type GtkSorterOrder = CUnsignedInt
object GtkSorterOrder extends CEnumU[GtkSorterOrder]:
  given _tag: Tag[GtkSorterOrder] = Tag.UInt
  inline def define(inline a: Long): GtkSorterOrder = a.toUInt
  val GTK_SORTER_ORDER_PARTIAL = define(0)
  val GTK_SORTER_ORDER_NONE = define(1)
  val GTK_SORTER_ORDER_TOTAL = define(2)
  inline def getName(inline value: GtkSorterOrder): Option[String] =
    inline value match
      case GTK_SORTER_ORDER_PARTIAL => Some("GTK_SORTER_ORDER_PARTIAL")
      case GTK_SORTER_ORDER_NONE => Some("GTK_SORTER_ORDER_NONE")
      case GTK_SORTER_ORDER_TOTAL => Some("GTK_SORTER_ORDER_TOTAL")
      case _ => None
  extension (a: GtkSorterOrder)
    inline def &(b: GtkSorterOrder): GtkSorterOrder = a & b
    inline def |(b: GtkSorterOrder): GtkSorterOrder = a | b
    inline def is(b: GtkSorterOrder): Boolean = (a & b) == b

/**
 * GtkSpinButtonUpdatePolicy: _UPDATE_ALWAYS: When refreshing your `GtkSpinButton`, the value is always displayed _UPDATE_IF_VALID: When refreshing your `GtkSpinButton`, the value is only displayed if it is valid within the bounds of the spin button's adjustment
*/
opaque type GtkSpinButtonUpdatePolicy = CUnsignedInt
object GtkSpinButtonUpdatePolicy extends CEnumU[GtkSpinButtonUpdatePolicy]:
  given _tag: Tag[GtkSpinButtonUpdatePolicy] = Tag.UInt
  inline def define(inline a: Long): GtkSpinButtonUpdatePolicy = a.toUInt
  val GTK_UPDATE_ALWAYS = define(0)
  val GTK_UPDATE_IF_VALID = define(1)
  inline def getName(inline value: GtkSpinButtonUpdatePolicy): Option[String] =
    inline value match
      case GTK_UPDATE_ALWAYS => Some("GTK_UPDATE_ALWAYS")
      case GTK_UPDATE_IF_VALID => Some("GTK_UPDATE_IF_VALID")
      case _ => None
  extension (a: GtkSpinButtonUpdatePolicy)
    inline def &(b: GtkSpinButtonUpdatePolicy): GtkSpinButtonUpdatePolicy = a & b
    inline def |(b: GtkSpinButtonUpdatePolicy): GtkSpinButtonUpdatePolicy = a | b
    inline def is(b: GtkSpinButtonUpdatePolicy): Boolean = (a & b) == b

/**
 * GtkSpinType: _SPIN_STEP_FORWARD: Increment by the adjustments step increment. _SPIN_STEP_BACKWARD: Decrement by the adjustments step increment. _SPIN_PAGE_FORWARD: Increment by the adjustments page increment. _SPIN_PAGE_BACKWARD: Decrement by the adjustments page increment. _SPIN_HOME: Go to the adjustments lower bound. _SPIN_END: Go to the adjustments upper bound. _SPIN_USER_DEFINED: Change by a specified amount.
*/
opaque type GtkSpinType = CUnsignedInt
object GtkSpinType extends CEnumU[GtkSpinType]:
  given _tag: Tag[GtkSpinType] = Tag.UInt
  inline def define(inline a: Long): GtkSpinType = a.toUInt
  val GTK_SPIN_STEP_FORWARD = define(0)
  val GTK_SPIN_STEP_BACKWARD = define(1)
  val GTK_SPIN_PAGE_FORWARD = define(2)
  val GTK_SPIN_PAGE_BACKWARD = define(3)
  val GTK_SPIN_HOME = define(4)
  val GTK_SPIN_END = define(5)
  val GTK_SPIN_USER_DEFINED = define(6)
  inline def getName(inline value: GtkSpinType): Option[String] =
    inline value match
      case GTK_SPIN_STEP_FORWARD => Some("GTK_SPIN_STEP_FORWARD")
      case GTK_SPIN_STEP_BACKWARD => Some("GTK_SPIN_STEP_BACKWARD")
      case GTK_SPIN_PAGE_FORWARD => Some("GTK_SPIN_PAGE_FORWARD")
      case GTK_SPIN_PAGE_BACKWARD => Some("GTK_SPIN_PAGE_BACKWARD")
      case GTK_SPIN_HOME => Some("GTK_SPIN_HOME")
      case GTK_SPIN_END => Some("GTK_SPIN_END")
      case GTK_SPIN_USER_DEFINED => Some("GTK_SPIN_USER_DEFINED")
      case _ => None
  extension (a: GtkSpinType)
    inline def &(b: GtkSpinType): GtkSpinType = a & b
    inline def |(b: GtkSpinType): GtkSpinType = a | b
    inline def is(b: GtkSpinType): Boolean = (a & b) == b

/**
*/
opaque type GtkStackTransitionType = CUnsignedInt
object GtkStackTransitionType extends CEnumU[GtkStackTransitionType]:
  given _tag: Tag[GtkStackTransitionType] = Tag.UInt
  inline def define(inline a: Long): GtkStackTransitionType = a.toUInt
  val GTK_STACK_TRANSITION_TYPE_NONE = define(0)
  val GTK_STACK_TRANSITION_TYPE_CROSSFADE = define(1)
  val GTK_STACK_TRANSITION_TYPE_SLIDE_RIGHT = define(2)
  val GTK_STACK_TRANSITION_TYPE_SLIDE_LEFT = define(3)
  val GTK_STACK_TRANSITION_TYPE_SLIDE_UP = define(4)
  val GTK_STACK_TRANSITION_TYPE_SLIDE_DOWN = define(5)
  val GTK_STACK_TRANSITION_TYPE_SLIDE_LEFT_RIGHT = define(6)
  val GTK_STACK_TRANSITION_TYPE_SLIDE_UP_DOWN = define(7)
  val GTK_STACK_TRANSITION_TYPE_OVER_UP = define(8)
  val GTK_STACK_TRANSITION_TYPE_OVER_DOWN = define(9)
  val GTK_STACK_TRANSITION_TYPE_OVER_LEFT = define(10)
  val GTK_STACK_TRANSITION_TYPE_OVER_RIGHT = define(11)
  val GTK_STACK_TRANSITION_TYPE_UNDER_UP = define(12)
  val GTK_STACK_TRANSITION_TYPE_UNDER_DOWN = define(13)
  val GTK_STACK_TRANSITION_TYPE_UNDER_LEFT = define(14)
  val GTK_STACK_TRANSITION_TYPE_UNDER_RIGHT = define(15)
  val GTK_STACK_TRANSITION_TYPE_OVER_UP_DOWN = define(16)
  val GTK_STACK_TRANSITION_TYPE_OVER_DOWN_UP = define(17)
  val GTK_STACK_TRANSITION_TYPE_OVER_LEFT_RIGHT = define(18)
  val GTK_STACK_TRANSITION_TYPE_OVER_RIGHT_LEFT = define(19)
  val GTK_STACK_TRANSITION_TYPE_ROTATE_LEFT = define(20)
  val GTK_STACK_TRANSITION_TYPE_ROTATE_RIGHT = define(21)
  val GTK_STACK_TRANSITION_TYPE_ROTATE_LEFT_RIGHT = define(22)
  inline def getName(inline value: GtkStackTransitionType): Option[String] =
    inline value match
      case GTK_STACK_TRANSITION_TYPE_NONE => Some("GTK_STACK_TRANSITION_TYPE_NONE")
      case GTK_STACK_TRANSITION_TYPE_CROSSFADE => Some("GTK_STACK_TRANSITION_TYPE_CROSSFADE")
      case GTK_STACK_TRANSITION_TYPE_SLIDE_RIGHT => Some("GTK_STACK_TRANSITION_TYPE_SLIDE_RIGHT")
      case GTK_STACK_TRANSITION_TYPE_SLIDE_LEFT => Some("GTK_STACK_TRANSITION_TYPE_SLIDE_LEFT")
      case GTK_STACK_TRANSITION_TYPE_SLIDE_UP => Some("GTK_STACK_TRANSITION_TYPE_SLIDE_UP")
      case GTK_STACK_TRANSITION_TYPE_SLIDE_DOWN => Some("GTK_STACK_TRANSITION_TYPE_SLIDE_DOWN")
      case GTK_STACK_TRANSITION_TYPE_SLIDE_LEFT_RIGHT => Some("GTK_STACK_TRANSITION_TYPE_SLIDE_LEFT_RIGHT")
      case GTK_STACK_TRANSITION_TYPE_SLIDE_UP_DOWN => Some("GTK_STACK_TRANSITION_TYPE_SLIDE_UP_DOWN")
      case GTK_STACK_TRANSITION_TYPE_OVER_UP => Some("GTK_STACK_TRANSITION_TYPE_OVER_UP")
      case GTK_STACK_TRANSITION_TYPE_OVER_DOWN => Some("GTK_STACK_TRANSITION_TYPE_OVER_DOWN")
      case GTK_STACK_TRANSITION_TYPE_OVER_LEFT => Some("GTK_STACK_TRANSITION_TYPE_OVER_LEFT")
      case GTK_STACK_TRANSITION_TYPE_OVER_RIGHT => Some("GTK_STACK_TRANSITION_TYPE_OVER_RIGHT")
      case GTK_STACK_TRANSITION_TYPE_UNDER_UP => Some("GTK_STACK_TRANSITION_TYPE_UNDER_UP")
      case GTK_STACK_TRANSITION_TYPE_UNDER_DOWN => Some("GTK_STACK_TRANSITION_TYPE_UNDER_DOWN")
      case GTK_STACK_TRANSITION_TYPE_UNDER_LEFT => Some("GTK_STACK_TRANSITION_TYPE_UNDER_LEFT")
      case GTK_STACK_TRANSITION_TYPE_UNDER_RIGHT => Some("GTK_STACK_TRANSITION_TYPE_UNDER_RIGHT")
      case GTK_STACK_TRANSITION_TYPE_OVER_UP_DOWN => Some("GTK_STACK_TRANSITION_TYPE_OVER_UP_DOWN")
      case GTK_STACK_TRANSITION_TYPE_OVER_DOWN_UP => Some("GTK_STACK_TRANSITION_TYPE_OVER_DOWN_UP")
      case GTK_STACK_TRANSITION_TYPE_OVER_LEFT_RIGHT => Some("GTK_STACK_TRANSITION_TYPE_OVER_LEFT_RIGHT")
      case GTK_STACK_TRANSITION_TYPE_OVER_RIGHT_LEFT => Some("GTK_STACK_TRANSITION_TYPE_OVER_RIGHT_LEFT")
      case GTK_STACK_TRANSITION_TYPE_ROTATE_LEFT => Some("GTK_STACK_TRANSITION_TYPE_ROTATE_LEFT")
      case GTK_STACK_TRANSITION_TYPE_ROTATE_RIGHT => Some("GTK_STACK_TRANSITION_TYPE_ROTATE_RIGHT")
      case GTK_STACK_TRANSITION_TYPE_ROTATE_LEFT_RIGHT => Some("GTK_STACK_TRANSITION_TYPE_ROTATE_LEFT_RIGHT")
      case _ => None
  extension (a: GtkStackTransitionType)
    inline def &(b: GtkStackTransitionType): GtkStackTransitionType = a & b
    inline def |(b: GtkStackTransitionType): GtkStackTransitionType = a | b
    inline def is(b: GtkStackTransitionType): Boolean = (a & b) == b

/**
 * GtkStateFlags: _STATE_FLAG_NORMAL: State during normal operation _STATE_FLAG_ACTIVE: Widget is active _STATE_FLAG_PRELIGHT: Widget has a mouse pointer over it _STATE_FLAG_SELECTED: Widget is selected _STATE_FLAG_INSENSITIVE: Widget is insensitive _STATE_FLAG_INCONSISTENT: Widget is inconsistent _STATE_FLAG_FOCUSED: Widget has the keyboard focus _STATE_FLAG_BACKDROP: Widget is in a background toplevel window _STATE_FLAG_DIR_LTR: Widget is in left-to-right text direction _STATE_FLAG_DIR_RTL: Widget is in right-to-left text direction _STATE_FLAG_LINK: Widget is a link _STATE_FLAG_VISITED: The location the widget points to has already been visited _STATE_FLAG_CHECKED: Widget is checked _STATE_FLAG_DROP_ACTIVE: Widget is highlighted as a drop target for DND _STATE_FLAG_FOCUS_VISIBLE: Widget has the visible focus _STATE_FLAG_FOCUS_WITHIN: Widget contains the keyboard focus
*/
opaque type GtkStateFlags = CUnsignedInt
object GtkStateFlags extends CEnumU[GtkStateFlags]:
  given _tag: Tag[GtkStateFlags] = Tag.UInt
  inline def define(inline a: Long): GtkStateFlags = a.toUInt
  val GTK_STATE_FLAG_NORMAL = define(0)
  val GTK_STATE_FLAG_ACTIVE = define(1)
  val GTK_STATE_FLAG_PRELIGHT = define(2)
  val GTK_STATE_FLAG_SELECTED = define(4)
  val GTK_STATE_FLAG_INSENSITIVE = define(8)
  val GTK_STATE_FLAG_INCONSISTENT = define(16)
  val GTK_STATE_FLAG_FOCUSED = define(32)
  val GTK_STATE_FLAG_BACKDROP = define(64)
  val GTK_STATE_FLAG_DIR_LTR = define(128)
  val GTK_STATE_FLAG_DIR_RTL = define(256)
  val GTK_STATE_FLAG_LINK = define(512)
  val GTK_STATE_FLAG_VISITED = define(1024)
  val GTK_STATE_FLAG_CHECKED = define(2048)
  val GTK_STATE_FLAG_DROP_ACTIVE = define(4096)
  val GTK_STATE_FLAG_FOCUS_VISIBLE = define(8192)
  val GTK_STATE_FLAG_FOCUS_WITHIN = define(16384)
  inline def getName(inline value: GtkStateFlags): Option[String] =
    inline value match
      case GTK_STATE_FLAG_NORMAL => Some("GTK_STATE_FLAG_NORMAL")
      case GTK_STATE_FLAG_ACTIVE => Some("GTK_STATE_FLAG_ACTIVE")
      case GTK_STATE_FLAG_PRELIGHT => Some("GTK_STATE_FLAG_PRELIGHT")
      case GTK_STATE_FLAG_SELECTED => Some("GTK_STATE_FLAG_SELECTED")
      case GTK_STATE_FLAG_INSENSITIVE => Some("GTK_STATE_FLAG_INSENSITIVE")
      case GTK_STATE_FLAG_INCONSISTENT => Some("GTK_STATE_FLAG_INCONSISTENT")
      case GTK_STATE_FLAG_FOCUSED => Some("GTK_STATE_FLAG_FOCUSED")
      case GTK_STATE_FLAG_BACKDROP => Some("GTK_STATE_FLAG_BACKDROP")
      case GTK_STATE_FLAG_DIR_LTR => Some("GTK_STATE_FLAG_DIR_LTR")
      case GTK_STATE_FLAG_DIR_RTL => Some("GTK_STATE_FLAG_DIR_RTL")
      case GTK_STATE_FLAG_LINK => Some("GTK_STATE_FLAG_LINK")
      case GTK_STATE_FLAG_VISITED => Some("GTK_STATE_FLAG_VISITED")
      case GTK_STATE_FLAG_CHECKED => Some("GTK_STATE_FLAG_CHECKED")
      case GTK_STATE_FLAG_DROP_ACTIVE => Some("GTK_STATE_FLAG_DROP_ACTIVE")
      case GTK_STATE_FLAG_FOCUS_VISIBLE => Some("GTK_STATE_FLAG_FOCUS_VISIBLE")
      case GTK_STATE_FLAG_FOCUS_WITHIN => Some("GTK_STATE_FLAG_FOCUS_WITHIN")
      case _ => None
  extension (a: GtkStateFlags)
    inline def &(b: GtkStateFlags): GtkStateFlags = a & b
    inline def |(b: GtkStateFlags): GtkStateFlags = a | b
    inline def is(b: GtkStateFlags): Boolean = (a & b) == b

/**
 * GtkStringFilterMatchMode: _STRING_FILTER_MATCH_MODE_EXACT: The search string and text must match exactly. _STRING_FILTER_MATCH_MODE_SUBSTRING: The search string must be contained as a substring inside the text. _STRING_FILTER_MATCH_MODE_PREFIX: The text must begin with the search string.
*/
opaque type GtkStringFilterMatchMode = CUnsignedInt
object GtkStringFilterMatchMode extends CEnumU[GtkStringFilterMatchMode]:
  given _tag: Tag[GtkStringFilterMatchMode] = Tag.UInt
  inline def define(inline a: Long): GtkStringFilterMatchMode = a.toUInt
  val GTK_STRING_FILTER_MATCH_MODE_EXACT = define(0)
  val GTK_STRING_FILTER_MATCH_MODE_SUBSTRING = define(1)
  val GTK_STRING_FILTER_MATCH_MODE_PREFIX = define(2)
  inline def getName(inline value: GtkStringFilterMatchMode): Option[String] =
    inline value match
      case GTK_STRING_FILTER_MATCH_MODE_EXACT => Some("GTK_STRING_FILTER_MATCH_MODE_EXACT")
      case GTK_STRING_FILTER_MATCH_MODE_SUBSTRING => Some("GTK_STRING_FILTER_MATCH_MODE_SUBSTRING")
      case GTK_STRING_FILTER_MATCH_MODE_PREFIX => Some("GTK_STRING_FILTER_MATCH_MODE_PREFIX")
      case _ => None
  extension (a: GtkStringFilterMatchMode)
    inline def &(b: GtkStringFilterMatchMode): GtkStringFilterMatchMode = a & b
    inline def |(b: GtkStringFilterMatchMode): GtkStringFilterMatchMode = a | b
    inline def is(b: GtkStringFilterMatchMode): Boolean = (a & b) == b

/**
*/
opaque type GtkStyleContextPrintFlags = CUnsignedInt
object GtkStyleContextPrintFlags extends CEnumU[GtkStyleContextPrintFlags]:
  given _tag: Tag[GtkStyleContextPrintFlags] = Tag.UInt
  inline def define(inline a: Long): GtkStyleContextPrintFlags = a.toUInt
  val GTK_STYLE_CONTEXT_PRINT_NONE = define(0)
  val GTK_STYLE_CONTEXT_PRINT_RECURSE = define(1)
  val GTK_STYLE_CONTEXT_PRINT_SHOW_STYLE = define(2)
  val GTK_STYLE_CONTEXT_PRINT_SHOW_CHANGE = define(4)
  inline def getName(inline value: GtkStyleContextPrintFlags): Option[String] =
    inline value match
      case GTK_STYLE_CONTEXT_PRINT_NONE => Some("GTK_STYLE_CONTEXT_PRINT_NONE")
      case GTK_STYLE_CONTEXT_PRINT_RECURSE => Some("GTK_STYLE_CONTEXT_PRINT_RECURSE")
      case GTK_STYLE_CONTEXT_PRINT_SHOW_STYLE => Some("GTK_STYLE_CONTEXT_PRINT_SHOW_STYLE")
      case GTK_STYLE_CONTEXT_PRINT_SHOW_CHANGE => Some("GTK_STYLE_CONTEXT_PRINT_SHOW_CHANGE")
      case _ => None
  extension (a: GtkStyleContextPrintFlags)
    inline def &(b: GtkStyleContextPrintFlags): GtkStyleContextPrintFlags = a & b
    inline def |(b: GtkStyleContextPrintFlags): GtkStyleContextPrintFlags = a | b
    inline def is(b: GtkStyleContextPrintFlags): Boolean = (a & b) == b

/**
 * GtkSymbolicColor: _SYMBOLIC_COLOR_FOREGROUND: The default foreground color _SYMBOLIC_COLOR_ERROR: Indication color for errors _SYMBOLIC_COLOR_WARNING: Indication color for warnings _SYMBOLIC_COLOR_SUCCESS: Indication color for success
*/
opaque type GtkSymbolicColor = CUnsignedInt
object GtkSymbolicColor extends CEnumU[GtkSymbolicColor]:
  given _tag: Tag[GtkSymbolicColor] = Tag.UInt
  inline def define(inline a: Long): GtkSymbolicColor = a.toUInt
  val GTK_SYMBOLIC_COLOR_FOREGROUND = define(0)
  val GTK_SYMBOLIC_COLOR_ERROR = define(1)
  val GTK_SYMBOLIC_COLOR_WARNING = define(2)
  val GTK_SYMBOLIC_COLOR_SUCCESS = define(3)
  inline def getName(inline value: GtkSymbolicColor): Option[String] =
    inline value match
      case GTK_SYMBOLIC_COLOR_FOREGROUND => Some("GTK_SYMBOLIC_COLOR_FOREGROUND")
      case GTK_SYMBOLIC_COLOR_ERROR => Some("GTK_SYMBOLIC_COLOR_ERROR")
      case GTK_SYMBOLIC_COLOR_WARNING => Some("GTK_SYMBOLIC_COLOR_WARNING")
      case GTK_SYMBOLIC_COLOR_SUCCESS => Some("GTK_SYMBOLIC_COLOR_SUCCESS")
      case _ => None
  extension (a: GtkSymbolicColor)
    inline def &(b: GtkSymbolicColor): GtkSymbolicColor = a & b
    inline def |(b: GtkSymbolicColor): GtkSymbolicColor = a | b
    inline def is(b: GtkSymbolicColor): Boolean = (a & b) == b

/**
 * GtkSystemSetting: _SYSTEM_SETTING_DPI: the [property.Settings:gtk-xft-dpi] setting has changed _SYSTEM_SETTING_FONT_NAME: The [property.Settings:gtk-font-name] setting has changed _SYSTEM_SETTING_FONT_CONFIG: The font configuration has changed in a way that requires text to be redrawn. This can be any of the [property.Settings:gtk-xft-antialias], [property.Settings:gtk-xft-hinting], [property.Settings:gtk-xft-hintstyle], [property.Settings:gtk-xft-rgba] or [property.Settings:gtk-fontconfig-timestamp] settings _SYSTEM_SETTING_DISPLAY: The display has changed _SYSTEM_SETTING_ICON_THEME: The icon theme has changed in a way that requires icons to be looked up again
*/
opaque type GtkSystemSetting = CUnsignedInt
object GtkSystemSetting extends CEnumU[GtkSystemSetting]:
  given _tag: Tag[GtkSystemSetting] = Tag.UInt
  inline def define(inline a: Long): GtkSystemSetting = a.toUInt
  val GTK_SYSTEM_SETTING_DPI = define(0)
  val GTK_SYSTEM_SETTING_FONT_NAME = define(1)
  val GTK_SYSTEM_SETTING_FONT_CONFIG = define(2)
  val GTK_SYSTEM_SETTING_DISPLAY = define(3)
  val GTK_SYSTEM_SETTING_ICON_THEME = define(4)
  inline def getName(inline value: GtkSystemSetting): Option[String] =
    inline value match
      case GTK_SYSTEM_SETTING_DPI => Some("GTK_SYSTEM_SETTING_DPI")
      case GTK_SYSTEM_SETTING_FONT_NAME => Some("GTK_SYSTEM_SETTING_FONT_NAME")
      case GTK_SYSTEM_SETTING_FONT_CONFIG => Some("GTK_SYSTEM_SETTING_FONT_CONFIG")
      case GTK_SYSTEM_SETTING_DISPLAY => Some("GTK_SYSTEM_SETTING_DISPLAY")
      case GTK_SYSTEM_SETTING_ICON_THEME => Some("GTK_SYSTEM_SETTING_ICON_THEME")
      case _ => None
  extension (a: GtkSystemSetting)
    inline def &(b: GtkSystemSetting): GtkSystemSetting = a & b
    inline def |(b: GtkSystemSetting): GtkSystemSetting = a | b
    inline def is(b: GtkSystemSetting): Boolean = (a & b) == b

/**
 * GtkTextDirection: _TEXT_DIR_NONE: No direction. _TEXT_DIR_LTR: Left to right text direction. _TEXT_DIR_RTL: Right to left text direction.
*/
opaque type GtkTextDirection = CUnsignedInt
object GtkTextDirection extends CEnumU[GtkTextDirection]:
  given _tag: Tag[GtkTextDirection] = Tag.UInt
  inline def define(inline a: Long): GtkTextDirection = a.toUInt
  val GTK_TEXT_DIR_NONE = define(0)
  val GTK_TEXT_DIR_LTR = define(1)
  val GTK_TEXT_DIR_RTL = define(2)
  inline def getName(inline value: GtkTextDirection): Option[String] =
    inline value match
      case GTK_TEXT_DIR_NONE => Some("GTK_TEXT_DIR_NONE")
      case GTK_TEXT_DIR_LTR => Some("GTK_TEXT_DIR_LTR")
      case GTK_TEXT_DIR_RTL => Some("GTK_TEXT_DIR_RTL")
      case _ => None
  extension (a: GtkTextDirection)
    inline def &(b: GtkTextDirection): GtkTextDirection = a & b
    inline def |(b: GtkTextDirection): GtkTextDirection = a | b
    inline def is(b: GtkTextDirection): Boolean = (a & b) == b

/**
 * GtkTextExtendSelection: _TEXT_EXTEND_SELECTION_WORD: Selects the current word. It is triggered by a double-click for example. _TEXT_EXTEND_SELECTION_LINE: Selects the current line. It is triggered by a triple-click for example.
*/
opaque type GtkTextExtendSelection = CUnsignedInt
object GtkTextExtendSelection extends CEnumU[GtkTextExtendSelection]:
  given _tag: Tag[GtkTextExtendSelection] = Tag.UInt
  inline def define(inline a: Long): GtkTextExtendSelection = a.toUInt
  val GTK_TEXT_EXTEND_SELECTION_WORD = define(0)
  val GTK_TEXT_EXTEND_SELECTION_LINE = define(1)
  inline def getName(inline value: GtkTextExtendSelection): Option[String] =
    inline value match
      case GTK_TEXT_EXTEND_SELECTION_WORD => Some("GTK_TEXT_EXTEND_SELECTION_WORD")
      case GTK_TEXT_EXTEND_SELECTION_LINE => Some("GTK_TEXT_EXTEND_SELECTION_LINE")
      case _ => None
  extension (a: GtkTextExtendSelection)
    inline def &(b: GtkTextExtendSelection): GtkTextExtendSelection = a & b
    inline def |(b: GtkTextExtendSelection): GtkTextExtendSelection = a | b
    inline def is(b: GtkTextExtendSelection): Boolean = (a & b) == b

/**
 * GtkTextSearchFlags: _TEXT_SEARCH_VISIBLE_ONLY: Search only visible data. A search match may have invisible text interspersed. _TEXT_SEARCH_TEXT_ONLY: Search only text. A match may have paintables or child widgets mixed inside the matched range. _TEXT_SEARCH_CASE_INSENSITIVE: The text will be matched regardless of what case it is in.
*/
opaque type GtkTextSearchFlags = CUnsignedInt
object GtkTextSearchFlags extends CEnumU[GtkTextSearchFlags]:
  given _tag: Tag[GtkTextSearchFlags] = Tag.UInt
  inline def define(inline a: Long): GtkTextSearchFlags = a.toUInt
  val GTK_TEXT_SEARCH_VISIBLE_ONLY = define(1)
  val GTK_TEXT_SEARCH_TEXT_ONLY = define(2)
  val GTK_TEXT_SEARCH_CASE_INSENSITIVE = define(4)
  inline def getName(inline value: GtkTextSearchFlags): Option[String] =
    inline value match
      case GTK_TEXT_SEARCH_VISIBLE_ONLY => Some("GTK_TEXT_SEARCH_VISIBLE_ONLY")
      case GTK_TEXT_SEARCH_TEXT_ONLY => Some("GTK_TEXT_SEARCH_TEXT_ONLY")
      case GTK_TEXT_SEARCH_CASE_INSENSITIVE => Some("GTK_TEXT_SEARCH_CASE_INSENSITIVE")
      case _ => None
  extension (a: GtkTextSearchFlags)
    inline def &(b: GtkTextSearchFlags): GtkTextSearchFlags = a & b
    inline def |(b: GtkTextSearchFlags): GtkTextSearchFlags = a | b
    inline def is(b: GtkTextSearchFlags): Boolean = (a & b) == b

/**
 * GtkTextViewLayer: _TEXT_VIEW_LAYER_BELOW_TEXT: The layer rendered below the text (but above the background). _TEXT_VIEW_LAYER_ABOVE_TEXT: The layer rendered above the text.
*/
opaque type GtkTextViewLayer = CUnsignedInt
object GtkTextViewLayer extends CEnumU[GtkTextViewLayer]:
  given _tag: Tag[GtkTextViewLayer] = Tag.UInt
  inline def define(inline a: Long): GtkTextViewLayer = a.toUInt
  val GTK_TEXT_VIEW_LAYER_BELOW_TEXT = define(0)
  val GTK_TEXT_VIEW_LAYER_ABOVE_TEXT = define(1)
  inline def getName(inline value: GtkTextViewLayer): Option[String] =
    inline value match
      case GTK_TEXT_VIEW_LAYER_BELOW_TEXT => Some("GTK_TEXT_VIEW_LAYER_BELOW_TEXT")
      case GTK_TEXT_VIEW_LAYER_ABOVE_TEXT => Some("GTK_TEXT_VIEW_LAYER_ABOVE_TEXT")
      case _ => None
  extension (a: GtkTextViewLayer)
    inline def &(b: GtkTextViewLayer): GtkTextViewLayer = a & b
    inline def |(b: GtkTextViewLayer): GtkTextViewLayer = a | b
    inline def is(b: GtkTextViewLayer): Boolean = (a & b) == b

/**
 * GtkTextWindowType: _TEXT_WINDOW_WIDGET: Window that floats over scrolling areas. _TEXT_WINDOW_TEXT: Scrollable text window. _TEXT_WINDOW_LEFT: Left side border window. _TEXT_WINDOW_RIGHT: Right side border window. _TEXT_WINDOW_TOP: Top border window. _TEXT_WINDOW_BOTTOM: Bottom border window.
*/
opaque type GtkTextWindowType = CUnsignedInt
object GtkTextWindowType extends CEnumU[GtkTextWindowType]:
  given _tag: Tag[GtkTextWindowType] = Tag.UInt
  inline def define(inline a: Long): GtkTextWindowType = a.toUInt
  val GTK_TEXT_WINDOW_WIDGET = define(1)
  val GTK_TEXT_WINDOW_TEXT = define(2)
  val GTK_TEXT_WINDOW_LEFT = define(3)
  val GTK_TEXT_WINDOW_RIGHT = define(4)
  val GTK_TEXT_WINDOW_TOP = define(5)
  val GTK_TEXT_WINDOW_BOTTOM = define(6)
  inline def getName(inline value: GtkTextWindowType): Option[String] =
    inline value match
      case GTK_TEXT_WINDOW_WIDGET => Some("GTK_TEXT_WINDOW_WIDGET")
      case GTK_TEXT_WINDOW_TEXT => Some("GTK_TEXT_WINDOW_TEXT")
      case GTK_TEXT_WINDOW_LEFT => Some("GTK_TEXT_WINDOW_LEFT")
      case GTK_TEXT_WINDOW_RIGHT => Some("GTK_TEXT_WINDOW_RIGHT")
      case GTK_TEXT_WINDOW_TOP => Some("GTK_TEXT_WINDOW_TOP")
      case GTK_TEXT_WINDOW_BOTTOM => Some("GTK_TEXT_WINDOW_BOTTOM")
      case _ => None
  extension (a: GtkTextWindowType)
    inline def &(b: GtkTextWindowType): GtkTextWindowType = a & b
    inline def |(b: GtkTextWindowType): GtkTextWindowType = a | b
    inline def is(b: GtkTextWindowType): Boolean = (a & b) == b

/**
 * GtkTreeModelFlags: _TREE_MODEL_ITERS_PERSIST: iterators survive all signals emitted by the tree _TREE_MODEL_LIST_ONLY: the model is a list only, and never has children
*/
opaque type GtkTreeModelFlags = CUnsignedInt
object GtkTreeModelFlags extends CEnumU[GtkTreeModelFlags]:
  given _tag: Tag[GtkTreeModelFlags] = Tag.UInt
  inline def define(inline a: Long): GtkTreeModelFlags = a.toUInt
  val GTK_TREE_MODEL_ITERS_PERSIST = define(1)
  val GTK_TREE_MODEL_LIST_ONLY = define(2)
  inline def getName(inline value: GtkTreeModelFlags): Option[String] =
    inline value match
      case GTK_TREE_MODEL_ITERS_PERSIST => Some("GTK_TREE_MODEL_ITERS_PERSIST")
      case GTK_TREE_MODEL_LIST_ONLY => Some("GTK_TREE_MODEL_LIST_ONLY")
      case _ => None
  extension (a: GtkTreeModelFlags)
    inline def &(b: GtkTreeModelFlags): GtkTreeModelFlags = a & b
    inline def |(b: GtkTreeModelFlags): GtkTreeModelFlags = a | b
    inline def is(b: GtkTreeModelFlags): Boolean = (a & b) == b

/**
 * GtkTreeViewColumnSizing: _TREE_VIEW_COLUMN_GROW_ONLY: Columns only get bigger in reaction to changes in the model _TREE_VIEW_COLUMN_AUTOSIZE: Columns resize to be the optimal size every time the model changes. _TREE_VIEW_COLUMN_FIXED: Columns are a fixed numbers of pixels wide.
*/
opaque type GtkTreeViewColumnSizing = CUnsignedInt
object GtkTreeViewColumnSizing extends CEnumU[GtkTreeViewColumnSizing]:
  given _tag: Tag[GtkTreeViewColumnSizing] = Tag.UInt
  inline def define(inline a: Long): GtkTreeViewColumnSizing = a.toUInt
  val GTK_TREE_VIEW_COLUMN_GROW_ONLY = define(0)
  val GTK_TREE_VIEW_COLUMN_AUTOSIZE = define(1)
  val GTK_TREE_VIEW_COLUMN_FIXED = define(2)
  inline def getName(inline value: GtkTreeViewColumnSizing): Option[String] =
    inline value match
      case GTK_TREE_VIEW_COLUMN_GROW_ONLY => Some("GTK_TREE_VIEW_COLUMN_GROW_ONLY")
      case GTK_TREE_VIEW_COLUMN_AUTOSIZE => Some("GTK_TREE_VIEW_COLUMN_AUTOSIZE")
      case GTK_TREE_VIEW_COLUMN_FIXED => Some("GTK_TREE_VIEW_COLUMN_FIXED")
      case _ => None
  extension (a: GtkTreeViewColumnSizing)
    inline def &(b: GtkTreeViewColumnSizing): GtkTreeViewColumnSizing = a & b
    inline def |(b: GtkTreeViewColumnSizing): GtkTreeViewColumnSizing = a | b
    inline def is(b: GtkTreeViewColumnSizing): Boolean = (a & b) == b

/**
 * GtkTreeViewDropPosition: _TREE_VIEW_DROP_BEFORE: dropped row is inserted before _TREE_VIEW_DROP_AFTER: dropped row is inserted after _TREE_VIEW_DROP_INTO_OR_BEFORE: dropped row becomes a child or is inserted before _TREE_VIEW_DROP_INTO_OR_AFTER: dropped row becomes a child or is inserted after
*/
opaque type GtkTreeViewDropPosition = CUnsignedInt
object GtkTreeViewDropPosition extends CEnumU[GtkTreeViewDropPosition]:
  given _tag: Tag[GtkTreeViewDropPosition] = Tag.UInt
  inline def define(inline a: Long): GtkTreeViewDropPosition = a.toUInt
  val GTK_TREE_VIEW_DROP_BEFORE = define(0)
  val GTK_TREE_VIEW_DROP_AFTER = define(1)
  val GTK_TREE_VIEW_DROP_INTO_OR_BEFORE = define(2)
  val GTK_TREE_VIEW_DROP_INTO_OR_AFTER = define(3)
  inline def getName(inline value: GtkTreeViewDropPosition): Option[String] =
    inline value match
      case GTK_TREE_VIEW_DROP_BEFORE => Some("GTK_TREE_VIEW_DROP_BEFORE")
      case GTK_TREE_VIEW_DROP_AFTER => Some("GTK_TREE_VIEW_DROP_AFTER")
      case GTK_TREE_VIEW_DROP_INTO_OR_BEFORE => Some("GTK_TREE_VIEW_DROP_INTO_OR_BEFORE")
      case GTK_TREE_VIEW_DROP_INTO_OR_AFTER => Some("GTK_TREE_VIEW_DROP_INTO_OR_AFTER")
      case _ => None
  extension (a: GtkTreeViewDropPosition)
    inline def &(b: GtkTreeViewDropPosition): GtkTreeViewDropPosition = a & b
    inline def |(b: GtkTreeViewDropPosition): GtkTreeViewDropPosition = a | b
    inline def is(b: GtkTreeViewDropPosition): Boolean = (a & b) == b

/**
 * GtkTreeViewGridLines: _TREE_VIEW_GRID_LINES_NONE: No grid lines. _TREE_VIEW_GRID_LINES_HORIZONTAL: Horizontal grid lines. _TREE_VIEW_GRID_LINES_VERTICAL: Vertical grid lines. _TREE_VIEW_GRID_LINES_BOTH: Horizontal and vertical grid lines.
*/
opaque type GtkTreeViewGridLines = CUnsignedInt
object GtkTreeViewGridLines extends CEnumU[GtkTreeViewGridLines]:
  given _tag: Tag[GtkTreeViewGridLines] = Tag.UInt
  inline def define(inline a: Long): GtkTreeViewGridLines = a.toUInt
  val GTK_TREE_VIEW_GRID_LINES_NONE = define(0)
  val GTK_TREE_VIEW_GRID_LINES_HORIZONTAL = define(1)
  val GTK_TREE_VIEW_GRID_LINES_VERTICAL = define(2)
  val GTK_TREE_VIEW_GRID_LINES_BOTH = define(3)
  inline def getName(inline value: GtkTreeViewGridLines): Option[String] =
    inline value match
      case GTK_TREE_VIEW_GRID_LINES_NONE => Some("GTK_TREE_VIEW_GRID_LINES_NONE")
      case GTK_TREE_VIEW_GRID_LINES_HORIZONTAL => Some("GTK_TREE_VIEW_GRID_LINES_HORIZONTAL")
      case GTK_TREE_VIEW_GRID_LINES_VERTICAL => Some("GTK_TREE_VIEW_GRID_LINES_VERTICAL")
      case GTK_TREE_VIEW_GRID_LINES_BOTH => Some("GTK_TREE_VIEW_GRID_LINES_BOTH")
      case _ => None
  extension (a: GtkTreeViewGridLines)
    inline def &(b: GtkTreeViewGridLines): GtkTreeViewGridLines = a & b
    inline def |(b: GtkTreeViewGridLines): GtkTreeViewGridLines = a | b
    inline def is(b: GtkTreeViewGridLines): Boolean = (a & b) == b

/**
 * GtkUnit: _UNIT_NONE: No units. _UNIT_POINTS: Dimensions in points. _UNIT_INCH: Dimensions in inches. _UNIT_MM: Dimensions in millimeters
*/
opaque type GtkUnit = CUnsignedInt
object GtkUnit extends CEnumU[GtkUnit]:
  given _tag: Tag[GtkUnit] = Tag.UInt
  inline def define(inline a: Long): GtkUnit = a.toUInt
  val GTK_UNIT_NONE = define(0)
  val GTK_UNIT_POINTS = define(1)
  val GTK_UNIT_INCH = define(2)
  val GTK_UNIT_MM = define(3)
  inline def getName(inline value: GtkUnit): Option[String] =
    inline value match
      case GTK_UNIT_NONE => Some("GTK_UNIT_NONE")
      case GTK_UNIT_POINTS => Some("GTK_UNIT_POINTS")
      case GTK_UNIT_INCH => Some("GTK_UNIT_INCH")
      case GTK_UNIT_MM => Some("GTK_UNIT_MM")
      case _ => None
  extension (a: GtkUnit)
    inline def &(b: GtkUnit): GtkUnit = a & b
    inline def |(b: GtkUnit): GtkUnit = a | b
    inline def is(b: GtkUnit): Boolean = (a & b) == b

/**
 * GtkWrapMode: _WRAP_NONE: do not wrap lines; just make the text area wider _WRAP_CHAR: wrap text, breaking lines anywhere the cursor can appear (between characters, usually - if you want to be technical, between graphemes, see pango_get_log_attrs()) _WRAP_WORD: wrap text, breaking lines in between words _WRAP_WORD_CHAR: wrap text, breaking lines in between words, or if that is not enough, also between graphemes
*/
opaque type GtkWrapMode = CUnsignedInt
object GtkWrapMode extends CEnumU[GtkWrapMode]:
  given _tag: Tag[GtkWrapMode] = Tag.UInt
  inline def define(inline a: Long): GtkWrapMode = a.toUInt
  val GTK_WRAP_NONE = define(0)
  val GTK_WRAP_CHAR = define(1)
  val GTK_WRAP_WORD = define(2)
  val GTK_WRAP_WORD_CHAR = define(3)
  inline def getName(inline value: GtkWrapMode): Option[String] =
    inline value match
      case GTK_WRAP_NONE => Some("GTK_WRAP_NONE")
      case GTK_WRAP_CHAR => Some("GTK_WRAP_CHAR")
      case GTK_WRAP_WORD => Some("GTK_WRAP_WORD")
      case GTK_WRAP_WORD_CHAR => Some("GTK_WRAP_WORD_CHAR")
      case _ => None
  extension (a: GtkWrapMode)
    inline def &(b: GtkWrapMode): GtkWrapMode = a & b
    inline def |(b: GtkWrapMode): GtkWrapMode = a | b
    inline def is(b: GtkWrapMode): Boolean = (a & b) == b