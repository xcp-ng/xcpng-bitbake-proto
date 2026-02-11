
inherit dnf-bridge

PN = "qt6-qtserialport"
PE = "0"
PV = "6.8.1"
PR = "2.el10"
PACKAGES = "qt6-qtserialport qt6-qtserialport-devel qt6-qtserialport-examples qt6-qtserialport-tests"


URI_qt6-qtserialport = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtserialport-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtserialport = " \
 glibc \
 libstdc++ \
 systemd-libs \
 qt6-qtbase \
"

URI_qt6-qtserialport-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtserialport-devel-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtserialport-devel = " \
 qt6-qtserialport \
 qt6-qtbase-devel \
 cmake-filesystem \
 pkgconf-pkg-config \
"

URI_qt6-qtserialport-examples = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qt6-qtserialport-examples-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtserialport-examples = " \
 libgcc \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
 qt6-qtserialport \
"

URI_qt6-qtserialport-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qtserialport-tests-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtserialport-tests = " \
 libgcc \
 qt6-qtbase \
 libstdc++ \
 glibc \
 qt6-qtserialport \
"
