
inherit dnf-bridge

PN = "qpdf"
PE = "0"
PV = "11.8.0"
PR = "5.el10"
PACKAGES = "qpdf-libs qpdf qpdf-devel qpdf-doc"


URI_qpdf-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qpdf-libs-11.8.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qpdf-libs = " \
 zlib-ng-compat \
 gnutls \
 libgcc \
 libstdc++ \
 glibc \
 libjpeg-turbo \
"

URI_qpdf = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qpdf-11.8.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qpdf = " \
 glibc \
 qpdf-libs \
 libgcc \
 libstdc++ \
"

URI_qpdf-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qpdf-devel-11.8.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qpdf-devel = " \
 qpdf-libs \
 gnutls-devel \
 zlib-ng-compat-devel \
 pkgconf-pkg-config \
 libjpeg-turbo-devel \
"

URI_qpdf-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qpdf-doc-11.8.0-5.el10.noarch.rpm;unpack=0"
RDEPENDS:qpdf-doc = " \
 qpdf-libs \
"
