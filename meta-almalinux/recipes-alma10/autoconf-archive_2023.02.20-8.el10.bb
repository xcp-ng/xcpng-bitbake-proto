
inherit dnf-bridge

PN = "autoconf-archive"
PE = "0"
PV = "2023.02.20"
PR = "8.el10"
PACKAGES = "autoconf-archive"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/autoconf-archive-2023.02.20-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_autoconf-archive = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/autoconf-archive-2023.02.20-8.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_autoconf-archive}"
RDEPENDS:autoconf-archive = " \
 autoconf \
"
