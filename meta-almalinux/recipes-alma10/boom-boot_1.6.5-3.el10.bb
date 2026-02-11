
PN = "boom-boot"
PE = "0"
PV = "1.6.5"
PR = "3.el10"
PACKAGES = "boom-boot boom-boot-conf python3-boom"


URI_boom-boot = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/boom-boot-1.6.5-3.el10.noarch.rpm;unpack=0"
RDEPENDS:boom-boot = "/usr/bin/python3 ( ) python3-dbus ( ) boom-boot-conf ( =  1.6.5-3.el10) python3-boom ( =  1.6.5-3.el10) systemd ( >=  254)"
RPROVIDES:boom-boot = "boom-boot ( =  1.6.5-3.el10)"

URI_boom-boot-conf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/boom-boot-conf-1.6.5-3.el10.noarch.rpm;unpack=0"
RDEPENDS:boom-boot-conf = ""
RPROVIDES:boom-boot-conf = "boom-boot-conf ( =  1.6.5-3.el10) config(boom-boot-conf) ( =  1.6.5-3.el10)"

URI_python3-boom = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-boom-1.6.5-3.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-boom = "/usr/bin/python3 ( ) python(abi) ( =  3.12) python3.12dist(dbus-python) ( >=  1.2.16)"
RPROVIDES:python3-boom = "python3-boom ( =  1.6.5-3.el10) python-boom ( =  1.6.5-3.el10) python3.12-boom ( =  1.6.5-3.el10) python3.12dist(boom-boot) ( =  1.6.5) python3dist(boom-boot) ( =  1.6.5)"
