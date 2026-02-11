
PN = "qt6-qt5compat"
PE = "0"
PV = "6.8.1"
PR = "1.el10"
PACKAGES = "qt6-qt5compat qt6-qt5compat-devel qt6-qt5compat-examples qt6-qt5compat-tests"


URI_qt6-qt5compat = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qt5compat-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qt5compat = " \
 qt6-qtdeclarative \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
 libicu \
 qt6-qtshadertools \
"

URI_qt6-qt5compat-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qt5compat-devel-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qt5compat-devel = " \
 qt6-qtbase-devel \
 qt6-qt5compat \
 cmake-filesystem \
 pkgconf-pkg-config \
"

URI_qt6-qt5compat-examples = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qt6-qt5compat-examples-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qt5compat-examples = " \
 libgcc \
 qt6-qt5compat \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"

URI_qt6-qt5compat-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qt5compat-tests-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qt5compat-tests = " \
 libgcc \
 qt6-qt5compat \
 qt6-qtbase \
 libstdc++ \
 bash \
 glibc \
"
