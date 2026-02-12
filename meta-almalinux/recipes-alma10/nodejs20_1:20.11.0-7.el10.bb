
inherit dnf-bridge

PN = "nodejs20"
PE = "1"
PV = "20.11.0"
PR = "7.el10"
PACKAGES = "nodejs nodejs-devel nodejs-libs v8-11.3-devel"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/nodejs20-20.11.0-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_nodejs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/nodejs-20.11.0-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_nodejs}"
RDEPENDS:nodejs = " \
 nodejs-libs \
 nodejs-undici \
 ca-certificates \
 openssl \
 libuv \
 glibc \
 nodejs-cjs-module-lexer \
"

URI_nodejs-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/nodejs-devel-20.11.0-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_nodejs-devel}"
RDEPENDS:nodejs-devel = " \
 nodejs-libs \
 brotli-devel \
 zlib-ng-compat-devel \
 pkgconf-pkg-config \
 openssl-devel \
 libuv-devel \
 nodejs-packaging \
 nodejs \
"

URI_nodejs-libs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/nodejs-libs-20.11.0-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_nodejs-libs}"
RDEPENDS:nodejs-libs = " \
 zlib-ng-compat \
 openssl-libs \
 libbrotli \
 libstdc++ \
 libuv \
 glibc \
"

URI_v8-11.3-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/v8-11.3-devel-11.3.244.8-1.20.11.0.7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_v8-11.3-devel}"
RDEPENDS:v8-11.3-devel = " \
 nodejs-devel \
 nodejs-libs \
 pkgconf-pkg-config \
"
