
inherit dnf-bridge

PN = "hspell"
PE = "0"
PV = "1.4"
PR = "23.el10"
PACKAGES = "hunspell-he hspell hspell-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hspell-1.4-23.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-he = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-he-1.4-23.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_hunspell-he}"
RDEPENDS:hunspell-he = " \
 hunspell \
"

URI_hspell = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/hspell-1.4-23.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_hspell}"
RDEPENDS:hspell = " \
 zlib-ng-compat \
 perl-libs \
 perl-IO \
 perl-Getopt-Long \
 perl-IPC-Open3 \
 glibc \
 perl-interpreter \
"

URI_hspell-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/hspell-devel-1.4-23.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_hspell-devel}"
RDEPENDS:hspell-devel = " \
 hspell \
"
