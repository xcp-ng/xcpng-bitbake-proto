
inherit dnf-bridge

PN = "libjcat"
PE = "0"
PV = "0.2.2"
PR = "2.el10"
PACKAGES = "libjcat libjcat-devel libjcat-tests"


URI_libjcat = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libjcat-0.2.2-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libjcat = " \
 gnutls \
 libgcc \
 gpgme \
 json-glib \
 libgpg-error \
 glib2 \
 glibc \
"

URI_libjcat-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libjcat-devel-0.2.2-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libjcat-devel = " \
 json-glib-devel \
 glib2-devel \
 gnutls-devel \
 pkgconf-pkg-config \
 libjcat \
"

URI_libjcat-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libjcat-tests-0.2.2-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libjcat-tests = " \
 gnutls \
 libgcc \
 gpgme \
 json-glib \
 libgpg-error \
 glib2 \
 glibc \
"
