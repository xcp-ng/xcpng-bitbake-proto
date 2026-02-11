
PN = "fonts-rpm-macros"
PE = "1"
PV = "2.0.5"
PR = "18.el10"
PACKAGES = "fonts-filesystem fonts-srpm-macros fonts-rpm-macros fonts-rpm-templates"


URI_fonts-filesystem = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/fonts-filesystem-2.0.5-18.el10.noarch.rpm;unpack=0"
RDEPENDS:fonts-filesystem = ""

URI_fonts-srpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fonts-srpm-macros-2.0.5-18.el10.noarch.rpm;unpack=0"
RDEPENDS:fonts-srpm-macros = " \
 redhat-rpm-config \
 forge-srpm-macros \
"

URI_fonts-rpm-macros = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/fonts-rpm-macros-2.0.5-18.el10.noarch.rpm;unpack=0"
RDEPENDS:fonts-rpm-macros = " \
 python3 \
 fonts-filesystem \
 fontconfig \
 fonts-srpm-macros \
 python3-lxml \
 uchardet \
 libappstream-glib \
"

URI_fonts-rpm-templates = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/fonts-rpm-templates-2.0.5-18.el10.noarch.rpm;unpack=0"
RDEPENDS:fonts-rpm-templates = " \
 fonts-rpm-macros \
"
