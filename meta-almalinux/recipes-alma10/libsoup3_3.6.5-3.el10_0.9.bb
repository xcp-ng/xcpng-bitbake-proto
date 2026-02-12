
inherit dnf-bridge

PN = "libsoup3"
PE = "0"
PV = "3.6.5"
PR = "3.el10_0.9"
PACKAGES = "libsoup3 libsoup3-devel libsoup3-doc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libsoup3-3.6.5-3.el10_0.9.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libsoup3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libsoup3-3.6.5-3.el10_0.9.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libsoup3}"
RDEPENDS:libsoup3 = " \
 zlib-ng-compat \
 libpsl \
 libbrotli \
 sqlite-libs \
 krb5-libs \
 glib2 \
 libnghttp2 \
 glibc \
"

URI_libsoup3-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libsoup3-devel-3.6.5-3.el10_0.9.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libsoup3-devel}"
RDEPENDS:libsoup3-devel = " \
 sysprof-capture-devel \
 brotli-devel \
 libsoup3 \
 glib2-devel \
 zlib-ng-compat-devel \
 pkgconf-pkg-config \
 libnghttp2-devel \
 krb5-devel \
 sqlite-devel \
 libpsl-devel \
"

URI_libsoup3-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libsoup3-doc-3.6.5-3.el10_0.9.noarch.rpm;unpack=0"
SRC_URI += "${URI_libsoup3-doc}"
RDEPENDS:libsoup3-doc = ""
