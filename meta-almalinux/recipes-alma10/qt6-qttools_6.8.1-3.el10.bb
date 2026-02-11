
PN = "qt6-qttools"
PE = "0"
PV = "6.8.1"
PR = "3.el10"
PACKAGES = "qt6-assistant qt6-designer qt6-doctools qt6-linguist qt6-qdbusviewer qt6-qttools qt6-qttools-common qt6-qttools-devel qt6-qttools-libs-designer qt6-qttools-libs-designercomponents qt6-qttools-libs-help qt6-qttools-examples qt6-qttools-static qt6-qttools-tests"


URI_qt6-assistant = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-assistant-6.8.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-assistant = " \
 qt6-qttools-common \
 libgcc \
 qt6-qttools-libs-help \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"

URI_qt6-designer = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-designer-6.8.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-designer = " \
 qt6-qttools-libs-designer \
 qt6-qttools-libs-designercomponents \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"

URI_qt6-doctools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-doctools-6.8.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-doctools = " \
 qt6-qtdeclarative \
 qt6-qttools-libs-help \
 clang-libs \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
 llvm-libs \
"

URI_qt6-linguist = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-linguist-6.8.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-linguist = " \
 qt6-qtdeclarative \
 qt6-qttools \
 qt6-qttools-common \
 clang-libs \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
 llvm-libs \
"

URI_qt6-qdbusviewer = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qdbusviewer-6.8.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qdbusviewer = " \
 qt6-qttools-common \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"

URI_qt6-qttools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qttools-6.8.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qttools = " \
 qt6-qttools-common \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"

URI_qt6-qttools-common = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qttools-common-6.8.1-3.el10.noarch.rpm;unpack=0"
RDEPENDS:qt6-qttools-common = ""

URI_qt6-qttools-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qttools-devel-6.8.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qttools-devel = " \
 cmake-filesystem \
 qt6-designer \
 qt6-doctools \
 qt6-qttools \
 qt6-linguist \
 qt6-qttools-devel \
 qt6-qttools-libs-designer \
 qt6-qttools-libs-designercomponents \
 qt6-qttools-libs-help \
 pkgconf-pkg-config \
 qt6-qtbase \
 qt6-qtbase-devel \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"

URI_qt6-qttools-libs-designer = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qttools-libs-designer-6.8.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qttools-libs-designer = " \
 qt6-qtdeclarative \
 qt6-qttools-common \
 libgcc \
 qt6-qtbase \
 libzstd \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"

URI_qt6-qttools-libs-designercomponents = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qttools-libs-designercomponents-6.8.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qttools-libs-designercomponents = " \
 qt6-qttools-common \
 qt6-qttools-libs-designer \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"

URI_qt6-qttools-libs-help = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qttools-libs-help-6.8.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qttools-libs-help = " \
 qt6-qttools-common \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"

URI_qt6-qttools-examples = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qt6-qttools-examples-6.8.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qttools-examples = " \
 qt6-qttools \
 qt6-qttools-common \
 libgcc \
 qt6-qttools-libs-help \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"

URI_qt6-qttools-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qt6-qttools-static-6.8.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qttools-static = " \
 qt6-qttools-devel \
"

URI_qt6-qttools-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qttools-tests-6.8.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qttools-tests = " \
 qt6-qttools \
 libgcc \
 qt6-qttools-libs-help \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
 perl-interpreter \
"
