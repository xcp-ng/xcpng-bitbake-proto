
inherit dnf-bridge

PN = "gpgme"
PE = "0"
PV = "1.23.2"
PR = "6.el10.alma.1"
PACKAGES = "gpgme python3-gpg gpgmepp gpgme-devel gpgmepp-devel qgpgme-common-devel qgpgme-qt6 qgpgme-qt6-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/gpgme-1.23.2-6.el10.alma.1.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_gpgme = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/gpgme-1.23.2-6.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gpgme}"
RDEPENDS:gpgme = " \
 glibc \
 gnupg2 \
 libassuan \
 libgpg-error \
"

URI_python3-gpg = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-gpg-1.23.2-6.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-gpg}"
RDEPENDS:python3-gpg = " \
 glibc \
 gpgme \
 python3 \
"

URI_gpgmepp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gpgmepp-1.23.2-6.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gpgmepp}"
RDEPENDS:gpgmepp = " \
 libassuan \
 gpgme \
 libgcc \
 libstdc++ \
 glibc \
"

URI_gpgme-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gpgme-devel-1.23.2-6.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gpgme-devel}"
RDEPENDS:gpgme-devel = " \
 glib2-devel \
 libassuan \
 libassuan-devel \
 gpgme \
 pkgconf-pkg-config \
 libgpg-error-devel \
 libgpg-error \
 bash \
 glibc \
"

URI_gpgmepp-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gpgmepp-devel-1.23.2-6.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gpgmepp-devel}"
RDEPENDS:gpgmepp-devel = " \
 gpgme-devel \
 cmake-filesystem \
 gpgmepp \
"

URI_qgpgme-common-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qgpgme-common-devel-1.23.2-6.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qgpgme-common-devel}"
RDEPENDS:qgpgme-common-devel = " \
 gpgmepp-devel \
"

URI_qgpgme-qt6 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qgpgme-qt6-1.23.2-6.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qgpgme-qt6}"
RDEPENDS:qgpgme-qt6 = " \
 libassuan \
 gpgme \
 libgcc \
 gpgmepp \
 qt6-qtbase \
 libgpg-error \
 libstdc++ \
 glibc \
"

URI_qgpgme-qt6-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qgpgme-qt6-devel-1.23.2-6.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qgpgme-qt6-devel}"
RDEPENDS:qgpgme-qt6-devel = " \
 cmake-filesystem \
 qgpgme-common-devel \
 qgpgme-qt6 \
"
