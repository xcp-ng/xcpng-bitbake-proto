
PN = "containers-common"
PE = "5"
PV = "0.62.0"
PR = "1.el10"
PACKAGES = "containers-common containers-common-extra"


URI_containers-common = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/containers-common-0.62.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:containers-common = " \
 container-selinux \
 netavark \
"

URI_containers-common-extra = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/containers-common-extra-0.62.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:containers-common-extra = " \
 containers-common \
 nftables \
 netavark \
 crun \
 passt \
"
