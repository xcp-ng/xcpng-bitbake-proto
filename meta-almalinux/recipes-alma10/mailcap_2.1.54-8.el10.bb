
inherit dnf-bridge

PN = "mailcap"
PE = "0"
PV = "2.1.54"
PR = "8.el10"
PACKAGES = "mailcap nginx-mimetypes"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/mailcap-2.1.54-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_mailcap = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/mailcap-2.1.54-8.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_mailcap}"
RDEPENDS:mailcap = ""

URI_nginx-mimetypes = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/nginx-mimetypes-2.1.54-8.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_nginx-mimetypes}"
RDEPENDS:nginx-mimetypes = " \
 nginx-filesystem \
"
