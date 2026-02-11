
PN = "cronie"
PE = "0"
PV = "1.7.0"
PR = "9.el10"
PACKAGES = "cronie cronie-anacron cronie-noanacron"


URI_cronie = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cronie-1.7.0-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cronie = "/bin/sh ( ) coreutils ( ) sed ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libpam.so.0()(64bit) ( ) libpam.so.0(LIBPAM_1.0)(64bit) ( ) libaudit.so.1()(64bit) ( ) dailyjobs ( ) libselinux ( >=  2.0.64) pam ( >=  1.0.1)"
RPROVIDES:cronie = "cronie ( =  1.7.0-9.el10) config(cronie) ( =  1.7.0-9.el10) cronie(x86-64) ( =  1.7.0-9.el10)"

URI_cronie-anacron = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cronie-anacron-1.7.0-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cronie-anacron = "/bin/sh ( ) coreutils ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) crontabs ( ) cronie ( =  1.7.0-9.el10)"
RPROVIDES:cronie-anacron = "dailyjobs ( ) anacron ( =  2.4) config(cronie-anacron) ( =  1.7.0-9.el10) cronie-anacron ( =  1.7.0-9.el10) cronie-anacron(x86-64) ( =  1.7.0-9.el10)"

URI_cronie-noanacron = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cronie-noanacron-1.7.0-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cronie-noanacron = "crontabs ( ) cronie ( =  1.7.0-9.el10)"
RPROVIDES:cronie-noanacron = "dailyjobs ( ) config(cronie-noanacron) ( =  1.7.0-9.el10) cronie-noanacron ( =  1.7.0-9.el10) cronie-noanacron(x86-64) ( =  1.7.0-9.el10)"
