
inherit dnf-bridge

PN = "librepo"
PE = "0"
PV = "1.18.0"
PR = "6.el10_0"
PACKAGES = "librepo python3-librepo librepo-devel"


URI_librepo = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/librepo-1.18.0-6.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:librepo = " \
 openssl-libs \
 libgcc \
 libxml2 \
 glib2 \
 libcurl \
 glibc \
 rpm-libs \
"

URI_python3-librepo = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-librepo-1.18.0-6.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-librepo = " \
 python3 \
 libgcc \
 python3-libs \
 librepo \
 glib2 \
 glibc \
"

URI_librepo-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/librepo-devel-1.18.0-6.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:librepo-devel = " \
 libxml2-devel \
 glib2-devel \
 pkgconf-pkg-config \
 openssl-devel \
 librepo \
 libcurl-devel \
"
