
PN = "nodejs22"
PE = "1"
PV = "22.19.0"
PR = "2.el10_0"
PACKAGES = "nodejs nodejs-devel nodejs-docs nodejs-full-i18n nodejs-libs nodejs-npm v8-12.4-devel"


URI_nodejs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nodejs-22.19.0-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nodejs = " \
 nodejs-libs \
 ca-certificates \
 openssl \
 libuv \
 glibc \
"

URI_nodejs-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nodejs-devel-22.19.0-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nodejs-devel = " \
 brotli-devel \
 zlib-ng-compat-devel \
 nodejs \
 pkgconf-pkg-config \
 openssl-devel \
 bash \
 libuv-devel \
 nodejs-libs \
 nodejs-packaging \
"

URI_nodejs-docs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nodejs-docs-22.19.0-2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:nodejs-docs = " \
 nodejs \
"

URI_nodejs-full-i18n = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nodejs-full-i18n-22.19.0-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nodejs-full-i18n = " \
 nodejs \
"

URI_nodejs-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nodejs-libs-22.19.0-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nodejs-libs = " \
 zlib-ng-compat \
 openssl-libs \
 libgcc \
 libbrotli \
 sqlite-libs \
 libstdc++ \
 libuv \
 glibc \
"

URI_nodejs-npm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nodejs-npm-10.9.3-1.22.19.0.2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nodejs-npm = " \
 nodejs \
 bash \
"

URI_v8-12.4-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/v8-12.4-devel-12.4.254.21-1.22.19.0.2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:v8-12.4-devel = " \
 nodejs-libs \
 pkgconf-pkg-config \
 nodejs-devel \
"
