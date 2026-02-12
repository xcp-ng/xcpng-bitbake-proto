
inherit dnf-bridge

PN = "xkeyboard-config"
PE = "0"
PV = "2.41"
PR = "3.el10"
PACKAGES = "xkeyboard-config xkeyboard-config-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/xkeyboard-config-2.41-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_xkeyboard-config = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xkeyboard-config-2.41-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_xkeyboard-config}"
RDEPENDS:xkeyboard-config = ""

URI_xkeyboard-config-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xkeyboard-config-devel-2.41-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_xkeyboard-config-devel}"
RDEPENDS:xkeyboard-config-devel = " \
 xkeyboard-config \
 pkgconf-pkg-config \
"
