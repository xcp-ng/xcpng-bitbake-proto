
inherit dnf-bridge

PN = "babl"
PE = "0"
PV = "0.1.106"
PR = "5.el10"
PACKAGES = "babl babl-devel babl-devel-docs"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/babl-0.1.106-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_babl = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/babl-0.1.106-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_babl}"
RDEPENDS:babl = " \
 glibc \
 lcms2 \
"

URI_babl-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/babl-devel-0.1.106-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_babl-devel}"
RDEPENDS:babl-devel = " \
 babl \
 pkgconf-pkg-config \
 lcms2-devel \
"

URI_babl-devel-docs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/babl-devel-docs-0.1.106-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_babl-devel-docs}"
RDEPENDS:babl-devel-docs = " \
 babl-devel \
"
