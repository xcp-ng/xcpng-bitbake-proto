
PN = "greenboot"
PE = "0"
PV = "0.15.9"
PR = "1.el10_0"
PACKAGES = "greenboot greenboot-default-health-checks"


URI_greenboot = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/greenboot-0.15.9-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:greenboot = "/bin/sh ( ) systemd ( ) /usr/bin/bash ( ) rpm-ostree ( ) grub2-tools-minimal ( ) pam ( >=  1.4.0) systemd ( >=  240)"
RPROVIDES:greenboot = "greenboot-auto-update-fallback ( ) greenboot-grub2 ( ) greenboot-reboot ( ) greenboot-rpm-ostree-grub2 ( ) greenboot-status ( ) greenboot ( =  0.15.9-1.el10_0) config(greenboot) ( =  0.15.9-1.el10_0) greenboot(x86-64) ( =  0.15.9-1.el10_0)"

URI_greenboot-default-health-checks = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/greenboot-default-health-checks-0.15.9-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:greenboot-default-health-checks = "/bin/sh ( ) /usr/bin/bash ( ) util-linux ( ) jq ( ) greenboot ( =  0.15.9-1.el10_0)"
RPROVIDES:greenboot-default-health-checks = "greenboot-update-platforms-check ( ) greenboot-default-health-checks ( =  0.15.9-1.el10_0) greenboot-default-health-checks(x86-64) ( =  0.15.9-1.el10_0)"
