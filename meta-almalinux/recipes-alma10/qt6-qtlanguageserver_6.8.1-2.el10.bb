
PN = "qt6-qtlanguageserver"
PE = "0"
PV = "6.8.1"
PR = "2.el10"
PACKAGES = "qt6-qtlanguageserver qt6-qtlanguageserver-devel qt6-qtlanguageserver-tests"


URI_qt6-qtlanguageserver = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtlanguageserver-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtlanguageserver = " \
 qt6-qtbase \
"

URI_qt6-qtlanguageserver-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtlanguageserver-devel-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtlanguageserver-devel = " \
 qt6-qtlanguageserver \
 qt6-qtbase-devel \
 cmake-filesystem \
"

URI_qt6-qtlanguageserver-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qtlanguageserver-tests-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtlanguageserver-tests = " \
 qt6-qtlanguageserver \
 libgcc \
 qt6-qtbase \
 libstdc++ \
 glibc \
"
