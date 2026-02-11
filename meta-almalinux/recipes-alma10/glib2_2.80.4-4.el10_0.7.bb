
inherit dnf-bridge

PN = "glib2"
PE = "0"
PV = "2.80.4"
PR = "4.el10_0.7"
PACKAGES = "glib2 glib2-devel glib2-tests glib2-doc glib2-static"


URI_glib2 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/glib2-2.80.4-4.el10_0.7.x86_64_v2.rpm;unpack=0"
RDEPENDS:glib2 = " \
 zlib-ng-compat \
 gnutls \
 libffi \
 libmount \
 bash \
 pcre2 \
 glibc \
 libselinux \
"

URI_glib2-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/glib2-devel-2.80.4-4.el10_0.7.x86_64_v2.rpm;unpack=0"
RDEPENDS:glib2-devel = " \
 python3 \
 sysprof-capture-devel \
 glib2-devel \
 libffi \
 zlib-ng-compat-devel \
 pkgconf-pkg-config \
 elfutils-libelf \
 libmount-devel \
 pcre2-devel \
 bash \
 glib2 \
 libselinux-devel \
 glibc \
 python3-packaging \
 libffi-devel \
"

URI_glib2-tests = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/glib2-tests-2.80.4-4.el10_0.7.x86_64_v2.rpm;unpack=0"
RDEPENDS:glib2-tests = " \
 python3 \
 libgcc \
 bash \
 glib2 \
 pcre2 \
 glibc \
"

URI_glib2-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/glib2-doc-2.80.4-4.el10_0.7.x86_64_v2.rpm;unpack=0"
RDEPENDS:glib2-doc = " \
 glib2 \
"

URI_glib2-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/glib2-static-2.80.4-4.el10_0.7.x86_64_v2.rpm;unpack=0"
RDEPENDS:glib2-static = " \
 glib2-devel \
 sysprof-capture-devel \
 pcre2-static \
"
