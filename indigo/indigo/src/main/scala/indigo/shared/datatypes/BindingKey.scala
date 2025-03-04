package indigo.shared.datatypes

import indigo.shared.dice.Dice

opaque type BindingKey = String

object BindingKey:
  def apply(value: String): BindingKey =
    value
  def fromDice(dice: Dice): BindingKey =
    BindingKey(dice.rollAlphaNumeric)
  def generate(dice: Dice): BindingKey =
    fromDice(dice)

  given CanEqual[BindingKey, BindingKey]                 = CanEqual.derived
  given CanEqual[Option[BindingKey], Option[BindingKey]] = CanEqual.derived
