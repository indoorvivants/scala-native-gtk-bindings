package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

class MountOperation(private[fluent] val raw: Ptr[GMountOperation]) extends GObject.Object:
  def getAnonymous(): Boolean = g_mount_operation_get_anonymous(this.raw)

  def getChoice(): Int = g_mount_operation_get_choice(this.raw)

  def getDomain(): String = g_mount_operation_get_domain(this.raw)

  def getIsTcryptHiddenVolume(): Boolean = g_mount_operation_get_is_tcrypt_hidden_volume(this.raw)

  def getIsTcryptSystemVolume(): Boolean = g_mount_operation_get_is_tcrypt_system_volume(this.raw)

  def getPassword(): String = g_mount_operation_get_password(this.raw)

  def getPasswordSave(): GPasswordSave = g_mount_operation_get_password_save(this.raw)

  def getPim(): Any /* Some(guint): guint*/ = g_mount_operation_get_pim(this.raw)

  def getUsername(): String = g_mount_operation_get_username(this.raw)

  def reply(result : GMountOperationResult): Unit = g_mount_operation_reply(this.raw, result)

  def setAnonymous(anonymous : Boolean): Unit = g_mount_operation_set_anonymous(this.raw, anonymous)

  def setChoice(choice : Int): Unit = g_mount_operation_set_choice(this.raw, choice)

  def setDomain(domain : String): Unit = g_mount_operation_set_domain(this.raw, domain)

  def setIsTcryptHiddenVolume(hidden_volume : Boolean): Unit = g_mount_operation_set_is_tcrypt_hidden_volume(this.raw, hidden_volume)

  def setIsTcryptSystemVolume(system_volume : Boolean): Unit = g_mount_operation_set_is_tcrypt_system_volume(this.raw, system_volume)

  def setPassword(password : String): Unit = g_mount_operation_set_password(this.raw, password)

  def setPasswordSave(save : GPasswordSave): Unit = g_mount_operation_set_password_save(this.raw, save)

  def setPim(pim : Any /* Some(guint): guint*/): Unit = g_mount_operation_set_pim(this.raw, pim)

  def setUsername(username : String): Unit = g_mount_operation_set_username(this.raw, username)

end MountOperation

object MountOperation:
  def apply(): MountOperation = MountOperation(g_mount_operation_new())

end MountOperation
