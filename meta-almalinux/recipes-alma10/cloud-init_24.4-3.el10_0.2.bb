
PN = "cloud-init"
PE = "0"
PV = "24.4"
PR = "3.el10_0.2"
PACKAGES = "cloud-init"


URI_cloud-init = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cloud-init-24.4-3.el10_0.2.noarch.rpm;unpack=0"
RDEPENDS:cloud-init = "
 python3
 systemd
 iproute
 python3-jinja2
 python3-jsonpatch
 util-linux
 dhcpcd
 python3-libselinux
 xfsprogs
 e2fsprogs
 python3-oauthlib
 shadow-utils
 python3-requests
 python3-pyyaml
 openssl
 bash
 python3-policycoreutils
 hostname
 python3-configobj
 python3-pyserial
 procps-ng
"
