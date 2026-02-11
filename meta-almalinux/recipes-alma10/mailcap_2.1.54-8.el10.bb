
PN = "mailcap"
PE = "0"
PV = "2.1.54"
PR = "8.el10"
PACKAGES = "mailcap nginx-mimetypes"


URI_mailcap = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/mailcap-2.1.54-8.el10.noarch.rpm;unpack=0"
RDEPENDS:mailcap = ""
RPROVIDES:mailcap = "config(mailcap) ( =  2.1.54-8.el10) mailcap ( =  2.1.54-8.el10)"

URI_nginx-mimetypes = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/nginx-mimetypes-2.1.54-8.el10.noarch.rpm;unpack=0"
RDEPENDS:nginx-mimetypes = "nginx-filesystem ( )"
RPROVIDES:nginx-mimetypes = "config(nginx-mimetypes) ( =  2.1.54-8.el10) nginx-mimetypes ( =  2.1.54-8.el10)"
