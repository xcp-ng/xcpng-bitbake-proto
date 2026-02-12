
inherit dnf-bridge

PN = "nvme-cli"
PE = "0"
PV = "2.11"
PR = "6.el10_0"
PACKAGES = "nvme-cli"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/nvme-cli-2.11-6.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_nvme-cli = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/nvme-cli-2.11-6.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_nvme-cli}"
RDEPENDS:nvme-cli = " \
 util-linux \
 libgcc \
 json-c \
 bash \
 glibc \
 libnvme \
"
