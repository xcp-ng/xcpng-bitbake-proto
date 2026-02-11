
PN = "rpmdevtools"
PE = "0"
PV = "9.6"
PR = "9.el10"
PACKAGES = "rpmdevtools"


URI_rpmdevtools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rpmdevtools-9.6-9.el10.noarch.rpm;unpack=0"
RDEPENDS:rpmdevtools = "
 python3
 emacs-filesystem
 python3-requests
 python3-rpm
 diffutils
 gawk
 grep
 curl
 python3-argcomplete
 rpm-build
 bash
 sed
 file
 findutils
"
