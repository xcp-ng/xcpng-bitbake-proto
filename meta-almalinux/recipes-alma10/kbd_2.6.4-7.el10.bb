
inherit dnf-bridge

PN = "kbd"
PE = "0"
PV = "2.6.4"
PR = "7.el10"
PACKAGES = "kbd kbd-legacy kbd-misc"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/kbd-2.6.4-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_kbd = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kbd-2.6.4-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_kbd}"
RDEPENDS:kbd = " \
 kbd-legacy \
 pam-libs \
 kbd-misc \
 bash \
 glibc \
"

URI_kbd-legacy = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kbd-legacy-2.6.4-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_kbd-legacy}"
RDEPENDS:kbd-legacy = ""

URI_kbd-misc = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kbd-misc-2.6.4-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_kbd-misc}"
RDEPENDS:kbd-misc = ""
