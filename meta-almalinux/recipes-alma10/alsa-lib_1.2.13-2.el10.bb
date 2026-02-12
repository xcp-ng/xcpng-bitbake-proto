
inherit dnf-bridge

PN = "alsa-lib"
PE = "0"
PV = "1.2.13"
PR = "2.el10"
PACKAGES = "alsa-lib alsa-lib-devel alsa-ucm alsa-topology"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/alsa-lib-1.2.13-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_alsa-lib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/alsa-lib-1.2.13-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_alsa-lib}"
RDEPENDS:alsa-lib = " \
 glibc \
"

URI_alsa-lib-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/alsa-lib-devel-1.2.13-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_alsa-lib-devel}"
RDEPENDS:alsa-lib-devel = " \
 alsa-lib \
 alsa-lib-devel \
 pkgconf-pkg-config \
"

URI_alsa-ucm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/alsa-ucm-1.2.13-2.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_alsa-ucm}"
RDEPENDS:alsa-ucm = " \
 alsa-lib \
"

URI_alsa-topology = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/alsa-topology-1.2.13-2.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_alsa-topology}"
RDEPENDS:alsa-topology = " \
 alsa-lib \
"
