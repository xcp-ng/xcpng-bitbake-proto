
inherit dnf-bridge

PN = "curl"
PE = "0"
PV = "8.9.1"
PR = "5.el10"
PACKAGES = "curl libcurl libcurl-minimal libcurl-devel"


URI_curl = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/curl-8.9.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:curl = " \
 glibc \
 libcurl \
"

URI_libcurl = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libcurl-8.9.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcurl = " \
 zlib-ng-compat \
 libssh \
 libpsl \
 openssl-libs \
 libbrotli \
 krb5-libs \
 libnghttp2 \
 glibc \
 libidn2 \
 openldap \
"

URI_libcurl-minimal = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libcurl-minimal-8.9.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcurl-minimal = " \
 zlib-ng-compat \
 openssl-libs \
 krb5-libs \
 libnghttp2 \
 glibc \
 libidn2 \
"

URI_libcurl-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libcurl-devel-8.9.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcurl-devel = " \
 brotli-devel \
 zlib-ng-compat-devel \
 libidn2-devel \
 pkgconf-pkg-config \
 libssh-devel \
 openssl-devel \
 bash \
 libcurl \
 libnghttp2-devel \
 libpsl-devel \
"
