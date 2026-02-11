
PN = "almalinux-logos"
PE = "0"
PV = "100.3"
PR = "3.el10_0"
PACKAGES = "almalinux-backgrounds almalinux-logos almalinux-logos-httpd almalinux-logos-ipa"


URI_almalinux-backgrounds = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/almalinux-backgrounds-100.3-3.el10_0.noarch.rpm;unpack=0"
RDEPENDS:almalinux-backgrounds = "almalinux-logos ( =  100.3-3.el10_0)"
RPROVIDES:almalinux-backgrounds = "almalinux-backgrounds ( =  100.3-3.el10_0) system-backgrounds ( =  100.3-3.el10_0)"

URI_almalinux-logos = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/almalinux-logos-100.3-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:almalinux-logos = "/bin/sh ( ) coreutils ( )"
RPROVIDES:almalinux-logos = "almalinux-logos ( =  100.3-3.el10_0) almalinux-logos(x86-64) ( =  100.3-3.el10_0) config(almalinux-logos) ( =  100.3-3.el10_0) redhat-logos ( =  100.3-3.el10_0) system-logos ( =  100.3-3.el10_0)"

URI_almalinux-logos-httpd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/almalinux-logos-httpd-100.3-3.el10_0.noarch.rpm;unpack=0"
RDEPENDS:almalinux-logos-httpd = ""
RPROVIDES:almalinux-logos-httpd = "system-logos(httpd-logo-ng) ( ) almalinux-logos-httpd ( =  100.3-3.el10_0) redhat-logos-httpd ( =  100.3-3.el10_0) system-logos-httpd ( =  100.3-3.el10_0)"

URI_almalinux-logos-ipa = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/almalinux-logos-ipa-100.3-3.el10_0.noarch.rpm;unpack=0"
RDEPENDS:almalinux-logos-ipa = ""
RPROVIDES:almalinux-logos-ipa = "almalinux-logos-ipa ( =  100.3-3.el10_0) redhat-logos-ipa ( =  100.3-3.el10_0) system-logos-ipa ( =  100.3-3.el10_0)"
