
inherit dnf-bridge

PN = "exiv2"
PE = "0"
PV = "0.28.3"
PR = "3.el10_0.2"
PACKAGES = "exiv2 exiv2-libs exiv2-devel exiv2-doc"


URI_exiv2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/exiv2-0.28.3-3.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:exiv2 = " \
 glibc \
 libgcc \
 libstdc++ \
 exiv2-libs \
"

URI_exiv2-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/exiv2-libs-0.28.3-3.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:exiv2-libs = " \
 zlib-ng-compat \
 inih-cpp \
 libgcc \
 libbrotli \
 libstdc++ \
 expat \
 glibc \
"

URI_exiv2-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/exiv2-devel-0.28.3-3.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:exiv2-devel = " \
 brotli-devel \
 cmake-filesystem \
 inih-devel \
 zlib-ng-compat-devel \
 pkgconf-pkg-config \
 exiv2-libs \
 expat-devel \
"

URI_exiv2-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/exiv2-doc-0.28.3-3.el10_0.2.noarch.rpm;unpack=0"
RDEPENDS:exiv2-doc = ""
