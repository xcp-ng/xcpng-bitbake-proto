
inherit dnf-bridge

PN = "autoconf-archive"
PE = "0"
PV = "2023.02.20"
PR = "8.el10"
PACKAGES = "autoconf-archive"


URI_autoconf-archive = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/autoconf-archive-2023.02.20-8.el10.noarch.rpm;unpack=0"
RDEPENDS:autoconf-archive = " \
 autoconf \
"
