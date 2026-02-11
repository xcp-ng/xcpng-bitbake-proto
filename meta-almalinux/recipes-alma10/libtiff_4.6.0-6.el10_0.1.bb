
inherit dnf-bridge

PN = "libtiff"
PE = "0"
PV = "4.6.0"
PR = "6.el10_0.1"
PACKAGES = "libtiff libtiff-devel libtiff-tools libtiff-static"


URI_libtiff = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libtiff-4.6.0-6.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtiff = " \
 zlib-ng-compat \
 liblerc \
 libgcc \
 libwebp \
 libzstd \
 libstdc++ \
 jbigkit-libs \
 glibc \
 libjpeg-turbo \
"

URI_libtiff-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libtiff-devel-4.6.0-6.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtiff-devel = " \
 zlib-ng-compat-devel \
 libzstd-devel \
 libwebp-devel \
 pkgconf-pkg-config \
 libjpeg-turbo-devel \
 libtiff \
"

URI_libtiff-tools = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libtiff-tools-4.6.0-6.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtiff-tools = " \
 glibc \
 libtiff \
"

URI_libtiff-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libtiff-static-4.6.0-6.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtiff-static = " \
 libtiff-devel \
"
