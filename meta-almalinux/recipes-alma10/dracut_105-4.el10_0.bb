
inherit dnf-bridge

PN = "dracut"
PE = "0"
PV = "105"
PR = "4.el10_0"
PACKAGES = "dracut dracut-config-generic dracut-config-rescue dracut-network dracut-squash dracut-tools dracut-caps dracut-live"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/dracut-105-4.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_dracut = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dracut-105-4.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dracut}"
RDEPENDS:dracut = " \
 systemd \
 kmod \
 kmod-libs \
 systemd-udev \
 util-linux \
 sed \
 xz \
 openssl-libs \
 libgcc \
 grep \
 bash \
 filesystem \
 findutils \
 glibc \
 libkcapi-hmaccalc \
 gzip \
 procps-ng \
 coreutils \
 cpio \
"

URI_dracut-config-generic = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dracut-config-generic-105-4.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dracut-config-generic}"
RDEPENDS:dracut-config-generic = " \
 dracut \
"

URI_dracut-config-rescue = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dracut-config-rescue-105-4.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dracut-config-rescue}"
RDEPENDS:dracut-config-rescue = " \
 bash \
 dracut \
"

URI_dracut-network = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dracut-network-105-4.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dracut-network}"
RDEPENDS:dracut-network = " \
 iproute \
 NetworkManager \
 jq \
 iputils \
 bash \
 dracut \
"

URI_dracut-squash = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dracut-squash-105-4.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dracut-squash}"
RDEPENDS:dracut-squash = " \
 erofs-utils \
 bash \
 dracut \
"

URI_dracut-tools = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dracut-tools-105-4.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dracut-tools}"
RDEPENDS:dracut-tools = " \
 bash \
 dracut \
"

URI_dracut-caps = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dracut-caps-105-4.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dracut-caps}"
RDEPENDS:dracut-caps = " \
 bash \
 dracut \
 libcap \
"

URI_dracut-live = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dracut-live-105-4.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dracut-live}"
RDEPENDS:dracut-live = " \
 device-mapper \
 gzip \
 tar \
 curl \
 parted \
 bash \
 dracut \
 dracut-network \
 coreutils \
"
