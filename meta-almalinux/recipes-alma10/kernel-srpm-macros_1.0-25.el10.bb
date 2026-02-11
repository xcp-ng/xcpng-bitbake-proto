
PN = "kernel-srpm-macros"
PE = "0"
PV = "1.0"
PR = "25.el10"
PACKAGES = "kernel-rpm-macros kernel-srpm-macros"


URI_kernel-rpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/kernel-rpm-macros-205-25.el10.noarch.rpm;unpack=0"
RDEPENDS:kernel-rpm-macros = "/usr/bin/sh ( ) /usr/bin/bash ( ) /usr/bin/perl ( ) /usr/bin/find ( ) /usr/bin/grep ( ) /usr/bin/sed ( ) /usr/sbin/modprobe ( ) /usr/bin/awk ( ) /usr/bin/nm ( ) /usr/bin/objdump ( ) /usr/bin/readelf ( ) /usr/bin/xz ( ) /usr/sbin/modinfo ( ) redhat-rpm-config ( >=  205)"
RPROVIDES:kernel-rpm-macros = "rpm_macro(kernel_module_package) ( ) rpm_macro(kernel_module_package_buildreqs) ( ) kernel-rpm-macros ( =  205-25.el10)"

URI_kernel-srpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/kernel-srpm-macros-1.0-25.el10.noarch.rpm;unpack=0"
RDEPENDS:kernel-srpm-macros = ""
RPROVIDES:kernel-srpm-macros = "rpm_macro(kernel_arches) ( ) kernel-srpm-macros ( =  1.0-25.el10)"
