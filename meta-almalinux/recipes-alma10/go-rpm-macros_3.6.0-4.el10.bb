
inherit dnf-bridge

PN = "go-rpm-macros"
PE = "0"
PV = "3.6.0"
PR = "4.el10"
PACKAGES = "go-filesystem go-rpm-macros go-rpm-templates go-srpm-macros"


URI_go-filesystem = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/go-filesystem-3.6.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:go-filesystem = ""

URI_go-rpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/go-rpm-macros-3.6.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:go-rpm-macros = " \
 python3 \
 go-filesystem \
 go-srpm-macros \
 bash \
 glibc \
 golang \
"

URI_go-rpm-templates = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/go-rpm-templates-3.6.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:go-rpm-templates = " \
 go-rpm-macros \
"

URI_go-srpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/go-srpm-macros-3.6.0-4.el10.noarch.rpm;unpack=0"
RDEPENDS:go-srpm-macros = " \
 redhat-rpm-config \
"
