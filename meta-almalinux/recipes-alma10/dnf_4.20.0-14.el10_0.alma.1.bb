
inherit dnf-bridge

PN = "dnf"
PE = "0"
PV = "4.20.0"
PR = "14.el10_0.alma.1"
PACKAGES = "dnf dnf-automatic dnf-data python3-dnf yum dnf-bootc"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/dnf-4.20.0-14.el10_0.alma.1.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_dnf = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dnf-4.20.0-14.el10_0.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_dnf}"
RDEPENDS:dnf = " \
 coreutils \
 bash \
 python3-dnf \
"

URI_dnf-automatic = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dnf-automatic-4.20.0-14.el10_0.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_dnf-automatic}"
RDEPENDS:dnf-automatic = " \
 python3 \
 systemd \
 bash \
 python3-dnf \
"

URI_dnf-data = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dnf-data-4.20.0-14.el10_0.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_dnf-data}"
RDEPENDS:dnf-data = ""

URI_python3-dnf = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-dnf-4.20.0-14.el10_0.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-dnf}"
RDEPENDS:python3-dnf = " \
 python3 \
 python3-libcomps \
 python3-libdnf \
 python3-rpm \
 libmodulemd \
 dnf-data \
 python3-hawkey \
"

URI_yum = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/yum-4.20.0-14.el10_0.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_yum}"
RDEPENDS:yum = " \
 dnf \
"

URI_dnf-bootc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dnf-bootc-4.20.0-14.el10_0.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_dnf-bootc}"
RDEPENDS:dnf-bootc = " \
 ostree-libs \
 util-linux-core \
 python3-dnf \
 python3-gobject-base \
 ostree \
"
