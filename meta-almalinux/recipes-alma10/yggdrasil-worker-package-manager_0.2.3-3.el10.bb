
inherit dnf-bridge

PN = "yggdrasil-worker-package-manager"
PE = "0"
PV = "0.2.3"
PR = "3.el10"
PACKAGES = "yggdrasil-worker-package-manager"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/yggdrasil-worker-package-manager-0.2.3-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_yggdrasil-worker-package-manager = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/yggdrasil-worker-package-manager-0.2.3-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_yggdrasil-worker-package-manager}"
RDEPENDS:yggdrasil-worker-package-manager = " \
 glibc \
 bash \
"
