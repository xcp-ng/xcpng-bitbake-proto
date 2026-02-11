
PN = "php-pecl-apcu"
PE = "0"
PV = "5.1.23"
PR = "5.el10"
PACKAGES = "apcu-panel php-pecl-apcu php-pecl-apcu-devel"


URI_apcu-panel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/apcu-panel-5.1.23-5.el10.noarch.rpm;unpack=0"
RDEPENDS:apcu-panel = "httpd ( ) php-gd ( ) php(httpd) ( ) php-pecl-apcu ( =  5.1.23-5.el10)"
RPROVIDES:apcu-panel = "apc-panel ( =  5.1.23-5.el10) apcu-panel ( =  5.1.23-5.el10) config(apcu-panel) ( =  5.1.23-5.el10)"

URI_php-pecl-apcu = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-pecl-apcu-5.1.23-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:php-pecl-apcu = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) php(api) ( =  20230831-64) php(zend-abi) ( =  20230831-64)"
RPROVIDES:php-pecl-apcu = "php-pecl-apcu ( =  5.1.23-5.el10) php-pecl-apcu(x86-64) ( =  5.1.23-5.el10) config(php-pecl-apcu) ( =  5.1.23-5.el10) php-apcu ( =  5.1.23) php-apcu(x86-64) ( =  5.1.23) php-pecl(apcu) ( =  5.1.23) php-pecl(apcu)(x86-64) ( =  5.1.23)"

URI_php-pecl-apcu-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-pecl-apcu-devel-5.1.23-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:php-pecl-apcu-devel = "php-devel(x86-64) ( ) php-pecl-apcu(x86-64) ( =  5.1.23-5.el10)"
RPROVIDES:php-pecl-apcu-devel = "php-pecl-apc-devel ( =  5.1.23-5.el10) php-pecl-apc-devel(x86-64) ( =  5.1.23-5.el10) php-pecl-apcu-devel ( =  5.1.23-5.el10) php-pecl-apcu-devel(x86-64) ( =  5.1.23-5.el10)"
