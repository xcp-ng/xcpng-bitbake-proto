
PN = "ibus-typing-booster"
PE = "0"
PV = "2.25.13"
PR = "2.el10"
PACKAGES = "ibus-typing-booster emoji-picker ibus-typing-booster-tests"


URI_ibus-typing-booster = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ibus-typing-booster-2.25.13-2.el10.noarch.rpm;unpack=0"
RDEPENDS:ibus-typing-booster = "/usr/bin/sh ( ) /usr/bin/python3 ( ) python3-dbus ( ) python3-packaging ( ) python3-distro ( ) cldr-emoji-annotation ( ) m17n-lib ( ) python3-enchant ( ) python3-pyxdg ( ) unicode-ucd ( ) ibus ( >=  1.5.3)"
RPROVIDES:ibus-typing-booster = "metainfo() ( ) application() ( ) application(ibus-setup-typing-booster.desktop) ( ) metainfo(typing-booster.appdata.xml) ( ) ibus-typing-booster ( =  2.25.13-2.el10)"

URI_emoji-picker = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/emoji-picker-2.25.13-2.el10.noarch.rpm;unpack=0"
RDEPENDS:emoji-picker = "/usr/bin/sh ( ) ibus-typing-booster ( =  2.25.13-2.el10)"
RPROVIDES:emoji-picker = "metainfo() ( ) application() ( ) application(emoji-picker.desktop) ( ) metainfo(emoji-picker.appdata.xml) ( ) emoji-picker ( =  2.25.13-2.el10)"

URI_ibus-typing-booster-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ibus-typing-booster-tests-2.25.13-2.el10.noarch.rpm;unpack=0"
RDEPENDS:ibus-typing-booster-tests = "/usr/bin/python3 ( ) ibus-typing-booster ( =  2.25.13-2.el10)"
RPROVIDES:ibus-typing-booster-tests = "ibus-typing-booster-tests ( =  2.25.13-2.el10)"
