
inherit dnf-bridge

PN = "almalinux-logos"
PE = "0"
PV = "100.3"
PR = "3.el10_0"
PACKAGES = "almalinux-backgrounds almalinux-logos almalinux-logos-httpd almalinux-logos-ipa"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/almalinux-logos-100.3-3.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_almalinux-backgrounds = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/almalinux-backgrounds-100.3-3.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_almalinux-backgrounds}"
RDEPENDS:almalinux-backgrounds = " \
 almalinux-logos \
"

URI_almalinux-logos = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/almalinux-logos-100.3-3.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_almalinux-logos}"
RDEPENDS:almalinux-logos = " \
 coreutils \
 bash \
"

URI_almalinux-logos-httpd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/almalinux-logos-httpd-100.3-3.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_almalinux-logos-httpd}"
RDEPENDS:almalinux-logos-httpd = ""

URI_almalinux-logos-ipa = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/almalinux-logos-ipa-100.3-3.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_almalinux-logos-ipa}"
RDEPENDS:almalinux-logos-ipa = ""
