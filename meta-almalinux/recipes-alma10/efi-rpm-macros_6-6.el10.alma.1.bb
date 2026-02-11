
PN = "efi-rpm-macros"
PE = "0"
PV = "6"
PR = "6.el10.alma.1"
PACKAGES = "efi-filesystem efi-srpm-macros"


URI_efi-filesystem = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/efi-filesystem-6-6.el10.alma.1.noarch.rpm;unpack=0"
RDEPENDS:efi-filesystem = "
 filesystem
"

URI_efi-srpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/efi-srpm-macros-6-6.el10.alma.1.noarch.rpm;unpack=0"
RDEPENDS:efi-srpm-macros = "
 rpm
 bash
"
