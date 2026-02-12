
inherit dnf-bridge

PN = "boom-boot"
PE = "0"
PV = "1.6.5"
PR = "3.el10"
PACKAGES = "boom-boot boom-boot-conf python3-boom"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/boom-boot-1.6.5-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_boom-boot = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/boom-boot-1.6.5-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_boom-boot}"
RDEPENDS:boom-boot = " \
 python3 \
 systemd \
 python3-boom \
 python3-dbus \
 boom-boot-conf \
"

URI_boom-boot-conf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/boom-boot-conf-1.6.5-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_boom-boot-conf}"
RDEPENDS:boom-boot-conf = ""

URI_python3-boom = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-boom-1.6.5-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-boom}"
RDEPENDS:python3-boom = " \
 python3 \
 python3-dbus \
"
