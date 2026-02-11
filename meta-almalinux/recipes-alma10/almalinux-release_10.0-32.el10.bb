
PN = "almalinux-release"
PE = "0"
PV = "10.0"
PR = "32.el10"
PACKAGES = "almalinux-gpg-keys almalinux-release almalinux-repos almalinux-sb-certs"


URI_almalinux-gpg-keys = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/almalinux-gpg-keys-10.0-32.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:almalinux-gpg-keys = ""
RPROVIDES:almalinux-gpg-keys = "almalinux-gpg-keys ( =  10.0-32.el10) almalinux-gpg-keys(x86-64) ( =  10.0-32.el10) centos-gpg-keys ( =  10.0-32.el10)"

URI_almalinux-release = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/almalinux-release-10.0-32.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:almalinux-release = "almalinux-repos ( =  10.0-32.el10)"
RPROVIDES:almalinux-release = "base-module(platform:el10) ( ) centos-release-eula ( ) redhat-release-eula ( ) rpm_macro(almalinux) ( ) rpm_macro(almalinux_ver) ( ) rpm_macro(centos) ( ) rpm_macro(centos_ver) ( ) rpm_macro(dist) ( ) rpm_macro(dist_bug_report_url) ( ) rpm_macro(dist_home_url) ( ) rpm_macro(dist_name) ( ) rpm_macro(dist_vendor) ( ) rpm_macro(distcore) ( ) rpm_macro(el10) ( ) rpm_macro(rhel) ( ) system-release(releasever) ( =  10) system-release(releasever_major) ( =  10) system-release(releasever_minor) ( =  0) almalinux-release ( =  10.0-32.el10) almalinux-release(x86-64) ( =  10.0-32.el10) centos-release ( =  10.0-32.el10) config(almalinux-release) ( =  10.0-32.el10) redhat-release ( =  10.0-32.el10) system-release ( =  10.0-32.el10)"

URI_almalinux-repos = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/almalinux-repos-10.0-32.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:almalinux-repos = "almalinux-gpg-keys ( =  10.0-32.el10) almalinux-release ( =  10.0-32.el10)"
RPROVIDES:almalinux-repos = "almalinux-repos ( =  10.0-32.el10) almalinux-repos(x86-64) ( =  10.0-32.el10) centos-stream-repos ( =  10.0-32.el10) config(almalinux-repos) ( =  10.0-32.el10)"

URI_almalinux-sb-certs = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/almalinux-sb-certs-10.0-32.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:almalinux-sb-certs = ""
RPROVIDES:almalinux-sb-certs = "almalinux-sb-certs ( =  10.0-32.el10) almalinux-sb-certs(x86-64) ( =  10.0-32.el10) centos-sb-certs ( =  10.0-32.el10) redhat-sb-certs ( =  10.0-32.el10) system-sb-certs ( =  10.0-32.el10)"
