
inherit dnf-bridge

PN = "icu"
PE = "0"
PV = "74.2"
PR = "5.el10_0"
PACKAGES = "libicu icu libicu-devel libicu-doc"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/icu-74.2-5.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libicu = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libicu-74.2-5.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libicu}"
RDEPENDS:libicu = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_icu = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/icu-74.2-5.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_icu}"
RDEPENDS:icu = " \
 glibc \
 libicu \
 libgcc \
 libstdc++ \
"

URI_libicu-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libicu-devel-74.2-5.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libicu-devel}"
RDEPENDS:libicu-devel = " \
 libicu-devel \
 pkgconf-pkg-config \
 bash \
 glibc \
 libicu \
"

URI_libicu-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libicu-doc-74.2-5.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_libicu-doc}"
RDEPENDS:libicu-doc = ""
