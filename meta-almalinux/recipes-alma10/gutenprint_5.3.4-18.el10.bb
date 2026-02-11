
inherit dnf-bridge

PN = "gutenprint"
PE = "0"
PV = "5.3.4"
PR = "18.el10"
PACKAGES = "gutenprint gutenprint-cups gutenprint-doc gutenprint-libs gutenprint-devel"


URI_gutenprint = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gutenprint-5.3.4-18.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gutenprint = " \
 glibc \
 cups-client \
 gutenprint-libs \
"

URI_gutenprint-cups = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gutenprint-cups-5.3.4-18.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gutenprint-cups = " \
 python3 \
 gutenprint \
 zlib-ng-compat \
 python3-charset-normalizer \
 gutenprint-libs \
 cups-libs \
 cups \
 bash \
 glibc \
 libusb1 \
"

URI_gutenprint-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gutenprint-doc-5.3.4-18.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gutenprint-doc = ""

URI_gutenprint-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gutenprint-libs-5.3.4-18.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gutenprint-libs = " \
 glibc \
"

URI_gutenprint-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gutenprint-devel-5.3.4-18.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gutenprint-devel = " \
 gutenprint \
 gutenprint-libs \
 pkgconf-pkg-config \
"
