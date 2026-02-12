
inherit dnf-bridge

PN = "libpfm"
PE = "0"
PV = "4.13.0"
PR = "10.el10"
PACKAGES = "libpfm libpfm-devel python3-libpfm libpfm-static"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libpfm-4.13.0-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libpfm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libpfm-4.13.0-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libpfm}"
RDEPENDS:libpfm = " \
 glibc \
"

URI_libpfm-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libpfm-devel-4.13.0-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libpfm-devel}"
RDEPENDS:libpfm-devel = " \
 libpfm \
"

URI_python3-libpfm = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-libpfm-4.13.0-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-libpfm}"
RDEPENDS:python3-libpfm = " \
 glibc \
 python3 \
 libpfm \
"

URI_libpfm-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libpfm-static-4.13.0-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libpfm-static}"
RDEPENDS:libpfm-static = " \
 libpfm \
"
