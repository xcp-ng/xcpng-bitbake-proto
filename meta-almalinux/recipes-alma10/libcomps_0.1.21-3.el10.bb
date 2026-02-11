
PN = "libcomps"
PE = "0"
PV = "0.1.21"
PR = "3.el10"
PACKAGES = "libcomps python3-libcomps libcomps-devel libcomps-doc python-libcomps-doc"


URI_libcomps = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libcomps-0.1.21-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcomps = " \
 glibc \
 libxml2 \
 expat \
"

URI_python3-libcomps = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-libcomps-0.1.21-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-libcomps = " \
 python3 \
 zlib-ng-compat \
 python3-libs \
 libcomps \
 glibc \
"

URI_libcomps-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libcomps-devel-0.1.21-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcomps-devel = " \
 libxml2-devel \
 expat-devel \
 libcomps \
 pkgconf-pkg-config \
"

URI_libcomps-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libcomps-doc-0.1.21-3.el10.noarch.rpm;unpack=0"
RDEPENDS:libcomps-doc = " \
 libcomps \
"

URI_python-libcomps-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python-libcomps-doc-0.1.21-3.el10.noarch.rpm;unpack=0"
RDEPENDS:python-libcomps-doc = " \
 libcomps \
"
