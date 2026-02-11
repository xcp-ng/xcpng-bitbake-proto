
inherit dnf-bridge

PN = "ibus-typing-booster"
PE = "0"
PV = "2.25.13"
PR = "2.el10"
PACKAGES = "ibus-typing-booster emoji-picker ibus-typing-booster-tests"


URI_ibus-typing-booster = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ibus-typing-booster-2.25.13-2.el10.noarch.rpm;unpack=0"
RDEPENDS:ibus-typing-booster = " \
 python3 \
 python3-distro \
 python3-dbus \
 cldr-emoji-annotation \
 ibus \
 unicode-ucd \
 bash \
 python3-pyxdg \
 python3-packaging \
 python3-enchant \
 m17n-lib \
"

URI_emoji-picker = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/emoji-picker-2.25.13-2.el10.noarch.rpm;unpack=0"
RDEPENDS:emoji-picker = " \
 ibus-typing-booster \
 bash \
"

URI_ibus-typing-booster-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ibus-typing-booster-tests-2.25.13-2.el10.noarch.rpm;unpack=0"
RDEPENDS:ibus-typing-booster-tests = " \
 python3 \
 ibus-typing-booster \
"
