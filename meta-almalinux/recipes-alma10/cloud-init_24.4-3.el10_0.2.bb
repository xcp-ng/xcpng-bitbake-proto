
PN = "cloud-init"
PE = "0"
PV = "24.4"
PR = "3.el10_0.2"
PACKAGES = "cloud-init"


URI_cloud-init = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cloud-init-24.4-3.el10_0.2.noarch.rpm;unpack=0"
RDEPENDS:cloud-init = "/bin/sh ( ) systemd ( ) /usr/bin/sh ( ) /usr/bin/python3 ( ) shadow-utils ( ) util-linux ( ) python3-requests ( ) openssl ( ) iproute ( ) e2fsprogs ( ) xfsprogs ( ) python3-libselinux ( ) python3-oauthlib ( ) python3.12dist(requests) ( ) python3-jinja2 ( ) hostname ( ) python3.12dist(pyyaml) ( ) procps ( ) python3-pyserial ( ) dhcpcd ( ) policycoreutils-python3 ( ) python3-configobj ( ) python3-jsonpatch ( ) python3.12dist(jinja2) ( ) python3.12dist(oauthlib) ( ) python3.12dist(configobj) ( ) python3.12dist(jsonpatch) ( ) python3-PyYAML ( ) python(abi) ( =  3.12)"
RPROVIDES:cloud-init = "python3.12dist(cloud-init) ( =  24.4) python3dist(cloud-init) ( =  24.4) cloud-init ( =  24.4-3.el10_0.2) config(cloud-init) ( =  24.4-3.el10_0.2)"
