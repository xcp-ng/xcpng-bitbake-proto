
PN = "rhel-system-roles"
PE = "0"
PV = "1.95.7"
PR = "0.1.el10_0"
PACKAGES = "rhel-system-roles"


URI_rhel-system-roles = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rhel-system-roles-1.95.7-0.1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:rhel-system-roles = "/bin/sh ( ) /usr/bin/env ( ) /usr/bin/python ( ) /bin/bash ( ) ansible-core ( or  (REL))"
RPROVIDES:rhel-system-roles = "ansible-collection(redhat.rhel_system_roles) ( =  1.95.7) ansible-collection-redhat-rhel_system_roles ( =  1.95.7-0.1.el10_0) bundled(ansible-collection(ansible.posix)) ( =  2.0.0) bundled(ansible-collection(community.general)) ( =  10.4.0) bundled(ansible-collection(containers.podman)) ( =  1.16.3) rhel-system-roles ( =  1.95.7-0.1.el10_0)"
