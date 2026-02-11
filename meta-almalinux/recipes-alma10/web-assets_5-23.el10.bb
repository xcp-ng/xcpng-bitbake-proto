
PN = "web-assets"
PE = "0"
PV = "5"
PR = "23.el10"
PACKAGES = "web-assets-filesystem web-assets-devel web-assets-httpd web-assets-nginx"


URI_web-assets-filesystem = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/web-assets-filesystem-5-23.el10.noarch.rpm;unpack=0"
RDEPENDS:web-assets-filesystem = "fonts-filesystem ( )"
RPROVIDES:web-assets-filesystem = "web-assets-filesystem ( =  5-23.el10)"

URI_web-assets-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/web-assets-devel-5-23.el10.noarch.rpm;unpack=0"
RDEPENDS:web-assets-devel = "web-assets-filesystem ( =  5-23.el10)"
RPROVIDES:web-assets-devel = "rpm_macro(_jsdir) ( ) rpm_macro(_webassetdir) ( ) rpm_macro(js_includes) ( ) web-assets-devel ( =  5-23.el10)"

URI_web-assets-httpd = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/web-assets-httpd-5-23.el10.noarch.rpm;unpack=0"
RDEPENDS:web-assets-httpd = "/bin/sh ( ) httpd ( ) web-assets-filesystem ( =  5-23.el10)"
RPROVIDES:web-assets-httpd = "config(web-assets-httpd) ( =  5-23.el10) web-assets-httpd ( =  5-23.el10)"

URI_web-assets-nginx = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/web-assets-nginx-5-23.el10.noarch.rpm;unpack=0"
RDEPENDS:web-assets-nginx = "/bin/sh ( ) nginx ( ) web-assets-filesystem ( =  5-23.el10)"
RPROVIDES:web-assets-nginx = "config(web-assets-nginx) ( =  5-23.el10) web-assets-nginx ( =  5-23.el10)"
